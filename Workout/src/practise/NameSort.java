package practise;

import java.util.Comparator;

public class NameSort implements Comparator<Cmp> {
		
		public int compare(Cmp o1,Cmp o2) {
			 return o2.name.compareToIgnoreCase(o1.name);
			 	}
}
