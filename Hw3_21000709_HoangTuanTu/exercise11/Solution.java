package Hw3_21000709_HoangTuanTu.exercise11;

import Hw3_21000709_HoangTuanTu.linkedlist.Node;

public class Solution {

    // Helper function to reverse a linked list
    public Node reverseLinkedList(Node node){
        Node prev = null;
        while (node != null) {
            Node nextNode = node.next;
            node.next = prev;
            prev = node;
            node = nextNode;
        }
        return prev;
    }

    public boolean isPalindrome(Node head) {
        // Find the middle of the linked list using the slow and fast pointer technique
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list
        Node secondHalf = reverseLinkedList(slow);

        // Compare the reversed second half with the first half
        Node firstHalf = head;
        while (secondHalf != null) {
            assert firstHalf != null;
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }
}