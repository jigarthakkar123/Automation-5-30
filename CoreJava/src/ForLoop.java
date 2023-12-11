import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		int i,sum=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N : ");
		n=sc.nextInt();
		for(i=n;i>0;i--)
		{
			sum=sum+i;
		}
		System.out.println("Sum : "+sum);
	}
}
