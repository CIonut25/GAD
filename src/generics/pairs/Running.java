package generics.pairs;

public class Running implements Shoe {
    String color;
    int size;

    public Running(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String getColor() {
       return this.color;
    }

    @Override
    public int getSize() {
        return this.size;
    }

}
