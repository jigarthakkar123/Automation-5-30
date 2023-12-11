interface ifs1
{
	void meth1();
}
interface ifs2
{
	void meth2();
}
class Demo2 implements ifs2
{
	public void meth2() {
		System.out.println("Meth2 Defined In Demo2");
	}
}
public class InterfaceDemo implements ifs1,ifs2{

	public void meth1() {
		System.out.println("Meth1");
	}

	public void meth2() {
		System.out.println("Meth2");
	}
	public static void main(String[] args) {
		InterfaceDemo i=new InterfaceDemo();
		i.meth1();
		i.meth2();
		
		Demo2 d=new Demo2();
		d.meth2();
	}
}
