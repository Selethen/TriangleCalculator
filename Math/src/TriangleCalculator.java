
public class TriangleCalculator {

	TriangleCalculator() {
		
	}
	
	public static void main(String args[]) {
		Point a = new Point(0, 0);
		Point b = new Point(0, 2);
		Point c = new Point(2, 0);
		
		try {
			Triangle triangle = new Triangle(10, 10, 30);
			System.out.println(triangle.getPerimeter());
			System.out.println(triangle.getArea());
		} catch(NotATriangleException ex) {
			ex.printStackTrace();
		}
	}
}
