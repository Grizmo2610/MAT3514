package Hw7_21000709_HoangTuanTu.excercise04;


import Hw7_21000709_HoangTuanTu.excercise02.BinarySearchingTree;
import Hw7_21000709_HoangTuanTu.excercise02.Node;

public class KDTree extends BinarySearchingTree<Point> {
	public Point findNearestNeighbor(Point target) {
		return findNearestNeighbor(root, target, null);
	}

	private Point findNearestNeighbor(Node<Point> root, Point target, Point best) {
		if (root == null) {
			return best;
		}

		Point nextBest = (best == null || distance(target, best) > distance(target, root.getData())) ? root.getData() : best;
		Node<Point> nextBranch = (target.x < root.getData().x) ? root.getLeft() : root.getRight();

		return findNearestNeighbor(nextBranch, target, nextBest);
	}

	private double distance(Point point1, Point point2) {
		return Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2));
	}

}