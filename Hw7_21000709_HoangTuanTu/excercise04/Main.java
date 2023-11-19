package Hw7_21000709_HoangTuanTu.excercise04;

public class Main {
	public static void main(String[] args) {
		KDTree kdTree = new KDTree();
		kdTree.insert(new Point(2, 3));
		kdTree.insert(new Point(5, 4));
		kdTree.insert(new Point(9, 6));
		kdTree.insert(new Point(4, 7));
		kdTree.insert(new Point(8, 1));
		kdTree.insert(new Point(7, 2));

		Point targetPoint = new Point(9, 2);
		Point nearestNeighbor = kdTree.findNearestNeighbor(targetPoint);

		System.out.println("Target Point: (" + targetPoint.x + ", " + targetPoint.y + ")");
		System.out.println("Nearest Neighbor: (" + nearestNeighbor.x + ", " + nearestNeighbor.y + ")");
	}
}
