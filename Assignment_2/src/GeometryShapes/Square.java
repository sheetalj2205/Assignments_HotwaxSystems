package GeometryShapes;

import java.util.Scanner;

public class Square implements Calculator {

    private double side;
	
    

	public Square(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		  this.side = side;
	}

	@Override
	public double perimeter() {
		double perimeter = 4*side;
		return perimeter;
	}

	@Override
	public double area() {
		double area = (side*side);
		return area;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0.0;
	}


}
