package collections.myArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1,4,5,6));
        MyArrayList<Integer> numbers = new MyArrayListImpl<>(list);
        System.out.println(numbers.size());
        numbers.add(7);
        numbers.remove(4);
        System.out.println(numbers.get(0));
        numbers.set(2,9);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
        System.out.println(numbers.size());
    }
}
