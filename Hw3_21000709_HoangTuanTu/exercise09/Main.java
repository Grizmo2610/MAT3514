package Hw3_21000709_HoangTuanTu.exercise09;

import Hw3_21000709_HoangTuanTu.linkedlist.LinkedList;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList list = LinkedList.generateLinkedList();
        Random random = new Random();
        int searchFor = random.nextInt((int) Math.pow(10, 4));
        System.out.println("Origin linked list: " + list);
        System.out.printf("%d appears %d times in linked list", searchFor, Solution.count(list.getHead(), searchFor));
    }
}
