package Hw6_21000709_HoangTuanTu.excercise01;

public interface PriorityQueue<K, E> {
    int size();
    boolean isEmpty();
    void insert(Entry<K, E> entry);
    void insert(K k, E e);
    Entry<K, E> removeMin();
    Entry<K, E> min();
}
