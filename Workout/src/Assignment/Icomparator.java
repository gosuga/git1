package Assignment;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Icomparator  {
	int value;
	String name;
	public  Icomparator(int value,String name) {
		this.value=value;
		this.name=name;
	}
	public String toString() {
		return value+" "+ name;
	}
public static void main(String[] args) {
	List<Icomparator> c=new ArrayList<>();
	c.add(new Icomparator(3,"apple"));
	c.add(new Icomparator(2,"bay"));
	c.add(new Icomparator(4,"cat"));
Comparator<Icomparator>q= (Icomparator a1,Icomparator a2)->
{
	if(a1.value<a2.value)
		return 1;
	else 
		return -1;
	};
	
	Collections.sort(c,q);

System.out.println(c);
				
	
	
	
}
}

