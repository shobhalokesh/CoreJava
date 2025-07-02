package practice_Programs;

import java.util.Arrays;

public class Elementfrequencyinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = new int[4];
		array1[0] = 78;
		array1[1] = 23;
		array1[2] = 23;
		array1[3] = 67;
		
			Arrays.sort(array1);
			int count = 1;
			System.out.println(Arrays.toString(array1));
			
			for(int i=1; i<array1.length+1;i++)
			{
				if(array1[i]==array1[i-1])
				{
				count++;
				
			}
			else
			{
				System.out.println("The element at index "+ (i-1) +" has occured " +count);
				count =1;
			}
				System.out.println("The element at index "+ (i-1) +" has occured " +count);
			}
	}

}
