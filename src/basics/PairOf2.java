package basics;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PairOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPairs = 0;
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < 1; i++) {
            for (int j = 1; j < numbers.size(); j++) {
                if (numbers.get(i) + numbers.get(j) == 0){
                    numOfPairs++;
                    numbers.remove(numbers.get(i));
                    numbers.remove(numbers.get(j - 1));
                    j = 0;
                }

            }
        }
        System.out.println(numOfPairs);
    }
}
