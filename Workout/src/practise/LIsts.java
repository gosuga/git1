package practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LIsts {
	public static void main(String[] args) {
	ArrayList<Integer>a=new  ArrayList<>();
	a.add(1);
	a.add(2);a.add(null);
	
	System.out.println(a);
	Iterator<Integer> t=a.iterator();
	ListIterator<Integer> o = a.listIterator();
	
	while(o.hasPrevious()) {
		Integer s=t.next();
		System.out.println(s);
			}
	
			}

}
