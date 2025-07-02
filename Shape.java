package practice_Programs;

import java.util.Scanner;

class Shape1
{
	public void getArea()
	{
		int l, b;
		double Area; 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Length of the Rectangle");
		l =s.nextInt();
		System.out.println("Enter the Breadth of the Rectangle");
		b =s.nextInt();
		Area = l *b; 
		System.out.println("Area of a Rectangle is: " + Area);
		s.close();
	}
}

class rectangle extends Shape1
{
	public void RectangleArea()
	{
		int l = 12;
		int  b = 14;
		double Area; 
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter the Length of the Rectangle");
		l =s.nextInt();
		System.out.println("Enter the Breadth of the Rectangle");
		b =s.nextInt();*/
		Area = l *b; 
		System.out.println("Area of a Rectangle is: " + Area);
	}
}

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rectangle r = new rectangle();
		r.RectangleArea();
		r.getArea();
	}

}
