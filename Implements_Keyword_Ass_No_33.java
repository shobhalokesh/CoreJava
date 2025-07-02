package Assignments;

import java.util.Scanner;

interface interface1
{
	void add();
	
}
public class Implements_Keyword_Ass_No_33 implements interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implements_Keyword_Ass_No_33 a = new Implements_Keyword_Ass_No_33();
		a.add();
		

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a = 0, b, result;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a = s.nextInt();
		
		System.out.println("Enter the second number: ");
		b = s.nextInt();
		
		result = a +b;
		System.out.println("Addition of two integers: " +result);
		
		
		
	}

}
