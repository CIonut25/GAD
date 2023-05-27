package objectOriented.animalHierarchy;

public class Spider extends Animal{

    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("The spider is eating!");
    }

    @Override
    public String toString() {
        return "Spider{" +
                "legs=" + legs +
                '}';
    }
}
