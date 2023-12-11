import java.util.Scanner;

/*Data Type:
 * 
 * byte - 1 byte
 * short - 2 byte
 * int - 4 byte
 * long - 8 byte
 * float - 4 byte
 * double - 8 byte
 * char - 'J','A',';',' '
 * boolean - true/false
 * 
 * Variable : It is a data name & is used to store the data value.
 * 
 * int a=10;
 * 
 * 1. Must start with an alphabet.
 * 2. Upper case & lower case are significant.
 * ASCII : American Standard Code For Information Interchange
 * A-Z : 65 to 90
 * a-z : 97 to 122
 * 3. Space is not allowed between variable name.
 * int a,b;
 * 4. Keyword is not allowed as a variable name.
 * int class;
 * */

public class Variable {

	public static void main(String[] args) {
		double a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextDouble();
		System.out.print("Enter B : ");
		b=sc.nextDouble();
		c=a+b;
		System.out.println("Addition : "+c);
	}
}
