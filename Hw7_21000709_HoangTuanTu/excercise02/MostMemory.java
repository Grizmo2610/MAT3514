package Hw7_21000709_HoangTuanTu.excercise02;

import java.util.Random;
import java.text.NumberFormat;

public class MostMemory {
	public static void test(int size, boolean displaySize){
		Random random = new Random();
		System.out.println("Generate random tree! PLease wait!");
		BinarySearchingTree<Integer> tree = new BinarySearchingTree<>();
		while (tree.getSize() < size) {
			tree.insert(random.nextInt(10) + 100);
			if (tree.getSize() % 100_000_000 == 0 && displaySize) {
				NumberFormat numberFormat = NumberFormat.getInstance();
				System.out.println("Current size: " + numberFormat.format(tree.getSize()));
			}
		}
	}
	public static void main(String[] args) {
		int i = 9;
		long start = System.nanoTime(), end;
		while (true){
			try{
				int size = (int) Math.pow(10, i);
				System.out.println("Testing with size = 10 ^ " + i);
				test(size, true);
				i++;
			}catch (OutOfMemoryError e){
				end = System.nanoTime();
				System.out.println("Maximum size is: 10 ^ " + i);
				System.out.println("Runtime: " + (end - start));
				break;
			}
		}

	}
}
