package generics.iterator;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1,2,3};
        IArrayIterator<Integer> it = new ArrayIterator<>(arr);
        int counter = 0;
        while (it.hasNext()) {
            if (counter == arr.length - 1) {
                System.out.print(it.next());
            }else {
                System.out.print(it.next() + ",");
            }
            counter++;
        }
    }
}
