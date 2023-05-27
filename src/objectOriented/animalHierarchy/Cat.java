package objectOriented.animalHierarchy;

public class Cat extends Animal implements Pet{
    private String petName;

    public Cat(String petName) {
        super(4);
        this.petName = petName;
    }

    public Cat() {
        this("");
    }
    @Override
    public void eat() {
        System.out.println("The cat is eating");
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public String getName() {
        return this.getPetName();
    }

    @Override
    public void setName(String name) {
        this.setPetName(name);
    }

    @Override
    public void play() {
        System.out.println("The cat is playing");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "legs=" + legs +
                ", petName='" + petName + '\'' +
                '}';
    }
}
