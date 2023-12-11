import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(1,"Jigar");
		map.put(2,"Janki");
		map.put(3,"Kiran");
		map.put(4,"Rashmi");
		map.put(1,"Bansari");
		System.out.println(map);
		System.out.println(map.get(2));
		System.out.println(map.entrySet());
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
