package practice_Programs;
//WAP to fin the second largest element in an array
public class SecondLargest {
	
	public static int SecondLargest(int a[], int total)// a is an array and total is size of an array
	{
		int temp;
		for(int i =0;i<=total;i++)
		{
			for (int j =i+1;j<=total;i++)
			{
				temp =a[i];
				a[i] =a[j];
				a[j] = temp;
			}
		}
		return a[total -2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {12,23,43,22,45,76,45,78,65};
		System.out.println(SecondLargest(a, 9));

	}

}
