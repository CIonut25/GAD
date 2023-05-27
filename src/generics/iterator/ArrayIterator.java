package generics.iterator;

public class ArrayIterator<T> implements IArrayIterator<T>{

    private T[] list;
    private int position;

    public ArrayIterator(T[] list) {
        this.list = list;
    }

    public boolean hasNext() {
        return (this.position < list.length);
    }
    public T next() {
        return list[this.position++];
    }
}
