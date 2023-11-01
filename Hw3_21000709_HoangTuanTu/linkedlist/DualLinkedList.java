package Hw3_21000709_HoangTuanTu.linkedlist;

import java.util.Random;

public class DualLinkedList {
    DualNode head;
    int size = 0;

    public DualNode getHead() {
        return head;
    }

    public int size() {
        return size;
    }

    public void add(Object data) {
        if (head == null) {
            head = new DualNode(data);
        } else {
            DualNode node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new DualNode(node, data, null);
        }
        size++;
    }

    public void insert(int index, Object data) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = new DualNode(data, head);
        } else if (head == null) {
            head = new DualNode(data);
        } else {
            DualNode node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            node.next = new DualNode(data);
        }
        size++;
    }

    public static DualLinkedList generateLinkedList() {
        Random random = new Random();
        DualLinkedList list = new DualLinkedList();
        final int BOUND = (int) Math.pow(10, 4);
        final int SIZE = random.nextInt(BOUND) + 1;
        for (int i = 0; i < SIZE; i++) {
            list.add(random.nextInt(BOUND));
        }

        return list;
    }

    public static DualLinkedList generateLinkedList(int size) {
        Random random = new Random();
        DualLinkedList list = new DualLinkedList();
        final int BOUND = (int) Math.pow(10, 4);
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(BOUND));
        }
        return list;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        DualNode node = head;
        while (node != null) {
            result.append(node.data);
            if (node.next != null) {
                result.append(", ");
            }
            node = node.next;
        }
        return result.toString();
    }
}
