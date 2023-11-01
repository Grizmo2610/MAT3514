package Hw4_21000709_HoangTuanTu.exercise02;

import java.util.Iterator;

public interface Stack<E> {
    void push ( E element ) ;
    E pop () ;
    boolean isEmpty () ;
    E top () ;
    String toString();
    int size();
    Iterator<E> iterator();
}
