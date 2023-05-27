package basics;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PairOf3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPairs = 0;
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < 1; i++) {
            for (int j = 1; j < numbers.size(); j++) {
                for (int k = 2; k < numbers.size(); k++) {
                    if (numbers.get(i) + numbers.get(j) + numbers.get(k)== 0){
                        numOfPairs++;
                        numbers.remove(numbers.get(i));
                        numbers.remove(numbers.get(j - 1));
                        numbers.remove(numbers.get(k - 2));
                        j = 0;
                        k = 1;
                    }
                }

            }
        }
        System.out.println(numOfPairs);
    }
}
