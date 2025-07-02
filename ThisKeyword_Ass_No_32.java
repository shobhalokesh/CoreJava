package Assignments;

public class ThisKeyword_Ass_No_32 {
	int sal =23400;
	String name = "ABCD";
	
	void emp(int income, String Empname)
	{
		//income =34500;
		//Empname = " Laxmi ";
		System.out.println("Local Variable: "+income);
		System.out.println("Local Variable Name: "+Empname);
		this.name =Empname;
		this.sal=income;
		System.out.println("Assigning Local Variable to global vairable Name: "+this.name);
		System.out.println("Assigning Local Variable to global vairable sal: "+this.sal);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method 
		ThisKeyword_Ass_No_32 t= new ThisKeyword_Ass_No_32();
		t.emp(34500, "Laxmi");
		System.out.println("Global variable sal : "+t.sal);
		System.out.println("Global Variable name : "+ t.name);

	}

}
