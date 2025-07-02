package Assignments;

public class StaticNonStaticMethod_Ass_No_26 {
	static int n1=34;
	 static int n2=23;
	static int result;
	public static void add()
	{
		result= n1+n2;
		System.out.println("Addition of two numbers are: " +result);
	}
	void sub()
	{
		result = n1-n2;
		System.out.println("Subtraction of two numbers are: " +result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();//Static method
		StaticNonStaticMethod_Ass_No_26 a1= new StaticNonStaticMethod_Ass_No_26();
		
		a1.sub();//not static method
	}

}
