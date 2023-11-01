package Hw3_21000709_HoangTuanTu.exercise05;

public class DualNode {
    int data;
    DualNode prev;
    DualNode next;

    public DualNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public DualNode(DualNode prev, int data, DualNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public DualNode(int data, DualNode next) {
        this.data = data;
        this.next = next;
        this.prev = null;
    }

    public DualNode( DualNode prev, int data) {
        this.data = data;
        this.next = null;
        this.prev = prev;
    }
}
