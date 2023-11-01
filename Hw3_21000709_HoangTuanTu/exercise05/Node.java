package Hw3_21000709_HoangTuanTu.exercise05;

public class Node {
    public int val;
    public Node next = null;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
