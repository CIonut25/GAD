package reactive.Challenge1;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class FluxInReactor {

        // TODO Return an empty Flux
        Flux<String> emptyFlux() {
            return Flux.empty();
        }

// TODO Return a Flux that contains 2 values "foo" and "bar" without using an array or a collection
        Flux<String> fooBarFluxFromValues() {
            return Flux.just("foo", "bar");
        }

// TODO Create a Flux from a List that contains 2 values "foo" and "bar"
        Flux<String> fooBarFluxFromList() {
            List<String> list = Arrays.asList("foo", "bar");
            return Flux.fromIterable(list);
        }

// TODO Create a Flux that emits an IllegalStateException
        Flux<String> errorFlux() {
            return Flux.error(new IllegalStateException());
        }

// TODO Create a Flux that emits increasing values from 0 to 9 each 100ms
       static Flux<Long> counter() {
           return Flux.interval(Duration.ofMillis(100))
                    .map(i -> Long.parseLong(String.valueOf(i)))
                   .take(10)
                    ;

        }

    public static void main(String[] args) throws InterruptedException {
        Flux<Long> counter = counter();
        counter.subscribe(System.out::println);

        Thread.sleep(1000);

    }
}

