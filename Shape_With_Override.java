package practice_Programs;
import java.util.Scanner;

class Shape2
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

class rectangle1 extends Shape1
{
	@Override
	public void getArea()
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

public class  Shape_With_Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape2 s2 = new Shape2(); 
		rectangle1 r = new rectangle1();
		r.getArea();
		s2.getArea();
	}

}