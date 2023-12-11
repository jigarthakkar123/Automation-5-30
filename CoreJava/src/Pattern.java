public class Pattern {

	public static void main(String[] args) {
		int i,j,k;
		for(i=73;i>64;i--)
		{
			for(k=0;k<73-i;k++)
			{
				System.out.print(" ");
			}
			for(j=65;j<=i;j++)
			{
				System.out.print(" "+(char)j);
			}
			System.out.println();
		}
	}
}
