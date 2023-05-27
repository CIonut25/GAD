package collections.hashTable;

public interface MyHashTable<K,V> {
    V get(K key);
    void put(K key, V value);
    void remove(K key);

    void remove(String key);

    boolean containsKey(K key);
    int size();
}
