public class MethodOverloading {

	void test()
	{
		System.out.println("Test with no argument");
	}
	void test(int a)
	{
		System.out.println("test with 1 argument");
	}
	void test(int a,int b)
	{
		System.out.println("test with 2 argument");
	}
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.test(10);
		m.test();
		m.test(10,20);
	}
}
