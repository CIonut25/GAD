package collections.leaders;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(2,4,77,6,2,9,0,4));
        Integer currentMax = list.get(list.size() - 1);
        System.out.println(currentMax);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (currentMax < list.get(i)) {
                currentMax = list.get(i);
                System.out.println(currentMax);
            }

        }

    }
}
