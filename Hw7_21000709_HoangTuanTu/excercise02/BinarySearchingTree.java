package Hw7_21000709_HoangTuanTu.excercise02;
public class BinarySearchingTree<E extends Comparable<E>> {
	protected Node<E> root;
	public Node<E> left(Node<E> node){
		return node.left;
	}

	public Node<E> right(Node<E> node){
		return node.right;
	}
	private int size = 0;

	public void insert(E data){
		if (root == null){
			root = insertInSubTree(null , data);
		}
		else{
			root = insertInSubTree(root, data);
		}
	}

	public Node<E> insertInSubTree(Node<E> root, E data){
		if (root == null){
			root = new Node<>(data);
			size++;
			return root;
		}if (data.compareTo(root.data) < 0) {
			root.left = insertInSubTree(root.left, data);
		} else if (data.compareTo(root.data) > 0) {
			root.right = insertInSubTree(root.right, data);
		}
		return root;
	}

	public Node<E> root(){
		return root;
	}

	public boolean search(E data){
		return searchInSubTree(root, data);
	}

	public boolean searchInSubTree(Node<E> root, E data){
		if (root == null) {
			return false;
		}

		if (data.compareTo(root.data) == 0) {
			return true;
		}

		if (data.compareTo(root.data) < 0) {
			return searchInSubTree(root.left, data);
		}

		return searchInSubTree(root.right, data);
	}

	public E findMin(){
		return minInSubTree(root).data;
	}

	public Node<E> minInSubTree(Node<E> root){
		if (root.left != null){
			return minInSubTree(root.left);
		}return root;
	}

	public E findMax(){
		return maxInSubTree(root).data;
	}

	public Node<E> maxInSubTree(Node<E> root){
		if (root.right != null){
			return minInSubTree(root.right);
		}return root;
	}

	public Node<E> delete(E data){
		return deleteInSubTree(root, data);
	}

	public Node<E> deleteInSubTree(Node<E> root, E data){
		if (root == null){
			return null;
		} if (data.compareTo(root.data) < 0) {
			root.left = deleteInSubTree(root.left, data);
		}

		else if (data.compareTo(root.data) > 0) {
			root.right = deleteInSubTree(root.right, data);
		}

		else {

			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}


			root.data = minInSubTree(root.right).data;

			root.right = deleteInSubTree(root.right, root.data);
		}

		return root;
	}

	public int getSize() {
		return size;
	}

	private String helper(Node<E> p){
		if (p != null){
			return helper(p.getLeft()) + " " + p.getData() + " " + helper(p.getRight());
		}
		return "";
	}
	@Override
	public String toString() {
		return helper(root);
	}
}
