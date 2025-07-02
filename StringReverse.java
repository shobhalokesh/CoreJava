package practice_Programs;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String instr = "auto";
		String outstr ="";
		
		char c1 = instr.charAt(3);
		char c2 = instr.charAt(2);
		char c3 = instr.charAt(1);
		char c4 = instr.charAt(0);
		
		//System.out.print(c1);
		//System.out.print(c2);
		//System.out.print(c3);
		//System.out.print(c4);
		
		for (int i =instr.length()-1;i>=0;i--)
		{
			char c5 = instr.charAt(i);
			outstr = outstr+c5;
		}
		System.out.print(outstr);
		
	}

}
