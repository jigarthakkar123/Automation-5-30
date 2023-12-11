abstract class RBI
{
	abstract void roi(double r);
}
class SBI extends RBI
{
	void roi(double r) {
		System.out.println("Rate Of Interest By SBI Is : "+r);
	}
}
class ICICI extends RBI
{
	void roi(double r) {
		System.out.println("Rate Of Interest By ICICI Is : "+r);
	}
}
class HDFC extends RBI
{
	void roi(double r) {
		System.out.println("Rate Of Interest By HDFC Is : "+r);
	}
}
public class Bank {

	public static void main(String[] args) {
		SBI s=new SBI();
		ICICI i=new ICICI();
		HDFC h=new HDFC();
		
		s.roi(6.3);
		i.roi(6.9);
		h.roi(7.1);
	}
}
