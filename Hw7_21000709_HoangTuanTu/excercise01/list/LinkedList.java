package Hw7_21000709_HoangTuanTu.excercise01.list;
class Node<E extends Comparable<E>>{
	E data;
	Node<E> next;

	public Node(E data) {
		this.data = data;
	}

	public Node(E data , Node<E> next) {
		this.data = data;
		this.next = next;
	}
}
public class LinkedList<E extends Comparable<E>> implements List<E> {
	protected int size = 0;
	protected Node<E> head;
	protected Node<E> tail;

	@Override
	public void add(E data) {
		Node<E> node = new Node<>(data);
		if (head == null){
			head = node;
		}else{
			tail.next = node;
		}
		tail = node;
		size++;
	}

	@Override
	public void add(int index , E data) {
		if (index == 0){
			head = new Node<>(data, head.next);
		} else if (index == size - 1){
			Node<E> node = new Node<>(data);
			tail.next = node;
			tail = node;
		}else{
			Node<E> node = head;
			for (int i = 0; i < index; i++){
				node = node.next;
			}
			node.next = new Node<>(data, node.next);
		}
		size++;
	}

	@Override
	public void remove(int index) {
		if (index == 0){
			head = head.next;
		} else if (index == size - 1){
			Node<E> node = head;
			while (node.next != tail){
				node = node.next;
			}
			node.next = null;
			tail = node;
		}else{
			Node<E> node = head;
			for (int i = 0; i < index; i++){
				node = node.next;
			}
			node.next = node.next.next;
		}
		size--;
	}

	@Override
	public E get(int index) {
		if (index < 0 || index >= size){
			throw new IndexOutOfBoundsException();
		}
		if (index == 0){
			return head.data;
		} else if (index == size - 1){
			return tail.data;
		}
		Node<E> node = head;
		for (int i = 0; i < index; i++){
			node = node.next;
		}
		return node.data;

	}

	@Override
	public void set(int index , E data) {
		if (index < 0 || index >= size){
			throw new IndexOutOfBoundsException();
		}
		if (index == 0){
			head.data = data;
		} else if (index == size - 1){
			tail.data = data;
		}else{
			Node<E> node = head;
			for (int i = 0; i < index; i++){
				node = node.next;
			}
			node.data = data;
		}
	}

	@Override
	public boolean isContain(E data) {
		Node<E> node = head;
		while (node != null){
			if (node.data == data){
				return true;
			}node = node.next;
		}
		return false;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public int indexOf(E value) {
		Node<E> node = head;
		int index = 0;
		while (node != null){
			if (node.data == value){
				return index;
			}node = node.next;
			index++;
		}
		return -1;
	}

	@Override
	public String toString(){
		StringBuilder result = new StringBuilder("[");
		Node<E> node = head;
		while (node.next != null){
			result.append(node.data).append(", ");
			node = node.next;
		}
		result.append(node.data);
		return result.append("]").toString();
	}
}
