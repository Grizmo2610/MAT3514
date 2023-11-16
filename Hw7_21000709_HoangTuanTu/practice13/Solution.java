package Hw7_21000709_HoangTuanTu.practice13;

class Node{
    int data;
    Node left,right;
    Node(int d) {
        data=d;
        left=right=null;
    }
}
public class Solution{
	public static void insert(Node root, int data){
		String      last_direction = "None";
		Node parent         = root;

		while (root != null) {
			parent = root;
			if (data < root.data) {
				root = root.left;
				last_direction = "left";
			} else if (data > root.data) {
				root = root.right;
				last_direction = "right";
			}
			else
				return;
		}

		if (last_direction.equals("left"))
			parent.left = new Node(data);
		if (last_direction.equals("right"))
			parent.right = new Node(data);

	}
	public static Node constructTree(int[] post , int n){
		Node root = new Node(post[n-1]);
		for (int i = n - 2; i >= 0; i--){
			insert(root, post[i]);
		}
		return root;
	}
}
