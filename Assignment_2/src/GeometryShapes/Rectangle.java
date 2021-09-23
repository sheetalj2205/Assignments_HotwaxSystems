package GeometryShapes;

public class Rectangle implements TwoDimensionalShapes {

	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public double perimeter() {
		double perimeter = 2 * (length + breadth);
		return perimeter;
	}

	@Override
	public double area() {
		double area = (length * breadth);
		return area;
	}

}
