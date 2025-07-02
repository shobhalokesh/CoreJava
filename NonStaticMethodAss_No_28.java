package Assignments;

public class NonStaticMethodAss_No_28 {
	 void add()
	{
		int a =5;
		int b = 7; 
		int c = a+b; 
		System.out.println("addition of a and b is: ");
		System.out.println(c);
		
	}
	
	 void sub()
	{
		int a =15;
		int b = 7; 
		int c = a-b; 
		System.out.println("Sub of a and b is: ");
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticMethodAss_No_28 Ns = new NonStaticMethodAss_No_28();
		Ns.add();
		Ns.sub();

	}

}
