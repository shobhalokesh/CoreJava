package Assignments;
abstract class Mathclass
{
	int a =10;
	int b = 25;
	abstract void add();
	abstract void sub();
	abstract void mul();
	
	public void div() {
		int divres = b/a;
		System.out.println("Result of Division is: "+divres);
	}
	
}

public class Abstraction80_Ass_No_39 extends  Mathclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction80_Ass_No_39 ab = new Abstraction80_Ass_No_39();
		ab.add();
		ab.sub();
		ab.div();
		ab.mul();
}

	@Override
	void add() {
		// TODO Auto-generated method stub
		int divres = a+b; 
		System.out.println("Result of additon: "+divres);
		
	}

	@Override
	void sub() {
		// TODO Auto-generated method stub
		int divres = b-a; 
		System.out.println("Result of Subtraction: "+divres);
		
	}

	@Override
	void mul() {
		// TODO Auto-generated method stub
		int divres = a*b; 
		System.out.println("Result of Multiplication: "+divres);
		
	}

}
