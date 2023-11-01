package Hw3_21000709_HoangTuanTu.exercise02;

public interface List<T> extends Iterable <T>{
    public void add(T data);
    public void add(int index, T data);
    public T get(int i);

    public void set(int i, T data);

    public void remove(T data);
    public void remove(int index);

    public boolean isContain(T data);

    public int size();

    public boolean isEmpty();

    public String toString();

    public int indexOf(T object);
}
