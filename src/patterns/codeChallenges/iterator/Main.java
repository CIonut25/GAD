package patterns.codeChallenges.iterator;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        int counter = 1;
        while (it.hasNext()) {
            if (counter == arr.length){
                System.out.print(it.next());
            }else {
                System.out.print(it.next() + ", ");
                counter++;
            }
        }
    }
}
