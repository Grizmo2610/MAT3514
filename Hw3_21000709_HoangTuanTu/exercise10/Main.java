package Hw3_21000709_HoangTuanTu.exercise10;

import Hw3_21000709_HoangTuanTu.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = LinkedList.generateLinkedList(10);
        System.out.println("Origin linked list: " + list);
        LinkedList reverseList = Solution.reverseLinkedList(list.getHead());
        System.out.println("Reverse linked list: " + reverseList);
    }
}
