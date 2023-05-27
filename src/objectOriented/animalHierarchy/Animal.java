package objectOriented.animalHierarchy;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();
    public void walk() {
        System.out.println("This animal is walking using " + this.legs +" legs.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "legs=" + legs +
                '}';
    }
}
