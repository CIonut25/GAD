package concurrency.rabbitRace;

public class RabbitThread extends Thread{ // even
    private int nr;

    public RabbitThread(int nr) {
        this.nr = nr;
    }

    @Override
    public void run() {
        System.out.println("Rabbit #" + nr + " is running");
    }
}
