package practice_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str1 = s1.next();
		System.out.println("Enter the second String");
		String str2 = s1.next();
		
		if(str1.length()!= str2.length())
		{
			System.out.println("Entered String is not of same length hence its not an anagram");
		}
		else
		{
			char c1[] = str1.toCharArray();
			char c2[] = str2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println("First String is :" +c1);
			System.out.println("Second String is : " +c2);
				if(Arrays.equals(c1, c2)==true)
				{
					
					System.out.println("Entered strings are Anagram");
				}
				else
				{
					System.out.println("Entered Strings are not Anagram");
				}
		}
		
		s1.close();
		
	}

}
