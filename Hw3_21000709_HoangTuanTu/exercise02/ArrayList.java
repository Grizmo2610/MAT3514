package Hw3_21000709_HoangTuanTu.exercise02;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class ArrayList<T> implements List<T> {
    private T[] container = (T[]) new Object[10];
    private int size = 0;

    public ArrayList() {
    }

    public ArrayList(T[] array){
        container = (T[]) new Object[array.length * 2];
        System.arraycopy(array, 0, container, 0, array.length);
        size = array.length;
    }

    private T[] expand() {
        T[] newArray = (T[])new Object[size * 2];
        System.arraycopy(container, 0, newArray, 0, size);
        return newArray;
    }

    @Override
    public void add(T data) {
        container[size] = data;
        size++;
        if (size >= container.length - 5){
            container = expand();
        }
    }

    @Override
    public void add(int index, T data){
        for (int i = size; i > index; i--){
            container[i] = container[i-1];
        }
        size++;
        container[index] = data;
    }

    @Override
    public T get(int i) {
        return container[i];
    }

    @Override
    public void set(int i, T data) {
        container[i] = data;
    }

    @Override
    public void remove(int index){
        for (int i = 0; i < size; i++){
            container[i] = container[i + 1];
        }
        size--;
    }

    /**
     *  Nếu phần tử tại vị trí i có giá trị bằng data
     *  Thì di chuyển nó về cuối mảng và đặt giá trị 0 tại vị trí i
     * @param data Element want to delete
     */
    @Override
    public void remove(T data) {
        int i = 0;
        int j = size - 1;

        while (i < j) {
            if (container[i] == data) {
                T temp = container[i];
                container[i] = container[j];
                container[j] = temp;
                j--;
                size--;
            } else {
                i++;
            }
        }
    }

    @Override
    public boolean isContain(T data) {
        for (int i = 0; i < size; i++){
            if (container[i].equals(data)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int currentIndex = -1;

            @Override
            public boolean hasNext() {
                return currentIndex + 1 < size;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("No more elements to iterate");
                }
                currentIndex++;
                return container[currentIndex];
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++){
            result.append(container[i]);
            if (i < size - 1){
                result.append(", ");
            }
        }
        return result.append("]").toString();
    }

    @Override
    public int indexOf(T object) {
        for (int i = 0; i < size; i++){
            if (container[i].equals(object)){
                return i;
            }
        }
        return -1;
    }

    public static List<Integer> generateIntegerArrayList(){
        Random random = new Random();
        final int SIZE = (int) Math.pow(10, 4) + 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < SIZE; i++){
            list.add(random.nextInt(1000));
        }
        return list;
    }

    public static List<Integer> generateIntegerArrayList(int size){
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++){
            list.add(random.nextInt(1000));
        }
        return list;
    }
}
