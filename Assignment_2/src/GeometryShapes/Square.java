package GeometryShapes;

import java.util.Scanner;

public class Square implements Two_DimensionalShapes {

	private double side;

	public Square(double side) {
		super();
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
