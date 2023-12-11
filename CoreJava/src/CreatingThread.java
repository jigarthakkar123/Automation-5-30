class NewThread extends Thread
{
	public NewThread() {
		super("Child Thread");
		start();
	}
	public void run() {
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(this+" : "+i);
				Thread.sleep(700);
			}
		} catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println("Child Thread Exiting");
	}
	
}
public class CreatingThread {

	public static void main(String[] args) {
		new NewThread();
		Thread t=Thread.currentThread();
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(t+" : "+i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("Exception Caught");
		}
		System.out.println("Main Thread Exiting");
	}
}
