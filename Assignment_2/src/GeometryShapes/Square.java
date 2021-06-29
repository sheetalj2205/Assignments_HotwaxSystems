package GeometryShapes;

import java.util.Scanner;

public class Square implements Calculator {

    private double side;
	

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		  this.side = side;
	}

	@Override
	public void perimeter() {
		double perimeter = 4*side;
		System.out.println("Perimeter of Sqaure is: "+perimeter);
	}

	@Override
	public void area() {
		double area = (side*side);
		System.out.println("Area of Square is: "+area);
	}

	@Override
	public void volume() {
		// TODO Auto-generated method stub
	}


}
