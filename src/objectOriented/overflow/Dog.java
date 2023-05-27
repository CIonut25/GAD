package objectOriented.overflow;

public class Dog {
    public void bark() {
        barkMany(1);
    }
    public void barkMany(int n) {
        for(int i = 0; i < n; i++) {
            System.out.println("bau");
        }
    }
}
