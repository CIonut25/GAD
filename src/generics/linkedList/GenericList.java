package generics.linkedList;

import java.util.ArrayList;
import java.util.List;

public class GenericList<T> implements IGenericList<T>{
    private List<T> list;
    private T value;
    public GenericList(T value) {
        this.list = new ArrayList<>();
        this.value = value;
    }

    @Override
    public void insert(T element) {
        this.list.add(element);
    }

    @Override
    public void println() {
        for (T t : list) {
            System.out.print(t + " ");
        }

    }
}
