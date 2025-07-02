package practice_Programs;

import java.util.Scanner;

public class String_concatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first String: ");
		a = s.nextLine();
		System.out.println("Enter the Second String: ");
		b = s.nextLine();
		String_concatenation  sc =new String_concatenation();
		c = sc.concat(a, b);
	System.out.println("Concatenated string is:  " + c);
		
	}
	String concat(String x, String y)
	{
		String z;
		z = x + " " + y;
				
		return z;
		
	}

}
