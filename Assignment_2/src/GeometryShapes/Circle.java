package GeometryShapes;

public class Circle implements TwoDimensionalShapes {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double perimeter() {
		try {
			double peri = 2 * 3.14 * (this.radius);
			return peri;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			return 0.0;
		}
	}

	@Override
	public double area() {
		try {
			double area = 3.14 * (this.radius * this.radius);
			return area;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			return 0.0;
		}

	}

}
