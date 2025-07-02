package Assignments;


class Nonstatic
{
	void Nonstatic()
	{
		System.out.println("Non static Method ");
	}
}
public class Non_static_Method_InMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nonstatic NS = new Nonstatic();
		NS.Nonstatic();
	}

}
