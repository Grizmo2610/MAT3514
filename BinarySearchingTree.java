import Hw7_21000709_HoangTuanTu.excercise02.TreeNode;

public class BinarySearchingTree<E extends Comparable<E>> {
	protected TreeNode<E> root;
	public TreeNode<E> left(TreeNode<E> node){
		return node.left;
	}

	public TreeNode<E> right(TreeNode<E> node){
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
		size++;
	}

	public TreeNode<E> insertInSubTree(TreeNode<E> root, E data){
		if (root == null){
			root = new TreeNode<>(data);
			return root;
		}if (data.compareTo(root.data) < 0) {
			root.left = insertInSubTree(root.left, data);
		} else if (data.compareTo(root.data) > 0) {
			root.right = insertInSubTree(root.right, data);
		}
		return root;
	}

	public TreeNode<E> root(){
		return root;
	}

	public boolean search(E data){
		return searchInSubTree(root, data);
	}

	public boolean searchInSubTree(TreeNode<E> root, E data){
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

	public TreeNode<E> minInSubTree(TreeNode<E> root){
		if (root.left != null){
			return minInSubTree(root.left);
		}return root;
	}

	public E findMax(){
		return maxInSubTree(root).data;
	}

	public TreeNode<E> maxInSubTree(TreeNode<E> root){
		if (root.right != null){
			return minInSubTree(root.right);
		}return root;
	}

	public TreeNode<E> delete(E data){
		return deleteInSubTree(root, data);
	}

	public TreeNode<E> deleteInSubTree(TreeNode<E> root, E data){
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

	private String helper(TreeNode<E> p){
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
