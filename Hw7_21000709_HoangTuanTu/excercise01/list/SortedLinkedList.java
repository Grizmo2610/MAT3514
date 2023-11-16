package Hw7_21000709_HoangTuanTu.excercise01.list;

public class SortedLinkedList<E extends Comparable<E>> extends LinkedList<E> {
	@Override
	public void add(E data){
		Node<E> newNode = new Node<>(data);
		if (head == null || head.data.compareTo(data) >= 0){
			newNode.next = head;
			head = newNode;
			if (tail == null) {
				tail = newNode;
			}
		}else if (newNode.data.compareTo(tail.data) >= 0) {
			tail.next = newNode;
			tail = newNode;
		} else {
			Node<E> current = head;
			while (newNode.data.compareTo(current.next.data) >= 0) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
		size++;
	}

	@Override
	public void add(int index, E data){
		add(data);
	}

	// Helper method to get a node at a specific index
	private Node<E> getNodeAtIndex(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}

		Node<E> current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}

		return current;
	}

	public boolean isContain(E data){
		return indexOf(data) != -1;
	}

	public int indexOf(E data){
		int low = 0;
		int high = size - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			E midData = getNodeAtIndex(mid).data;

			if (midData.equals(data)) {
				return mid;
			} else if (midData.compareTo(data) < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1;  // Trả về -1 nếu không tìm thấy target trong danh sách
	}
}
