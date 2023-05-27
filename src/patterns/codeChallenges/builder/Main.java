package patterns.codeChallenges.builder;

public class Main {
    public static void main(String[] args) {

        Person.Builder pers = new Person.Builder("Adrian")
                .setJob("IT")
                .setUniversity("Alexandru Ioan Cuza")
                .setDrivingLicense("Yes")
                .setMarried(false);

        Person person = pers.build();
        System.out.println(person);
    }
}
