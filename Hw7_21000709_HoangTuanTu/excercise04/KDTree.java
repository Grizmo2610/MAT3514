package Hw7_21000709_HoangTuanTu.excercise04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Hw7_21000709_HoangTuanTu.excercise02.Node;

public class KDTree {
	private Node<Point> root;

	public KDTree(List<Point> points) {
		this.root = buildKDTree(points, 0);
	}

	private Node<Point> buildKDTree(List<Point> points, int depth) {
		if (points == null || points.size() == 0) {
			return null;
		}

		int k = 2; // Số chiều (x và y)
		int axis = depth % k;

		points.sort(Comparator.comparingInt(p -> (axis == 0) ? p.x : p.y));

		int median = points.size() / 2;

		return new Node<>(
				points.get(median),
				buildKDTree(points.subList(0, median), depth + 1),
				buildKDTree(points.subList(median + 1, points.size()), depth + 1)
		);
	}

	public Point findNearestNeighbor(Point target) {
		return findNearestNeighbor(root, target, 0, null);
	}

	private Point findNearestNeighbor(Node<Point> root, Point target, int depth, Point best) {
		if (root == null) {
			return best;
		}

		int k = 2;
		int axis = depth % k;

		Point nextBest = (best == null || distance(target, best) > distance(target, root.getData())) ? root.getData() : best;
		Node<Point> nextBranch = (target.x < root.getData().x) ? root.getLeft() : root.getRight();

		return findNearestNeighbor(nextBranch, target, depth + 1, nextBest);
	}

	private double distance(Point point1, Point point2) {
		return Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2));
	}

	public static void main(String[] args) {
		List<Point> points = new ArrayList<>();
		points.add(new Point(2, 3));
		points.add(new Point(5, 4));
		points.add(new Point(9, 6));
		points.add(new Point(4, 7));
		points.add(new Point(8, 1));
		points.add(new Point(7, 2));

		KDTree kdTree = new KDTree(points);

		Point targetPoint = new Point(9, 2);
		Point nearestNeighbor = kdTree.findNearestNeighbor(targetPoint);

		System.out.println("Target Point: (" + targetPoint.x + ", " + targetPoint.y + ")");
		System.out.println("Nearest Neighbor: (" + nearestNeighbor.x + ", " + nearestNeighbor.y + ")");
	}
}