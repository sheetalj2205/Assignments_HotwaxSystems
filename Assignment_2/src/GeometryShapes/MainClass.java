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
	        System.out.println("Enter the number of your choice!");
	        String userInput = s.nextLine();
	        int choice = Integer.parseInt(userInput);
	        
	        
	        //based on the choice find area, perimeter and volume of corresponding shape
	        switch(choice) {
			  case 1: 
			          System.out.println("Enter Radius of Cicle");
			          double radius = s.nextDouble();
			          Circle circle = new Circle();
			          circle.setRadius(radius);
			          circle.area();
			          circle.perimeter();
			        break;
			         
			  case 2: 
				      System.out.println("Enter length of Rectangle");
				      double length = s.nextDouble();
				      System.out.println("Enter breadth of Rectangle");
				      double breadth = s.nextDouble();
				      Rectangle rect = new Rectangle();
				      rect.setLength(length);
				      rect.setBreadth(breadth);
				      rect.area();
				      rect.perimeter();
	                break;
	                
			  case 3: 
				      System.out.println("Enter Height of Triangle");
				      double height = s.nextDouble();
				      System.out.println("Enter Base of Triangle");
				      double base = s.nextDouble();
				      System.out.println("Enter Side of Triangle");
				      double side = s.nextDouble();
				      Traingle triangle = new Traingle();
			          triangle.setHeight(height);
			          triangle.setBase(base);
			          triangle.setSide(side);
			          triangle.area();
			          triangle.perimeter(); 
                    break;
              
			  case 4: 
				      System.out.println("Enter Side of Square");
				      double sideOfSquare = s.nextDouble();
				      Square square = new Square();
		              square.setSide(sideOfSquare);
		              square.area();
		              square.perimeter();
		           break;
		           
			  case 5: 
				      System.out.println("Enter Radius of Sphere");
				      double radiusOfSphere = s.nextDouble();
				      Sphere sphere = new Sphere();
				      sphere.setRadius(radiusOfSphere);
				      sphere.area();
				      sphere.volume();
				    break;
			  
			  case 6: 
				     System.out.println("Enter Radius of Cylinder");
				     double radiusOfCylinder = s.nextDouble();
				     System.out.println("Enter Height of Cylinder");
				     double heightOfCylinder = s.nextDouble();
				     Cylinder cylinder = new Cylinder();
				     cylinder.setRadius(radiusOfCylinder);
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

