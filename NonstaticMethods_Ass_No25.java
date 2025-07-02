package Assignments;

class area
{
	void areaofcircle()
	{
		double r = Math.random();
		double area = Math.PI*r*r;
		System.out.println("Area of a circle is: "+area);
	}
	void areaofsquare()
	{
		double a = Math.random();
		double area = a*a;
		System.out.println("Area of a Square is: "+area);
		
	}
	 void areaofrectangle()
	{
		int l =4;
		int b =2;
		int area = l*b;
		System.out.println("Area of a rectangle: "+area);
		
	}
}

public class NonstaticMethods_Ass_No25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area a=new area();
		a.areaofcircle();
		a.areaofrectangle();
		a.areaofsquare();
	}

}
