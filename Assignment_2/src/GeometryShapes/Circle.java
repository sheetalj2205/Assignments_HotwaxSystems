package GeometryShapes;

import java.util.Scanner;

public class Circle implements Calculator {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void perimeter() {
		try {
			double peri = 2*3.14*(this.radius);
			System.out.println("Perimeter of Circle is: "+peri);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
	 }

	@Override
	public void area() {
		try {
		double area = 3.14*(this.radius*this.radius);
		System.out.println("Area of Circle is: "+area);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public void volume() {
		// TODO Auto-generated method stub
	}


}
