package Hw7_21000709_HoangTuanTu.excercise03;


public class BalancedTree<E extends Comparable<E>> {

	BalancedNode<E> root;

	public void setParent(BalancedNode<E> node , BalancedNode<E> parent) {
		if (node != null){
			node.parent = parent;
			setParent(node.left , node);
			setParent(node.right , node);
		}
	}

	// Check height balance
	public int checkHeightBalance(BalancedNode<E> root) {

		// Check for emptiness
		if (root == null){
			return 0;
		}

		int leftHeight = checkHeightBalance(root.left);
		if (leftHeight == - 1){
			return - 1;
		}

		int rightHeight = checkHeightBalance(root.right);
		if (rightHeight == - 1){
			return - 1;
		}

		if (Math.abs(leftHeight - rightHeight) > 1){
			return - 1; // Tree is not balanced
		}

		return Math.max(leftHeight , rightHeight) + 1; // Return height of the current subtree
	}

	public boolean isBalanced() {
		return checkHeightBalance(root) != - 1;
	}

	public void insert(E value) {
		root = insert(root, value);
	}

	private BalancedNode<E> insert(BalancedNode<E> node, E value) {
		// Chèn giá trị như một cây nhị phân thông thường
		if (node == null) {
			return new BalancedNode<>(value);
		}

		int compareResult = value.compareTo(node.data);

		if (compareResult < 0) {
			node.left = insert(node.left, value);
		} else if (compareResult > 0) {
			node.right = insert(node.right, value);
		} else {
			// Giá trị đã tồn tại, không chèn trùng lặp
			return node;
		}

		// Cập nhật chiều cao của nút hiện tại
		updateHeight(node);

		// Cân bằng cây
		return balance(node);
	}

	private int height(BalancedNode<E> node) {
		return (node == null) ? 0 : node.height;
	}

	private void updateHeight(BalancedNode<E> node) {
		if (node != null) {
			node.height = Math.max(height(node.left), height(node.right)) + 1;
		}
	}

	private BalancedNode<E> balance(BalancedNode<E> node) {
		// Cân bằng cây sử dụng các quy tắc cân bằng AVL tree
		int balance = height(node.left) - height(node.right);

		if (balance > 1) {
			if (height(node.left.left) >= height(node.left.right)) {
				// Trường hợp LL
				return rotateRight(node);
			} else {
				// Trường hợp LR
				node.left = rotateLeft(node.left);
				return rotateRight(node);
			}
		} else if (balance < -1) {
			if (height(node.right.right) >= height(node.right.left)) {
				// Trường hợp RR
				return rotateLeft(node);
			} else {
				// Trường hợp RL
				node.right = rotateRight(node.right);
				return rotateLeft(node);
			}
		}

		return node;
	}

	private BalancedNode<E> rotateLeft(BalancedNode<E> y) {
		BalancedNode<E> x = y.right;
		BalancedNode<E> T2 = x.left;

		// Thực hiện xoay
		x.left = y;
		y.right = T2;

		// Cập nhật chiều cao
		updateHeight(y);
		updateHeight(x);

		return x;
	}

	private BalancedNode<E> rotateRight(BalancedNode<E> x) {
		BalancedNode<E> y = x.left;
		BalancedNode<E> T2 = y.right;

		// Thực hiện xoay
		y.right = x;
		x.left = T2;

		// Cập nhật chiều cao
		updateHeight(x);
		updateHeight(y);

		return y;
	}

	public String helper(BalancedNode<E> root){
		if (root != null){
			return helper(root.left) + " " + root.data + helper(root.right);
		}
		return "";
	}
	@Override
	public String toString() {
		return helper(root);
	}
}