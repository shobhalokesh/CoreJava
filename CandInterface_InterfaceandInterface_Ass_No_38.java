package Assignments;

interface Drawable
{
	void Draw();
}
interface shape extends Drawable
{
	double getarea();
}

class Rectangle implements shape
{

	public int width;
	public int breadth;
	
	public void rectangle(int width, int breadth)
	{
	this.breadth=breadth;
	this.width=width;
	}
	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a rectangle");
	}

	@Override
	public double getarea() {
		// TODO Auto-generated method stub
		return width*breadth;
	}
	
}
public class CandInterface_InterfaceandInterface_Ass_No_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		rect.rectangle(23, 22);
		rect.Draw();
		System.out.println("Area of a rectangle: "+rect.getarea());

	}

}
