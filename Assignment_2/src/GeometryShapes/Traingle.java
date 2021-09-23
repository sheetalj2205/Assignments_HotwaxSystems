package GeometryShapes;

import java.util.Scanner;

public class Traingle implements Two_DimensionalShapes {

	private double height;
	private double base;
	private double side;

	public Traingle(double height, double base, double side) {
		super();
		this.height = height;
		this.base = base;
		this.side = side;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double perimeter() {
		try {
			double peri = (height + base + side);
			return peri;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			return 0.0;
		}
	}

	@Override
	public double area() {
		double area = (1 / 2) * (base * height);
		return area;
	}
}
