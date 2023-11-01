package Hw3_21000709_HoangTuanTu.exercise11;

import Hw3_21000709_HoangTuanTu.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(26);
        for (int i = 0; i < 10; i++){
            list.add(i);
            list.addBot(i);
        }

        System.out.println("Origin list: " + list);
        System.out.println("List is palindrome: " + new Solution().isPalindrome(list.getHead()));

        LinkedList randomList = LinkedList.generateLinkedList(10);
        System.out.println("Origin list: " + randomList);
        System.out.println("List is palindrome: " + new Solution().isPalindrome(randomList.getHead()));
    }
}
