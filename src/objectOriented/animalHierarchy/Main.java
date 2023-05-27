package objectOriented.animalHierarchy;

public class Main {
    public static Object testAnimals(Object obj) {
        return obj;
    }
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        System.out.println(testAnimals(d));
        d.walk();
        d.eat();
        System.out.println(testAnimals(c));
        c.walk();
        c.eat();
        c.play();
        System.out.println(testAnimals(a));
        a.walk();
        a.eat();
        System.out.println(testAnimals(e));
        e.walk();
        e.eat();
        System.out.println(testAnimals(p));
        p.setName("Guffy");
        System.out.println(p.getName());
        p.play();
    }
}
