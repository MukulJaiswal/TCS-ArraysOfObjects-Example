package ArrayOfObjects;

public class PointSolution {
	static double findSequentialDistance(Point p[]) {
		double result = 0;
		for (int i = 0; i < p.length - 1; i++) {

			double sq1 = Math.pow((p[i].getX() - p[i + 1].getX()), 2);
			double sq2 = Math.pow((p[i].getY() - p[i + 1].getY()), 2);
			double res1 = Math.sqrt(sq1 + sq2);
			result = result + res1;
		}
		return result;
	}
	public static void main(String args[]) {

		Point p1 = new Point(-3.0, -4.0);
		Point p2 = new Point(0.0, 0.0);
		Point p3 = new Point(4.0, 3.0);
		Point p4 = new Point(16.0, -2.0);
		
		Point parr[] = { p1, p2, p3, p4 };
		double result = findSequentialDistance(parr);

		System.out.println(result);
	}
}
