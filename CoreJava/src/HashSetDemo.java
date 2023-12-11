import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add(10.10);
		hs.add("tops123");
		hs.add('t');
		hs.add(true);
		hs.add(null);
		hs.add(10);
		System.out.println(hs);
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
