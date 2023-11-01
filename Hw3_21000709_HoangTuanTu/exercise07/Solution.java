package Hw3_21000709_HoangTuanTu.exercise07;

import Hw3_21000709_HoangTuanTu.linkedlist.*;

public class Solution {
    public static int getCount(Node head) {
        int count = 0;
        Node node = head;
        while (node != null){
            node = node.next;
            count++;
        }
        return count;
    }
}

