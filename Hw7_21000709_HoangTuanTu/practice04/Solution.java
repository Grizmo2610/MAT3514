package Hw7_21000709_HoangTuanTu.practice04;

class Node{
	int data;
	Node left, right;
}
public class Solution {
	int count = 0;
	//Function to count number of nodes in BST that lie in the given range.
	int getCount(Node root,int l, int h){
		if (root != null){
			getCount(root.left,l, h);
			if (root.data >= l && root.data <=h ){
				count++;
			}
			getCount(root.right,l, h);
		}
		return count;
	}
}