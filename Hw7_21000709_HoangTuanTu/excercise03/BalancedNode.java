package Hw7_21000709_HoangTuanTu.excercise03;

class BalancedNode<E> {

	E data;
	BalancedNode<E> left, right, parent;

	BalancedNode(E d) {
		data = d;
		left = right = parent = null;
	}

	public BalancedNode(E data , BalancedNode<E> parent) {
		this.data = data;
		this.parent = parent;
	}
}
