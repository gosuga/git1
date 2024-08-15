package practise;

import java.util.ArrayList;
import java.util.Iterator;

public class Studentlist {
	String name;
	int rollno;
	int marks;
	
 Studentlist (String name,int rollno,int marks){
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	public String toString() {
		return name+" "+rollno+"  "+marks;
	}
	public static void main(String[] args) {
		ArrayList<Studentlist>a=new ArrayList<>();
			a.add(new Studentlist("ram", 10, 85));
			a.add(new Studentlist("laskhman", 20,89 ));
			System.out.println(a);
			Iterator<Studentlist>t=a.iterator();	
			
			while(t.hasNext()) {
				Studentlist s1=(Studentlist)t.next();
				System.out.println(s1);
//				System.out.print(s1.rollno);
//				System.out.print(s1.marks);
			}
		}
	
}
