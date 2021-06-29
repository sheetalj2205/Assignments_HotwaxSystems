package GeometryShapes;

import java.util.Scanner;

public class Circle implements Calculator {

	private double radius;

	public double getRadius() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Radius of Cicle");
        String r = s.nextLine();
        double radius = Double.parseDouble(r);
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double perimeter() {
		try {
		double peri = 2*3.14*(this.radius);
		System.out.println("Perimeter of Circle is: "+peri);
		return 0;
		}catch(ArithmeticException e) {
			e.printStackTrace();
			return 0;
		  }
	}

	@Override
	public double area() {
		double area = 3.14*(this.radius*this.radius);
		System.out.println("Area of Circle is: "+area);
		return 0;
	}


	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}


}
