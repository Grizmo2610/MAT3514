package Hw7_21000709_HoangTuanTu.excercise03;

public class Main {
	public static void main(String[] args) {

		BalancedTree<Integer> tree = new BalancedTree<>();
		tree.root = new BalancedNode<>(1);
		tree.root.left = new BalancedNode<>(2);
		tree.root.right = new BalancedNode<>(3);
		tree.root.left.left = new BalancedNode<>(4);
		tree.root.left.right = new BalancedNode<>(5);


		tree.setParent(tree.root , null);

		if (tree.isBalanced())
			System.out.println("The tree is balanced");
		else
			System.out.println("The tree is not balanced");
	}
}
