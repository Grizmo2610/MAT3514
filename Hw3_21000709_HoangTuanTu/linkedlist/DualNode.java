package Hw3_21000709_HoangTuanTu.linkedlist;

public class DualNode {
    public DualNode prev = null;
    public Object data;
    public DualNode next = null;

    public DualNode(Object data) {
        this.data = data;
    }

    public DualNode(DualNode prev, Object data, DualNode next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    public DualNode(Object data, DualNode next) {
        this.data = data;
        this.next = next;
    }

    public DualNode(DualNode prev, Object data) {
        this.prev = prev;
        this.data = data;
    }
}
