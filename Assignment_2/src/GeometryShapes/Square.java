package GeometryShapes;

import java.util.Scanner;

public class Square implements Calculator {

    private double side;
	

	public double getSide() {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Side of Square");
	        String sideOfSqaure = s.nextLine();
	        double side = Double.parseDouble(sideOfSqaure);
			return side;
		}catch(NumberFormatException e) {
			System.out.println("Please input a number!");
			e.printStackTrace();
			return 0;
		}
	}

	public void setSide(double side) {
		  this.side = side;
	}

	@Override
	public double perimeter() {
		double perimeter = 4*side;
		System.out.println("Perimeter of Sqaure is: "+perimeter);
		return 0;
	}

	@Override
	public double area() {
		double area = (side*side);
		System.out.println("Area of Square is: "+area);
		return 0;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}


}
