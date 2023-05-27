package lambda.challenge3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem5 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Thread thread = new Thread(() -> {
            for (Integer number : numbers) {
                System.out.println(number);
            }
        });

        thread.start();
    }
}
