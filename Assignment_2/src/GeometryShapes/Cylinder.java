package GeometryShapes;

import java.util.Scanner;

public class Cylinder implements Calculator {

	private double radius;
	private double height;
	
	

	public double getRadius() {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Radius of Cylinder");
		    String r = s.nextLine();
		    double radius = Double.parseDouble(r);
			return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Height of Cylinder");
        String h = s.nextLine();
        double height = Double.parseDouble(h);
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double area() {
		double area = (2*3.14*(radius*radius))+(2*3.14*radius*height);
		System.out.println("Area of Cylinder is: "+area);
		return 0;
	}

	@Override
	public double volume() {
		double volume = 3.14*(radius*radius)*height;
		System.out.println("Volume of Cylinder is: "+volume);
		return 0;
	}


}
