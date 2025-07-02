package Assignments;

//abstract class
abstract class main1
{
	public String fname ="John";
	public int age =24;
	public abstract void study(); //abstract method
	//concrete method
	public void sub()
	{
		String sub1= "Physics";
		System.out.println(sub1);
	}
	
}
public class Abstraction50_Ass_No_34 extends main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction50_Ass_No_34 ab = new Abstraction50_Ass_No_34();
		ab.study();
		ab.sub();
		System.out.println(ab.age);
		System.out.println(ab.fname);

	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("Study different subjects");
	}

}
