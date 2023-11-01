package Hw3_21000709_HoangTuanTu.exercise03;

public class LinkedList<T> implements List<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;
    public LinkedList() {
        head = null;
    }

    @Override
    public void add(T data){
        if (head == null){
            head = new Node<>(data);
            tail = null;
        }else {
           if (tail == null){
               tail = new Node<>(head.data);
               head = new Node<>(data, tail);
           }else {
               head = new Node<>(data, head);
           }
        }
        size++;
    }

    @Override
    public void addBot(T data){
        if (head == null){
            head = new Node<>(data);
            tail = null;
        }else {
            if (tail == null){
                tail = new Node<>(data);
                head.next = tail;
            }else {
                tail.next = new Node<>(data);
                tail = tail.next;
            }
        }
        size++;
    }

    @Override
    public T removeTop(){
        if (head == null){
            return null;
        }
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }

    @Override
    public T removeBot(){
        if (head == null) {
            throw new IllegalStateException("LinkedList is empty");
        }

        T removedData;
        if (head == tail) {
            removedData = head.data;
            head = null;
            tail = null;
        } else {
            // Traverse the list to find the element before the last element
            Node<T> current = head;
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

    @Override
    public int size(){
        return size;
    }

    @Override
    public String toString(){
        if (head == null){
            return "";
        }else if(tail == null){
            return head.data.toString();
        }

        Node<T> node = head;
        StringBuilder result = new StringBuilder();
        while (node.next != null){
            result.append(node.data);
            result.append(", ");
            node = node.next;
        }
        return result.append(node.data).toString();
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        else if (index == 0){
            return head.data;
        } else if (index == size - 1){
            return tail.data;
        }
        Node<T> node = head;
        for (int i = 1; i <= index; i++){
            node = node.next;
        }
        return node.data;
    }

    @Override
    public void set(int index, T data) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        else if (index == 0){
            head = new Node<>(data, head.next);
        } else if (index == size - 1){
            tail = new Node<>(data);
        }
        Node<T> node = head;
        for (int i = 1; i <= index; i++){
            node = node.next;
        }
        node.data = data;
    }

    @Override
    public boolean isContain(T data) {
        if (head == null){
            throw new NullPointerException("No element in List!");
        }

        Node<T> node = head;
        while (node.next != null){
            if (node.data.equals(data)){
                return true;
            }
            node = node.next;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void removeValue(T data) {
        if (head == null){
            throw new NullPointerException("No element in List!");
        }

        while (head != null && head.data.equals(data)) {
            head = head.next;
            size--;
        }

        if(head != null){
            Node<T> node = head;
            while (node != null) {
                while (node.next != null && node.next.data.equals(data)) {
                    node.next = node.next.next;
                    size--;
                }
                node = node.next;
            }

            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            tail = temp;
        }else {
            tail = null;
        }
    }

    @Override
    public void insert(int index, T data){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        if (head == null){
            head = new Node<>(data);
        }

        else if (index == 0){
            head = new Node<>(data, head);
        } else{
            Node<T> node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            node.next = new Node<>(data, node.next);

            Node<T> temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            tail = temp;
        }
        size++;
    }

    @Override
    public void remove(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        if (index == 0){
            head = head.next;
        } else {
            Node<T> node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            node.next = node.next.next;

            Node<T> temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            tail = temp;
        }
        size--;
    }
}
