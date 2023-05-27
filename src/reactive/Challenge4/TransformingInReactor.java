package reactive.Challenge4;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

public class TransformingInReactor {

    // TODO Capitalize the user username, firstname and lastname
    static Mono<User> capitalizeOne(Mono<User> mono) {
        return mono.map(user -> new User(
                user.getFirstName().toUpperCase(),
                user.getLastName().toUpperCase(),
                user.getUsername().toUpperCase()
        ));
    }

    // TODO Capitalize the users username, firstName and lastName
    static Flux<User> capitalizeMany(Flux<User> flux) {
        return flux.map(user -> new User(
                user.getFirstName().toUpperCase(),
                user.getLastName().toUpperCase(),
                user.getUsername().toUpperCase()
        ));
    }

    // TODO Capitalize the users username, firstName and lastName using asyncCapitalizeUser
    static Flux<User> asyncCapitalizeMany(Flux<User> flux) {
        return flux.flatMap(user -> asyncCapitalizeUser(user).subscribeOn(Schedulers.parallel()));
    }

    static Mono<User> asyncCapitalizeUser(User u) {
        return Mono.just(new User(u.getFirstName().toUpperCase(), u.getLastName().toUpperCase(), u.getUsername().toUpperCase()));
    }

    public static void main(String[] args)  {
        Mono<User> usersMono = Mono.just(
                new User("John", "Peterson", "jPeterson")
        );

        Mono<User> capitalizeUsers = capitalizeOne(usersMono);

        capitalizeUsers.subscribe(System.out::println);

    }

}
