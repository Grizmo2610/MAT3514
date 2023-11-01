package Hw3_21000709_HoangTuanTu.exercise05;


public class LinkedList {
    private Node head;
    private int size = 0;

    public LinkedList() {
    }


    public void add(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node(data);
        }
        size++;
    }

    public void insert(int index, int data) {
        if (head == null) {
            throw new NullPointerException();
        }

        if (index == 0) {
            head = new Node(data, head);
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = new Node(data, current.next);
        }
        size++;
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            node.next = node.next.next;
        }
        size--;
    }

    public int get(int index) {
        if (head == null) {
            throw new NullPointerException();
        } else if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            return head.val;
        } else {
            Node node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node.val;
        }
    }

    public void replace(int oldData, int newData) {
        if (head == null) {
            throw new NullPointerException();
        }

        Node node = head;
        while (node != null) {
            if (node.val == oldData) {
                node.val = newData;
            }
            node = node.next;
        }
    }

    public void removeBigger(int index) {
        int data = get(index);

        Node current = head;
        int i = 0;
        while (current != null) {
            if (current.val > data) {
                remove(i);
            } else {
                i++;
            }
            current = current.next;
        }
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    @Override
    public String toString() {
        if (head.val != 0) {
            Node node = head;
            StringBuilder result = new StringBuilder();
            while (node != null) {
                result.append(node.val).append(" ");
                node = node.next;
            }
            return result.toString();
        }
        return "";
    }
}