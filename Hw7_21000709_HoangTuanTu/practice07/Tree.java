package Hw7_21000709_HoangTuanTu.practice07;

public class Tree {
	// Function to find the minimum element in the given BST.
	int minValue(Node node) {
		if (node == null){
			return -1;
		}if (node.left != null){
			return minValue(node.left);
		}return node.data;
	}
}
