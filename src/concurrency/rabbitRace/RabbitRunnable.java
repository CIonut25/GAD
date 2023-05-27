package concurrency.rabbitRace;

public class RabbitRunnable implements Runnable{ //odd
    private int nr;
    public RabbitRunnable(int nr)  {
        this.nr = nr;
    }


    @Override
    public void run() {

        System.out.println("Rabbit #" + nr + " is running");
    }
}
