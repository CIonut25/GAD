package exception;

public class NumberNotEvenException extends Exception{
    public  NumberNotEvenException() {
        super("Please insert an even number");
    }
}
