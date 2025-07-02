package practice_Programs;

 class Animal1 {
	
	public void makesound()
	{
		System.out.println("sound of Animals");
	}
}
 class Cat extends Animal1
	{
		@Override
		public void makesound()
		{
			System.out.println("sound of Cat");
		}
	}

	public class Animal
	{
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Cat c = new Cat();
		Animal1 animal = new Animal1();
		c.makesound();
		animal.makesound();
	
	}
	
}
