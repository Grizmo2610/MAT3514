package Hw3_21000709_HoangTuanTu.exercise08;

import Hw3_21000709_HoangTuanTu.linkedlist.Node;

public class Solution {
    public int getNthFromLast(Node head, int n){
        if (head == null){
            throw new NullPointerException();
        }

        int size = 0;
        Node node = head;
        while (node != null){
            size++;
            node = node.next;
        }

        if (size < n){
            return -1;
        }
        int index = size - n;
        for (int i = 0; i < index; i++){
            head = head.next;
        }
        return (int) head.data;
    }
}
