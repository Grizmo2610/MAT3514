package Hw3_21000709_HoangTuanTu.exercise14;

import Hw3_21000709_HoangTuanTu.linkedlist.DualLinkedList;

public class Main {
    public static void main(String[] args) {
        DualLinkedList list = DualLinkedList.generateLinkedList(10);
        System.out.println(list);
        new Solution().addNode(list.getHead(), 2, 26);
        System.out.println(list);
    }
}
