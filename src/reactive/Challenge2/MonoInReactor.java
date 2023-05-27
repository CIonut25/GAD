package reactive.Challenge2;

import reactor.core.publisher.Mono;

public class MonoInReactor {
    // TODO Return an empty Mono
    Mono<String> emptyMono() {
        return Mono.empty();
    }

    // TODO Return a Mono that never emits any signal
    Mono<String> monoWithNoSignal() {
        return Mono.never();
    }

    // TODO Return a Mono that contains a "foo" value
    Mono<String> fooMono() {
        return Mono.just("foo");
    }

    // TODO Create a Mono that emits an IllegalStateException
    Mono<String> errorMono() {
        return Mono.error(new IllegalStateException());
    }

    public static void main(String[] args) {
        MonoInReactor obj = new MonoInReactor();

        Mono<String> mono = obj.fooMono();
        mono.subscribe(System.out::println);
    }

}
