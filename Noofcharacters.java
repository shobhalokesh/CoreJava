package practice_Programs;

import java.util.Arrays;

public class Noofcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, countofalpha=0;
		int countofdigit =0;
		int  countofspace =0;
		int countofsplchar =0;
		
		String str = "Automation !@#$%^^ 1234455";
		
		char[] c = str.toCharArray();
		System.out.println(Arrays.toString(c));
		
		for(i=0;i<c.length;i++);
		
		{
			boolean b1 = Character.isAlphabetic(c[i]);
			boolean b2 = Character.isDigit(c[i]);
			boolean b3 = Character.isWhitespace(c[i]);
			
			{
				if(b1== true)
				{
					countofalpha++;
					
				}	
				if(b2==true)
				{
					countofdigit++;
				}
				if(b3==true)
				{
					countofspace++;
				}
			}
		}
		countofsplchar = str.length()-(countofalpha+countofdigit+countofdigit);
		System.out.println("No of Characters in a given String is: " +countofalpha);
		System.out.println("No of Characters in a given String is: " +countofdigit);
		System.out.println("No of Characters in a given String is: " +countofspace);
		System.out.println("No of Characters in a given String is: " +countofsplchar);
	}

}
