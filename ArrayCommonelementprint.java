package practice_Programs;

public class ArrayCommonelementprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1[] = new int[4];
		array1[0]=23;
		array1[1]=13;
		array1[2]=65;
		array1[3]=43;
		
		int array2[] = new int[4];
		array2[0]=23;
		array2[1]=53;
		array2[2]=65;
		array2[3]=43;
		//array2[3]=33;
		
		for(int i =0;i<array1.length;i++)// for array1
		{
			for(int j=0;j<array2.length;j++) //for array2
			{
				if(array1[i]==array2[j])
				{
					System.out.println(array1[j]);
				}
			}
		}
		
	}
	

}
