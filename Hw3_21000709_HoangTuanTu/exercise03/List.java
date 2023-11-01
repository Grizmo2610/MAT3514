package Hw3_21000709_HoangTuanTu.exercise03;

public interface List<T> {

    void add(T data);

    void addBot(T data);

    T removeTop();

    T removeBot();

    int size();

    String toString();

    T get(int index);

    void set(int index, T data);

    boolean isContain(T data);

    boolean isEmpty();

    void removeValue(T data);

    void remove(int index);

    void insert(int index, T data);

}
