package Hw7_21000709_HoangTuanTu.excercise02;

public class Main {
	public static void main(String[] args) {
		BinarySearchingTree<Integer> tree = new BinarySearchingTree<>();
		tree.insert(5);
		tree.insert(3);
		tree.insert(1);
		tree.insert(4);
		tree.insert(2);
		tree.insert(8);
		tree.insert(6);
		tree.insert(9);
		tree.insert(7);
		System.out.println(tree);
	}
}
