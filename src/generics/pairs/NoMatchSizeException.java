package generics.pairs;

public class NoMatchSizeException extends Exception{
    public NoMatchSizeException() {
        System.out.println("Sizes are different");
    }
}
