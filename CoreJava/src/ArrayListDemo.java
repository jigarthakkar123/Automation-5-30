import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(10.10);
		al.add("tops");
		al.add('t');
		al.add(true);
		al.add(null);
		al.add(10);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.indexOf(10));
		System.out.println(al.lastIndexOf(10));
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
