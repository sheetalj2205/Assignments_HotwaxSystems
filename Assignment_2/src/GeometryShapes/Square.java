package GeometryShapes;

public class Square implements TwoDimensionalShapes {

	private double side;

	public Square(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double perimeter() {
		double perimeter = 4 * side;
		return perimeter;
	}

	@Override
	public double area() {
		double area = (side * side);
		return area;
	}

}
