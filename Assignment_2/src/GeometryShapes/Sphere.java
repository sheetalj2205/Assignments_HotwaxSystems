package GeometryShapes;

import java.util.Scanner;

public class Sphere implements Calculator {

    private double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
	}

	@Override
	public void area() {
		double area = 4*3.14*(radius*radius);
		System.out.println("Area of Sphere is: "+area);
	}

	@Override
	public void volume() {
		double volume = (4/3)*3.14*(radius*radius*radius);
		System.out.println("Volume of Sphere is: "+volume);
	}

}
