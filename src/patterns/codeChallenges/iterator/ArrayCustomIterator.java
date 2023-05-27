package patterns.codeChallenges.iterator;


public class ArrayCustomIterator {
    private int[] list;
    private int position;

    public ArrayCustomIterator(int[] list) {
        this.list = list;
    }

    public boolean hasNext() {
        return (this.position < list.length);
    }
    public int next() {
        return list[this.position++];
    }
}
