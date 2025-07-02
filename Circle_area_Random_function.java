package Assignments;

import java.util.Scanner;

public class Circle_area_Random_function {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =0; i<=50;i++)
		{
			//Scanner s1 = new Scanner(System.in);
			 
			//System.out.println("Enter the Radius of a circle");
		    double  Area ;
		    double r = Math.random();
		    Area= Math.PI*r*r;
			System.out.println(i+ " = Area of a circle is: " +Area);
			
		}
	}

}
