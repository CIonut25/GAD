package objectOriented.animalHierarchy;

public class Fish extends Animal{
    public Fish() {
        super(0);
    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk and don't have legs.");
    }

    @Override
    public void eat() {
        System.out.println("The fish is eating!");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "legs=" + legs +
                '}';
    }
}
