package concurrency.rabbitRace;

public class Main {
    public static void main(String[] args) {


        Thread[] rabbits = new Thread[10];
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                rabbits[i] = new RabbitThread(i / 2);
                rabbits[i].start();
            } else {
                rabbits[i] = new Thread(new RabbitRunnable((i - 1) / 2));
                rabbits[i].start();
            }
        }

       /* Thread[] rabbits = new Thread[10];

        for (int i = 0; i < rabbits.length; i += 2) {
            rabbits[i] = new RabbitThread(i / 2 + 1);
        }

        for (int i = 1; i < rabbits.length; i += 2) {
            rabbits[i] = new Thread(new RabbitRunnable(i / 2 + 1));
        } */



    }
}
