package Hw5_21000709_HoangTuanTu.practice01;

class Node {
    int data;
    Node left;
    Node right;

    Node(int x) {
        data = x;
    }

    public Node(int data , Node left , Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
