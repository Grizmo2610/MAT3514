package Hw3_21000709_HoangTuanTu.exercise09;

import Hw3_21000709_HoangTuanTu.linkedlist.*;

public class Solution{
    public static int count(Node head, int search_for){
        Node node = head;
        int count = 0;
        while(node != null){
            if (node.data.equals(search_for)){
                count++;
            }
            node = node.next;
        }
        return count;
    }
}