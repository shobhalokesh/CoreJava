package Assignments;

import java.util.Scanner;

public class Switch_case_Ass_No_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		char Operator;
		double num1, num2, result;
	
		Scanner input = new Scanner(System.in);
		
		//User to select the operation
		System.out.println("Please enter the required operation +, -, *, / to be performed: ");
		Operator = input.next().charAt(0);
		
		//user to input the 1st num
		System.out.println("Enter the first number");
		num1= input.nextDouble();
		
		//User to input the 2nd num
		System.out.println("Enter the second number");
		num2= input.nextDouble();
		
		switch(Operator)
		{
		case '+':
			result = num1+num2;
			System.out.println("sum of 2 numbers is: "+ result);
			break;
			
		case '-': 
			result = num1-num2;
			System.out.println("Subtraction of 2 numbers is: "+result);
			break;
			
		case '*': 
			result = num1*num2;
			System.out.println("Product of 2 numbers is: "+result);
			break;
		
		case '/': 
			result  = num1/num2;
			System.out.println("Division of 2 numbers is: "+result);
			break;
			
		default: 
			System.out.println("Invalid operation");
		}
		input.close();
	}
}
