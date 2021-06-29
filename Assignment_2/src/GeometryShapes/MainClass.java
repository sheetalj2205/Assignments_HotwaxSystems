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
	        int choice = s.nextInt();
	        
	        
	        //based on the choice find area, perimeter and volume of corresponding shape
	        switch(choice) {
			  case 1: 
			          System.out.println("Enter Radius of Cicle");
			          double radius = s.nextDouble();
			          Circle circle = new Circle(radius);
			          System.out.println("Area of Circle is: "+ circle.area());
			          System.out.println("Perimeter of Circle is: "+ circle.perimeter());
			        break;
			         
			  case 2: 
				      System.out.println("Enter length of Rectangle");
				      double length = s.nextDouble();
				      System.out.println("Enter breadth of Rectangle");
				      double breadth = s.nextDouble();
				      Rectangle rect = new Rectangle(length,breadth);
				      System.out.println("Area of Rectangle is:"+ rect.area());
				      System.out.println("Perimeter of Rectangle is: "+ rect.perimeter());
	                break;
	                
			  case 3: 
				      System.out.println("Enter Height of Triangle");
				      double height = s.nextDouble();
				      System.out.println("Enter Base of Triangle");
				      double base = s.nextDouble();
				      System.out.println("Enter Side of Triangle");
				      double side = s.nextDouble();
				      Traingle triangle = new Traingle(height,base,side);
				      System.out.println("Perimeter of Triangle is: "+ triangle.perimeter());
				      System.out.println("Area of Triangle is: "+ triangle.area());
                    break;
              
			  case 4: 
				      System.out.println("Enter Side of Square");
				      double sideOfSquare = s.nextDouble();
				      Square square = new Square(sideOfSquare);
				      System.out.println("Area of Square is: "+ square.area());
		              System.out.println("Perimeter of Sqaure is: "+ square.perimeter());
		           break;
		           
			  case 5: 
				      System.out.println("Enter Radius of Sphere");
				      double radiusOfSphere = s.nextDouble();
				      Sphere sphere = new Sphere(radiusOfSphere);
				      System.out.println("Area of Sphere is: "+ sphere.area());
				      System.out.println("Volume of Sphere is: "+ sphere.volume());
				    break;
			  
			  case 6: 
				  
				     System.out.println("Enter Radius of Cylinder");
				     double radiusOfCylinder = s.nextDouble();
				     System.out.println("Enter Height of Cylinder");
				     double heightOfCylinder = s.nextDouble();
				     Cylinder cylinder = new Cylinder(radiusOfCylinder,heightOfCylinder);
				     System.out.println("Area of Cylinder is: "+ cylinder.area());
				     System.out.println("Volume of Cylinder is: "+ cylinder.volume());
				   break;
				   
		      default:
		    	    System.out.println("Wrong Choice Entered");
			}
		
	     }catch(NullPointerException e) {
			System.out.println("Please input a number!");
			e.printStackTrace();
		  }
	 }while(x==1);
		
  }

}

