package Hw4_21000709_HoangTuanTu.exercise04;

import java.util.Iterator;

public interface Queue <E> extends Iterable<E>{
    void enqueue ( E element ) ;
    E dequeue () ;
    boolean isEmpty () ;
    String toString();
    int size();
    Iterator<E> iterator();
}
