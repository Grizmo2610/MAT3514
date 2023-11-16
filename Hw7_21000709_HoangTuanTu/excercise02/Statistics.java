package Hw7_21000709_HoangTuanTu.excercise02;

import java.util.Random;

public class Statistics {
	static Random random = new Random();
	public static BinarySearchingTree<Integer> randomIntegerTree(int size, int bound, boolean check){
		BinarySearchingTree<Integer> tree = new BinarySearchingTree<>();
		while (tree.getSize() < size) {
			tree.insert(random.nextInt(bound) + 100);
			if (tree.getSize() % 100000 == 0 && check) {
				System.out.println(tree.getSize());
			}
		}

		return tree;
	}

	public static void test(int size, boolean displayTree, boolean displaySize){
		final int BOUND = (int) Math.pow(10, 10);
		int target = random.nextInt(BOUND);
		System.out.println("Generate random tree! PLease wait!");
		BinarySearchingTree<Integer> tree = randomIntegerTree(size, BOUND, displaySize);
		if (displayTree){
			System.out.println("Origin Tree: ");
			System.out.println(tree);
		}
		System.out.println("Start searching");

		long start = System.nanoTime();
		boolean check = tree.search(target);
		long end = System.nanoTime();

		if (check){
			System.out.println(target + " is in tree!");
		}else{
			System.out.println(target + " is not in tree!");
		}

		System.out.println("Run time: " + ((end - start) / 1_000_000.0) + "(second)");
		System.out.println("_______________________\n");
	}

	public static void main(String[] args) {
		for (int i = 8; i <= 8; i++){
			int size = (int) Math.pow(10, i);
			System.out.println("Testing with size = 10 ^ " + i);
			test(size, false, false);
		}
	}
}