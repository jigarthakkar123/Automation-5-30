import java.util.Scanner;

class Box
{
	double width,height,depth;
	Box()//Default Constructor
	{
		System.out.println("Default Constructor Called");
		width=3;
		height=4;
		depth=5;
	}
	Box(double w,double h,double d)//Parameterized
	{
		System.out.println("Parameterized Constructor");
		width=w;
		height=h;
		depth=d;
	}
	Box(Box b)//Copy
	{
		System.out.println("Copy Constructor Called");
		width=b.width;
		height=b.height;
		depth=b.depth;
	}
	void volume()
	{
		System.out.println("Volume : "+(width*height*depth));
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		double w,h,d;
		Scanner sc=new Scanner(System.in);
		Box b1=new Box();//Object Creation
		b1.volume();
		System.out.print("Enter Width : ");
		w=sc.nextDouble();
		System.out.print("Enter Height : ");
		h=sc.nextDouble();
		System.out.print("Enter Depth : ");
		d=sc.nextDouble();
		Box b2=new Box(w,h,d);
		b2.volume();
		
		Box b3=new Box(b2);
		b3.volume();
		
	}
}
