package Hw7_21000709_HoangTuanTu.excercise04;

import org.jetbrains.annotations.NotNull;

public class Point implements Comparable<Point> {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point o) {
		int a = (int) Math.pow(Math.pow(this.x, 2) + Math.pow(this.y, 2), 1.0 / 2);
		int b = (int) Math.pow(Math.pow(o.y, 2) + Math.pow(o.y, 2), 1.0 / 2);
		return a - b;
	}
}