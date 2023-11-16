package Hw7_21000709_HoangTuanTu.excercise03;

public class Main {
	public static void main(String[] args) {

		BalancedTree<Integer> tree = new BalancedTree<>();
		tree.insert(5);
		tree.insert(6);
		tree.insert(3);
		tree.insert(4);
		tree.insert(2);
		tree.insert(7);
		tree.insert(10);
		tree.insert(11);
		tree.insert(12);


		tree.setParent(tree.root , null);
		System.out.println(tree.root.data);
		System.out.println(tree);

		if (tree.isBalanced())
			System.out.println("The tree is balanced");
		else
			System.out.println("The tree is not balanced");
	}
}
