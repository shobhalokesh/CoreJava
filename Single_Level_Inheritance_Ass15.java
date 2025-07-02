package Assignments;

class Animal
{
	public void sound()
	{
		System.out.println("Animal sounds");
	}
}

class dog  extends Animal
{
	public void dogsound()
	{
		System.out.println("Dog barks");
	}
}

public class Single_Level_Inheritance_Ass15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d=new dog();
		d.sound();
		d.dogsound();
		System.out.println("Animal class is inherited by Dog Class");
	}

}
