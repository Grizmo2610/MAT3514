package Hw3_21000709_HoangTuanTu.exercise10;

import Hw3_21000709_HoangTuanTu.linkedlist.LinkedList;
import Hw3_21000709_HoangTuanTu.linkedlist.Node;

public class Solution {
    public static LinkedList reverseLinkedList(Node head){
        LinkedList list = new LinkedList();
        Node node = head;
        while (node != null){
           if (list.getHead() == null){
               list.addBot(node);
           }else{
               list.add(node);
           }
           node = node.next;
        }

        return list;
    }
}
