package Hw3_21000709_HoangTuanTu.exercise08;

import Hw3_21000709_HoangTuanTu.linkedlist.LinkedList;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList list = LinkedList.generateLinkedList(100);
        System.out.println("Origin List: " + list);
        Random random = new Random();
        int number = random.nextInt(list.size()) + 1;
        System.out.printf("Number %dth from end is: %d", number, new Solution().getNthFromLast(list.getHead(), number));
    }
}
