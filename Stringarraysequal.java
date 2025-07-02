package practice_Programs;
//wap to print if the elements of 2 arrays are equal.
import java.util.Arrays;

public class Stringarraysequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name[] = {"San","Tan", "Ban"};
		String name1[] = {"San","Tan", "Ban"};
		
		boolean ans = Arrays.equals(name, name1);
		System.out.println(ans);
		
		if(ans == true)
		{
			System.out.println("Given arrays are equal");
		}
		else
		{
			System.out.println("Given arrays are not equal");
		}

	}

}
