package Hw7_21000709_HoangTuanTu.excercise03;


public class BalancedTree<E> {

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
}