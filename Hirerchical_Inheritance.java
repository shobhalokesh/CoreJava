package Assignments;

class a
{
	public void printa()
	{
		System.out.println("Print A");
	}
}
class b extends a
{
	public void printb()
	{
		System.out.println("Print B");
	}
}
class c extends a
{
	public void printc()
	{
		System.out.println("Print C");
	}
}
class d extends a
{
	public void printd()
	{
		System.out.println("Print D");
	}
}
public class Hirerchical_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 b obj_b = new b();
		obj_b.printa();
		obj_b.printb();
		
		 c obj_c = new c();
		 obj_c.printa();
		 obj_c.printc();
		 
		 d obj_d = new d();
		 obj_d.printa();
		 obj_d.printd();

	}

}
