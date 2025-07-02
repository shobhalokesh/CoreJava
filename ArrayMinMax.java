package practice_Programs;

//WAP to find the min and Max value in an array
public class ArrayMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,4,5, 6,7};
		int max =a[0];
		int min =a[0];
		
		for(int i =0;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max =a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
				
			}
		}
		System.out.println("Maximum value is: "+max);
		System.out.println("Mininum value is: "+min);
	}

}
