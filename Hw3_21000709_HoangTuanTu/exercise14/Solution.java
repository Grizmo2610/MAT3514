package Hw3_21000709_HoangTuanTu.exercise14;

import Hw3_21000709_HoangTuanTu.linkedlist.DualNode;

public class Solution {
    void addNode(DualNode head, int index, int data){
        if (index == 0){
            head = new DualNode(data, head);
        } else if (head == null){
            head = new DualNode(data);
        } else{
            DualNode node = head;
            for (int i = 0; i < index; i++){
                node = node.next;
            }
            node.next = new DualNode(data);
        }
    }
}
