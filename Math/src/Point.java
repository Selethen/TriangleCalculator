
public class Point {

	private double X;
	private double Y;
	
	public Point(double X, double Y) {
		this.X=X;
		this.Y=Y;
	}
	
	public void setX(double X) {
		this.X=X;
	}
	
	public void setY(double Y) {
		this.Y=Y;
	}
	
	public double getX() {
		return this.X;
	}
	
	public double getY() {
		return this.Y;
	}
	
	public static double distanceBeetweenPoints(Point a, Point b) {
		return Math.sqrt(Math.pow((b.getX()-a.getX()), 2) + Math.pow((b.getY()-a.getY()), 2));
	}
}
