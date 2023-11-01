package Hw5_21000709_HoangTuanTu.practice03;

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
}

public class Solution {
    public int countLeaves(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        return countLeaves(root.left) + countLeaves(root.right);
    }
}

