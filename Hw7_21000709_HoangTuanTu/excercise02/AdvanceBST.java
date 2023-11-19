package Hw7_21000709_HoangTuanTu.excercise02;

public class AdvanceBST<E extends Comparable<E>> extends BinarySearchingTree<E> {
	private int count = 0;
	public E findKthMin(int k){
		return findKthMinInSubTree(root, k).data;
	}

	public Node<E> findKthMinInSubTree(Node<E> root, int k){
		if (root == null) {
			return null;
		}

		Node<E> leftResult = findKthMinInSubTree(root.left, k);
		if (leftResult != null) {
			return leftResult;
		}

		count++;

		if (count == k) {
			return root;
		}

		return findKthMinInSubTree(root.right, k);
	}
}
