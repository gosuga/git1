package practise;

import java.util.ArrayList;
import java.util.Collections;

public class Compar implements Comparable {
String name;
int rollno;
int rank;

public Compar(String name,int rollno,int rank) {
	
	this.name=name;
	this.rollno=rollno;
	this.rank=rank;
	
}
 public String toString() {
	return name+" "+rollno+" "+rank;
}
public static void main(String[] args) {
	ArrayList<Compar>c=new ArrayList<Compar>();
	c.add(new Compar("goku", 301, 8));
	c.add(new Compar("vegeta", 302, 6));
	c.add(new Compar("krillin", 307, 3));
	c.add(new Compar("freeza", 115, 89));
	System.out.println(c);
	Collections.sort(c);
	System.out.println(c);
}
public int compareTo(Object o) {
	Compar cs=(Compar)o;
	if(rank<cs.rank) {
		return 1;
	}
	else if(cs.rank<rank){
		return -1;
	}
	else {
		return 0;
	}
}

//public int compareTo(Object o) {
//	// TODO Auto-generated method stub
//	return 0;
//}
}
