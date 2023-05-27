package generics.pairs;

public class Pair<T extends Shoe> {
    private T first;
    private T second;

    public Pair(T first, T second) throws NoMatchColorException, NoMatchSizeException {
        this.first = first;
        this.second = second;

        if (!first.getColor().equals(second.getColor())) {
            throw new NoMatchColorException();
        }
        if (first.getSize() != second.getSize()) {
            throw new NoMatchSizeException();
        }
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

}
