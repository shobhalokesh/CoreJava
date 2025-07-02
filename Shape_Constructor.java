package practice_Programs;

import java.util.Scanner;

class Shape3
{
	public double getArea()
	{
		return 0.0;
	}
}

class rectangle2 extends Shape3
{
	double length, breadth;
	
	public  rectangle2(double length, double breadth)
	{
		this.length = length;
		this.breadth= breadth;
		
		
	}
	@Override
	public double getArea()
	{
		return length*breadth; 
	}
}

public class Shape_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rectangle2 r2= new rectangle2(2.5, 3.5);
	double area= r2.getArea(); 
	
	System.out.println("The area of the rectangle is: " + area);
	
	}

}
