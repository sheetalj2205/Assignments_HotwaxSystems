package GeometryShapes;

import java.util.Scanner;

public class Cylinder implements Calculator {

	private double radius;
	private double height;
	
	

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
	public void perimeter() {
		// TODO Auto-generated method stub
	}

	@Override
	public void area() {
		double area = (2*3.14*(radius*radius))+(2*3.14*radius*height);
		System.out.println("Area of Cylinder is: "+area);
	}

	@Override
	public void volume() {
		double volume = 3.14*(radius*radius)*height;
		System.out.println("Volume of Cylinder is: "+volume);
	}


}
