package Assignments;

class Non_Parameter
{
	Non_Parameter()
	{
		System.out.println("No Parameters");
	}
}


public class Non_Parameterized_SuperCallingStatement_Ass18 extends Non_Parameter {

	Non_Parameterized_SuperCallingStatement_Ass18()
	{
		super();
		System.out.println("Non_Parameterized_SuperCallingStatement_Ass18");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Non_Parameterized_SuperCallingStatement_Ass18();

	}

}
