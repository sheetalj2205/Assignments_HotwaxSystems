package GeometryShapes;

import java.util.Scanner;

public class Sphere implements Calculator {

    private double radius;
    
    
	
	public Sphere(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	public double area() {
		double area = 4*3.14*(radius*radius);
		return area;
	}

	@Override
	public double volume() {
		double volume = (4/3)*3.14*(radius*radius*radius);
		return volume;
	}

}
