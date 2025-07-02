package Assignments;

public class This_calling_Statement_Ass_20 {
	This_calling_Statement_Ass_20()
	{
		this(2);
		System.out.println("1");
	}
	This_calling_Statement_Ass_20(int a)
	{
		this("SITA");
		System.out.println("2");
	}

	This_calling_Statement_Ass_20(String b)
	{
		this(23.4);
		System.out.println("3");
	}
	This_calling_Statement_Ass_20(double a)
	{
		System.out.println("4");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new This_calling_Statement_Ass_20();
	}

}
