package Hw3_21000709_HoangTuanTu.exercise03;

public class Node<T> {
    T data;
    Node<T> next = null;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public Node(T data) {
        this.data = data;
    }
}
