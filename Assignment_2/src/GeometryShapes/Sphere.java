package GeometryShapes;

import java.util.Scanner;

public class Sphere implements Calculator {

    private double radius;
	
	public double getRadius() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Radius of Sphere");
        String r = s.nextLine();
        double radius = Double.parseDouble(r);
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double area() {
		double area = 4*3.14*(radius*radius);
		System.out.println("Area of Sphere is: "+area);
		return 0;
	}

	@Override
	public double volume() {
		double volume = (4/3)*3.14*(radius*radius*radius);
		System.out.println("Volume of Sphere is: "+volume);
		return 0;
	}

}
