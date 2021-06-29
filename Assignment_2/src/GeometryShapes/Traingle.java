package GeometryShapes;

import java.util.Scanner;

public class Traingle implements Calculator {

	private double height;
	private double base;
	private double side;
	
	public double getHeight() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Height of Triangle");
        String h = s.nextLine();
        double height = Double.parseDouble(h);
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Base of Triangle");
        String b = s.nextLine();
        double base = Double.parseDouble(b);
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getSide() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Side of Triangle");
        String sd = s.nextLine();
        double side = Double.parseDouble(sd);
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double perimeter() {
		double peri = (height+base+side);
		System.out.println("Perimeter of Triangle is: "+peri);
		return 0;
	}

	@Override
	public double area() {
		double area = (1/2)*(base*height);
		System.out.println("Area of Triangle is: "+area);
		return 0;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}
}
