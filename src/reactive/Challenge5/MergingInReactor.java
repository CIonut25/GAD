package reactive.Challenge5;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

public class MergingInReactor {
    private static List<String> words1 = Arrays.asList(
            "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    private static List<String> words2 = Arrays.asList(
            "the",
            "quick",
            "brown",
            "fox",
            "jumped",
            "over",
            "the",
            "lazy",
            "dog"
    );

    // TODO Merge flux1 and flux2 values with interleave
    static Flux<String> mergeFluxWithInterleave(Flux<String> flux1, Flux<String> flux2) {
        return Flux.zip(flux1, flux2, (word1, word2) -> word1 + " " + word2);
    }

    // TODO Merge flux1 and flux2 values with no interleave (flux1 values and then flux2 values)
    static Flux<String> mergeFluxWithNoInterleave(Flux<String> flux1, Flux<String> flux2) {
        return Flux.concat(flux1, flux2);
    }
    // TODO Create a Flux containing the value of mono1 then the value of mono2
    static Flux<String> createFluxFromMultipleMono(Mono<String> mono1, Mono<String> mono2) {
        return mono1.flux().concatWith(mono2.flux());
    }

    public static void main(String[] args) {
        Flux<String> flux1 = Flux.fromIterable(words1);
        Flux<String> flux2 = Flux.fromIterable(words2);

        Flux<String> mergedFlux = mergeFluxWithNoInterleave(flux1, flux2);

        mergedFlux.subscribe(System.out::println);

    }

}
