package patterns.codeChallenges.strategy;

import java.util.Arrays;

public class Main {
    public static void displaySorted(SortingStrategy strategy, Integer[] arrResult) {
        strategy.sort(arrResult);
        for (Integer integer : arrResult) {
            System.out.print(integer + " ");
        }

    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1,4,5,2,3,6,9,8,7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);

        displaySorted(new BubbleSort(), copy01OfArr);
    }
}
