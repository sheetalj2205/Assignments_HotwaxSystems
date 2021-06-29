package GeometryShapes;

import java.util.Scanner;

public class Cylinder implements Calculator {

	private double radius;
	private double height;
	
	

	public Cylinder(double radius, double height) {
		super();
		this.radius = radius;
		this.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	public double area() {
		double area = (2*3.14*(radius*radius))+(2*3.14*radius*height);
		return area;
	}

	@Override
	public double volume() {
		double volume = 3.14*(radius*radius)*height;
		return volume;
	}


}
