package GeometryShapes;

import java.util.Scanner;

public class Rectangle implements Calculator {

	private double length;
	private double breadth;
	

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
	public void perimeter() {
		double perimeter = 2*(length+breadth) ;
		System.out.println("Perimeter of Rectangle is: "+perimeter);
	}

	@Override
	public void area() {
		double area = (length*breadth);
		System.out.println("Area of Rectangle is:"+area);
	}

	@Override
	public void volume() {
		// TODO Auto-generated method stub
	
	}

}
