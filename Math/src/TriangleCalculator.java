
public class TriangleCalculator {

	TriangleCalculator() {
		
	}
	
	public static void main(String args[]) {
		Point a = new Point(0, 0);
		Point b = new Point(0, 2);
		Point c = new Point(2, 0);
		
		Triangle triangle = new Triangle(a, b, c);
		
		System.out.println(triangle.getPerimeter());
		System.out.println(triangle.getArea());
	}
}
