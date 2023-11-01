package Hw3_21000709_HoangTuanTu.linkedlist;

import java.util.Random;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        head = null;
    }

    public void add(Object data) {
        if (head == null) {
            head = new Node(data);
            tail = null;
        } else {
            if (tail == null) {
                tail = new Node(head.data);
                head = new Node(data, tail);
            } else {
                head = new Node(data, head);
            }
        }
        size++;
    }

    public void addBot(Object data) {
        if (head == null) {
            head = new Node(data);
            tail = null;
        } else {
            if (tail == null) {
                tail = new Node(data);
                head.next = tail;
            } else {
                tail.next = new Node(data);
                tail = tail.next;
            }
        }
        size++;
    }

    public Object removeTop() {
        if (head == null) {
            return null;
        }
        Object data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public Object removeBot() {
        if (head == null) {
            throw new IllegalStateException("LinkedList is empty");
        }

        Object removedData;
        if (head == tail) {
            removedData = head.data;
            head = null;
            tail = null;
        } else {
            // Traverse the list to find the element before the last element
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            removedData = tail.data;
            current.next = null;
            tail = current;
        }
        size--;
        return removedData;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "";
        } else if (tail == null) {
            return head.data.toString();
        }

        Node node = head;
        StringBuilder result = new StringBuilder();
        while (node.next != null) {
            result.append(node.data);
            result.append(", ");
            node = node.next;
        }
        return result.append(node.data).toString();
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            return head.data;
        } else if (index == size - 1) {
            return tail.data;
        }
        Node node = head;
        for (int i = 1; i <= index; i++) {
            node = node.next;
        }
        return node.data;
    }

    public void set(int index, Object data) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            head = new Node(data, head.next);
        } else if (index == size - 1) {
            tail = new Node(data);
        }
        Node node = head;
        for (int i = 1; i <= index; i++) {
            node = node.next;
        }
        node.data = data;
    }

    public boolean isContain(Object data) {
        if (head == null) {
            throw new NullPointerException("No element in List!");
        }

        Node node = head;
        while (node.next != null) {
            if (node.data.equals(data)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void remove(Object data) {
        if (head == null) {
            throw new NullPointerException("No element in List!");
        }

        while (head != null && head.data == data) {
            head = head.next;
            size--;
        }

        Node node = head;
        while (node != null) {
            while (node.next != null && node.next.data == data) {
                node.next = node.next.next;
            }
            node = node.next;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        tail = temp;
    }

    public void insert(int index, Object data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (head == null) {
            head = new Node(data);
        }

        else if (index == 0) {
            head = new Node(data, head);
        } else {
            Node node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            node.next = new Node(data, node.next);

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            tail = temp;
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            node.next = node.next.next;

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            tail = temp;
        }
    }

    public Node getHead() {
        return head;
    }

    public static LinkedList generateLinkedList() {
        Random random = new Random();
        LinkedList list = new LinkedList();
        final int BOUND = (int) Math.pow(10, 4);
        final int SIZE = random.nextInt(BOUND) + 1;
        for (int i = 0; i < SIZE; i++) {
            list.addBot(random.nextInt(BOUND));
        }

        return list;
    }

    public static LinkedList generateLinkedList(int size) {
        Random random = new Random();
        LinkedList list = new LinkedList();
        final int BOUND = (int) Math.pow(10, 4);
        for (int i = 0; i < size; i++) {
            list.addBot(random.nextInt(BOUND));
        }

        return list;
    }
}
