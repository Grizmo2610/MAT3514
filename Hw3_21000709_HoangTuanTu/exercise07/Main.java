package Hw3_21000709_HoangTuanTu.exercise07;

import Hw3_21000709_HoangTuanTu.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list   = LinkedList.generateLinkedList();

        System.out.println("Origin List: " + list);
        System.out.println("Calculate size of list using size function: " + list.size());
        System.out.println("Size using solution: " + Solution.getCount(list.getHead()));
    }
}
