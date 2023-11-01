package Hw3_21000709_HoangTuanTu.exercise05;

public class DualLinkedList {
    private DualNode head = null;
    private DualNode tail = null;
    private int size = 0;

    public DualLinkedList() {
    }

    public int size() {
        return size;
    }

    public void add(int data) {
        DualNode newNode = new DualNode(data);
        newNode.prev = tail;
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = newNode;
        }
        size++;
    }

    public void addHead(int data){
        DualNode newNode = new DualNode(data, head);
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        DualNode node = head;
        while (node != null) {
            result.append(node.data).append(" ");
            node = node.next;
        }
        return result.toString();
    }
    public void insert(int index, int data) {
        if (head == null && index != 0){
            throw new NullPointerException();
        }else if (index == 0 && head == null){
            head = new DualNode(data);
        } else if (index == 0){
            DualNode newNode = new DualNode(data, head);
            head.prev = newNode;
            head = newNode;
        } else if (index == size){
            DualNode newNode = new DualNode(data);
            newNode.prev = tail;
            if (tail != null) {
                tail.next = newNode;
            }
            tail = newNode;
        } else {
            DualNode node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            node.next = new DualNode(node, data, node.next);
            if (node.next.next != null) {
                node.next.next.prev = node.next;
            }
        }
        size++;
    }

    public int get(int index) {
        if (index == 0){
            return head.data;
        } else if (index == size-1){
            return tail.data;
        }
        DualNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.data;
    }

    public void remove(int index) {
        if (head == null) {
            throw new NullPointerException();
        } else if (index == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            DualNode node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            if (node.next != null) {
                node.next = node.next.next;
                if (node.next != null) {
                    node.next.prev = node;
                }
            }
        }
        size--;
    }
}