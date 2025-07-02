package Assignments;

public class FourNonstaticParameterized1_Ass_No_28 {
	void Nonstaticmethod1(int a)
	{
		System.out.println("Interger argument" +a);
	}
	void Nonstaticmethod2(double b, float c)
	{
		System.out.println("Non staticParameter arguments"+b);
		System.out.println(c);
	}
	void Nonstaticmethod3(String a, String b)
	{
		System.out.println("Nonstaticmethod3 parameters"+a);
		System.out.println(b);
	}
	void Nonstaticmethod4(int a, double b, String c)
	{
		System.out.println("Nonstaticmethod4 Parameters "+a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		FourNonstaticParameterized1_Ass_No_28 ns = new FourNonstaticParameterized1_Ass_No_28();
		
		ns.Nonstaticmethod1(22);;
		ns.Nonstaticmethod2(12.4, 23);
		ns.Nonstaticmethod3("Rama","Sita");
		ns.Nonstaticmethod4(12, 45.3,"Laxman");
	}
}
