package Hw3_21000709_HoangTuanTu.linkedlist;

public class Node {
    public Object data;
    public Node next = null;

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
