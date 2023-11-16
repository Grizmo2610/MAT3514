package Hw7_21000709_HoangTuanTu.excercise02;

public class TreeNode<E extends Comparable<E>> {
	E data;
	TreeNode<E> left;
	TreeNode<E> right;


	public TreeNode(E data) {
		this.data = data;
	}

	public TreeNode(E data , TreeNode<E> left , TreeNode<E> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}


	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public TreeNode<E> getLeft() {
		return left;
	}

	public void setLeft(TreeNode<E> left) {
		this.left = left;
	}

	public TreeNode<E> getRight() {
		return right;
	}

	public void setRight(TreeNode<E> right) {
		this.right = right;
	}
}
