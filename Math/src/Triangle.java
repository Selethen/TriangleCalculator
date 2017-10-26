
public class Triangle {

	private double sideA;
	private double sideB;
	private double sideC;
	
	public Triangle(double sideA, double sideB, double sideC) throws NotATriangleException{
		if((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA)) {
			this.sideA=sideA;
			this.sideB=sideB;
			this.sideC=sideC;
		} else {
			throw new NotATriangleException("Invalid data (Triangle cannot be created)");
		}
	}
	
	public Triangle(Point a, Point b, Point c) {
		this.sideA=Point.distanceBeetweenPoints(a, b);
		this.sideB=Point.distanceBeetweenPoints(b, c);
		this.sideC=Point.distanceBeetweenPoints(c, a);
	}
	
	public void setSideA(double sideA) {
		this.sideA=sideA;
	}
	
	public void setSideB(double sideB) {
		this.sideB=sideB;
	}
	
	public void setSideC(double sideC) {
		this.sideC=sideC;
	}
	
	public double getSideA() {
		return this.sideA;
	}
	
	public double getSideB() {
		return this.sideB;
	}
	
	public double getSideC() {
		return this.sideC;
	}
	
	public double getPerimeter() {
		return this.sideA + this.sideB + this.sideC;
	}
	
	public double getArea() {
		double p = this.getPerimeter()/2;
		return Math.sqrt(p*(p-this.sideA)*(p-this.sideB)*(p-this.sideC));
	}
	
}
