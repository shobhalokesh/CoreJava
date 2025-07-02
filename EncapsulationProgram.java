package practice_Programs;

class CustomerData
{
	private String un ="contact@gmail.com";
	private String password = "password@234";
	private int age =34;
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class EncapsulationProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerData cs= new CustomerData();
		cs.setUn("contact@Yahoo.com");
		System.out.println(cs.getUn());
		cs.setPassword("Test");
		System.out.println(cs.getPassword());
		cs.setAge(23);
		System.out.println(cs.getAge());	
	}

}
