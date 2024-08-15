package practise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collection {
	public static void main(String[] args) {

		List<Integer> a = new LinkedList<>();
		a.add(1);
		a.add(2);
		//a.add(3);

		Object[] sd = a.toArray();

		for (int i = 1; i < sd.length; i++) {
			System.out.println(sd[i]);
		}
		Iterator<Integer> b = a.iterator();
		while (b.hasNext()) {
			System.out.println(b.next());
		}

	}

}
