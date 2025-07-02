package Assignments;

class animal1
{
	void dog()
	{
		System.out.println("Dog Barks");
	}
}
public class MethodOverriding_Ass_No22 extends animal1 {

	void dog()
	{
		//super.dog(); //super keyword
		System.out.println("Dog is black in colour");
		super.dog(); //super keyword can be present anywhere in the method
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding_Ass_No22 MO = new MethodOverriding_Ass_No22();
		MO.dog();
	}

}
