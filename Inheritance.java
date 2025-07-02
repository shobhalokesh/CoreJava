package Assignments;

 class Inheritance1 {
	
	public void method1()
	{
		System.out.println("Inheritance");
	}
	
}
	class child extends Inheritance1
	{
		public void display()
		{
			System.out.println("ChildInherited");
		}
	}
	
	public class Inheritance
	{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c1= new child();
		c1.method1();
		c1.display();
		//System.out.println(c1.inheritance+ " " +c1.child1);

	}
	
}
