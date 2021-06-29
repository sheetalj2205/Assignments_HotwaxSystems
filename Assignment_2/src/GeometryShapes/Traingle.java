package GeometryShapes;

import java.util.Scanner;

public class Traingle implements Calculator {

	private double height;
	private double base;
	private double side;
	
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
	public void perimeter() {
		try {
			double peri = (height+base+side);
			System.out.println("Perimeter of Triangle is: "+peri);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void area() {
		double area = (1/2)*(base*height);
		System.out.println("Area of Triangle is: "+area);
	}

	@Override
	public void volume() {
		// TODO Auto-generated method stub
	}
}
