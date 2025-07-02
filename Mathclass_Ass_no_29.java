package Assignments;

public class Mathclass_Ass_no_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum= Math.addExact(6, 30); 
		System.out.println("Addition of 2 integers: "+sum);
		
		long sum1= Math.addExact(34, 54);
		System.out.println("Addition of two long numbers: "+sum1);
		
		int sub= Math.subtractExact(80, 56);
		System.out.println("Subtraction of 2 integers: "+sub);
		
		long sub1 = Math.subtractExact(65, 67);
		System.out.println("Subtraction of 2 long numbers: "+sub1);
		
		int mul = Math.multiplyExact(23, 54);
		System.out.println("Multiplication of 2 integers: "+mul);
		
		long mul1= Math.multiplyExact(3564564, 34);
		System.out.println("Multiplication of integer and long number: "+ mul1);
		
		long mul2= Math.multiplyExact(45466, 2324);
		System.out.println("Multiplication of 2 long numbers: "+mul2);
		
		long mul3=Math.unsignedMultiplyHigh(424, 2324);
		System.out.println(mul3);
		
		double min=Math.min(324, 324.5);
		System.out.println("Min of 2 double is: "+min);
		
		int min1 =Math.min(324, 232);
		System.out.println("Smallest of two integers: "+min1);
		
	}

}
