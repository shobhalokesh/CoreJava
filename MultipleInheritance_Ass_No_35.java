package Assignments;
interface interface3
{
	void method1();	
}

interface interface2
{
	void method2();
}
public class MultipleInheritance_Ass_No_35 implements interface3, interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance_Ass_No_35 m= new MultipleInheritance_Ass_No_35();
		m.method1();
		m.method2();
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		{
			System.out.println("Method2");
		}
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		{
			System.out.println("Method1");
		}
	}

}
