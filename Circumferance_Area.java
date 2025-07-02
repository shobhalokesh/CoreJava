package Assignments;

import java.util.Scanner;

public class Circumferance_Area {
	static Scanner s1 = new Scanner(System.in);
	static void Circle()
	{
		System.out.println("Enter the Value of R");
		
		double r = s1.nextDouble();
		double Area = Math.PI*r*r;
		System.out.println("Area of a circle is: ");
		System.out.println(Area);
		double circumferance = 2*Math.PI*r;
		System.out.println("circumferance of a circle is: ");
		System.out.println(circumferance);
	
	}
	static void Rectangle()
	{
		System.out.println("Enter the Value of L");
		
		double l = s1.nextDouble();
		System.out.println("Enter the Value of B");
		
		double b = s1.nextDouble();
		double Area = l*b;
		System.out.println("Area of a Rectangle is: ");
		System.out.println(Area);
		double circumferance = 2*l+2*b;
		System.out.println("circumferance of a Rectangle is: ");
		System.out.println(circumferance);
	
	}
	
	static void Square()
	{
		System.out.println("Enter the Value of Side");
		
		double l = s1.nextDouble();
		
		double Area = l*l;
		System.out.println("Area of a Square is: ");
		System.out.println(Area);
		double circumferance = 4*l;
		System.out.println("circumferance of a Square is: ");
		System.out.println(circumferance);
	
	}
	
	static void Triangle()
	{
		System.out.println("Enter the Value of side1");
		
		double l1 = s1.nextDouble();
		System.out.println("Enter the Value of side2");
		
		double l2 = s1.nextDouble();
		System.out.println("Enter the Value of side3");
		
		double l3 = s1.nextDouble();
		double Area = .5*l1*l2;
		System.out.println("Area of a Triangle is: ");
		System.out.println(Area);
		double circumferance = l1+l2+l3;
		System.out.println("circumferance of a Triangle is: ");
		System.out.println(circumferance);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle();
		Rectangle();
		Square();
		Triangle();
		
		s1.close();
	}
	
	

}
