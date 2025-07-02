package Assignments;

class one{
	public void print()
	{
		System.out.println("First Clas A");
	}
}

class two extends one
{
	public void print1()
	{
		System.out.println("Second class inheritaing from A");
	}
}

class three extends two
{
	public void print2()
	{
		System.out.println("third class inheritaing from B");
	}
}
public class Multilevel_Inheritance_Ass_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		three a = new three();
		//two b = new two();
		a.print();
		a.print1();
		a.print2();
		
	}

}
