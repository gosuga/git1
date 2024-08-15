	package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Cmp   {
	String name;
	int id;
	
	public Cmp(String name,int id) {
		this.name=name;
		this.id=id;
	}
	public String toString() {
		return "{name:"+name+" "+"id:"+" "+id+"}";
	}
	
	
	public static void main(String[] args) {
		ArrayList<Cmp> a=new ArrayList<Cmp>();
		a.add(new Cmp("ram", 10));
		a.add(new Cmp("sita", 20));
		a.add(new Cmp("ganesh", 50));
		System.out.println(a);
		Sort s1 =new Sort();
		Collections.sort(a,s1);
		System.out.println(a);
		
		
		Iterator t1= a.iterator();
		while(t1.hasNext()) {
			Cmp c=(Cmp)t1.next();
			System.out.println(c.name+" "+c.id);
			
		}
		NameSort ns=new NameSort();
		Collections.sort(a,ns);
		System.out.println(a);
			
	}

}
