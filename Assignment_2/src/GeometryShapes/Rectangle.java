package GeometryShapes;

import java.util.Scanner;

public class Rectangle implements Calculator {

	private double length;
	private double breadth;
	
	
	

	public Rectangle(double length, double breadth) {
		super();
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
		double perimeter = 2*(length+breadth);
		return perimeter;
	}

	@Override
	public double area() {
		double area = (length*breadth);
		return area;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0.0;
	
	}

}
