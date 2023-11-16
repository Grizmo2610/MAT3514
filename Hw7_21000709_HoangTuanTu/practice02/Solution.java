package Hw7_21000709_HoangTuanTu.practice02;


class Node{
	int data;
	Node left, right;
}
public class Solution {
	boolean isBSTUtil(Node node, int min, int max) {
		if (node == null)
			return true;

		// Kiểm tra giới hạn của giá trị nút
		if (node.data <= min || node.data >= max)
			return false;

		// Kiểm tra các nút con bên trái và bên phải
		return isBSTUtil(node.left, min, node.data) && isBSTUtil(node.right, node.data, max);
	}
}

