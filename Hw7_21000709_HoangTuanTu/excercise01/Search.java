package Hw7_21000709_HoangTuanTu.excercise01;

import Hw7_21000709_HoangTuanTu.excercise01.list.ArrayList;
import Hw7_21000709_HoangTuanTu.excercise01.list.LinkedList;
import Hw7_21000709_HoangTuanTu.excercise01.list.List;
import Hw7_21000709_HoangTuanTu.excercise01.list.SortedLinkedList;

import java.util.Random;

public class Search {
	public static void test(int type, int size, int bound){
		List<Integer> list;
		if (type == 1){
			list = new ArrayList<>();
			System.out.println("Test Array List: ");
		} else if (type == 2){
			list = new LinkedList<>();
			System.out.println("Test Unsorted Linked List: ");
		} else if (type == 3){
			System.out.println("Test Sorted Linked List");
			list = new SortedLinkedList<>();
		}else {
			list = new ArrayList<>();
		}

		Random random = new Random();
		for(int i = 0; i < size; i++){
			list.add(random.nextInt(bound));
		}

		System.out.println("List: ");
		System.out.println(list);

		System.out.println();

		int[]numbers = new int[random.nextInt(10) + 10];

		for (int i = 0; i < numbers.length; i++){
			if (random.nextBoolean()){
				numbers[i] = list.get(random.nextInt(list.size())); // certainly contain
			}else{
				numbers[i] = bound + random.nextInt(100); // certainly not contain
			}
		}
		for (int number : numbers){
			if (list.isContain(number)){
				System.out.println("Index of " + number + " is: " + list.indexOf(number));
			} else{
				System.out.println("List not contain " + number);
			}
		}
		System.out.println("________________________\n");
	}
	public static void main(String[] args) {
		final int SIZE = 100, BOUND = (int) Math.pow(10, 3);
		test(1, 100, BOUND);
		test(2, 100, BOUND);
		test(3, 100, BOUND);
	}
}
