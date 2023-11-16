package Hw7_21000709_HoangTuanTu.excercise03;

class BalancedNode<E extends Comparable<E>> {

	E data;
	BalancedNode<E> left, right, parent;
	int height; // Thêm chiều cao của nút

	BalancedNode(E d) {
		data = d;
		left = right = parent = null;
		height = 1; // Ban đầu, chiều cao của mỗi nút là 1
	}

	public BalancedNode(E data, BalancedNode<E> parent) {
		this.data = data;
		this.parent = parent;
		this.height = 1; // Ban đầu, chiều cao của mỗi nút là 1
	}
}
