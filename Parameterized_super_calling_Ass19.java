package Assignments;

class Parameter
{
	Parameter()
	{
		super();
	System.out.println("Parameters ");
	}
}	

class Parameter3 extends Parameter
{
	
	Parameter3(String a)
	{
		super();
	System.out.println("Parameters 3");
	}

}
public class Parameterized_super_calling_Ass19 extends Parameter3 {

	Parameterized_super_calling_Ass19()
	{
		super("SITA");
		System.out.println("Parameterized_super_calling_Ass19");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new  Parameterized_super_calling_Ass19();
	}
}
