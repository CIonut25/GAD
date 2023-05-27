package collections.mergeSortedLists;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(List.of(1,5,6));
        LinkedList<Integer> list2 = new LinkedList<>(List.of(2,3,4));
        System.out.println(merge(list1, list2));

    }

    static LinkedList<Integer> merge(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> mergeList = new LinkedList<>();
        mergeList.add(list1.get(0));
        for (int i = 0; i < list2.size(); i++) {
            mergeList.add(list2.get(i));
        }

        for (int i = 1; i < list1.size(); i++) {
            mergeList.add(list1.get(i));
        }


        return mergeList;
    }
}
