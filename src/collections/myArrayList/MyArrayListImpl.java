package collections.myArrayList;

import java.util.List;

public class MyArrayListImpl<T> implements MyArrayList<T>{

    private List<T> list;

    public MyArrayListImpl(List<T> list) {
        this.list = list;
    }

    @Override
    public void add(T e) {
        list.add(e);
    }

    @Override
    public void remove(T e) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == e) {
                list.remove(e);
            }
        }
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public void set(int index, T e) {
        list.set(index, e);
    }

    @Override
    public int size() {
        return list.size();
    }
}
