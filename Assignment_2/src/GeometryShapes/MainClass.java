package GeometryShapes;

import java.util.Scanner;


public class MainClass {
	
	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		int x=1;
		do {
		   try {
			System.out.println("For which Shape you want to calculate area, perimeter and volume?");
			System.out.println("1. Circle");
	        System.out.println("2. Rectangle");
	        System.out.println("3. Triangle");
	        System.out.println("4. Square");
	        System.out.println("5. Sphere");
	        System.out.println("6. Cylinder");
	        System.out.println("Enter the number of your choice!\n");
	        int choice = s.nextInt();
	        
	        
	        //based on the choice find area, perimeter and volume of corresponding shape
	        switch(choice) {
			  case 1: 
			          Circle circle = new Circle();
			          double radius = circle.getRadius();
			          circle.setRadius(radius);
			          circle.area();
			          circle.perimeter();
			        break;
			         
			  case 2: 
				      Rectangle rect = new Rectangle();
				      double length = rect.getLength();
				      rect.setLength(length);
				      double breadth = rect.getBreadth();
				      rect.setBreadth(breadth);
				      rect.area();
				      rect.perimeter();
	                break;
	                
			  case 3: 
				      Traingle triangle = new Traingle();
			          double height = triangle.getHeight();
			          triangle.setHeight(height);
			          double base = triangle.getBase();
			          triangle.setBase(base);
			          double side = triangle.getSide();
			          triangle.setSide(side);
			          triangle.area();
			          triangle.perimeter(); 
                    break;
              
			  case 4: 
				      Square square = new Square();
		              double sideOfSquare = square.getSide();
		              square.setSide(sideOfSquare);
		              square.area();
		              square.perimeter();
		           break;
		           
			  case 5: 
				      Sphere sphere = new Sphere();
				      double radiusOfSphere = sphere.getRadius();
				      sphere.setRadius(radiusOfSphere);
				      sphere.area();
				      sphere.volume();
				    break;
			  
			  case 6: 
				     Cylinder cylinder = new Cylinder();
				     double radiusOfCylinder = cylinder.getRadius();
				     cylinder.setRadius(radiusOfCylinder);
				     double heightOfCylinder = cylinder.getHeight();
				     cylinder.setHeight(heightOfCylinder);
				     cylinder.area();
				     cylinder.volume();
				   break;
				   
		      default:
		    	    System.out.println("Wrong Choice Entered");
			}
		
	     }catch(NumberFormatException e) {
			System.out.println("Please input a number!");
			e.printStackTrace();
		  }
	 }while(x==1);
		
  }

}

