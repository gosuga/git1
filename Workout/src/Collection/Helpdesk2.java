package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class HD2 {
private	String title;
private	String Descp;
private	String Priority;
private	String Status;
public HD2(String title,String Descp,String Priority,String Status) {
	this.title=title;
	this.Descp=Descp;
	this.Priority=Priority;
	this.Status=Status;
	
}
public HD2() {
	// TODO Auto-generated constructor stub
}
public String getTitle() {
	return title;
}
public String getDescp() {
	return Descp;
}
public String getPriority() {
	return Priority;
}
public String getStatus() {
	return Status;
}
	
	public String toString() {
		return title+" "+Descp+" "+Priority+" "+Status;
	}
	
	
}

public class Helpdesk2 {
//	
//	 public Helpdesk2(String string, String string2, String string3, String string4) {
//		
//	}
 public static List<HD2> top_prior(List<HD2> Hd2) {
	 System.out.println("Sorted based on priority");
	 
		 List<HD2> sort=new ArrayList<>()	;
	Iterator<HD2>iterator=Hd2.iterator()	;
//1	
	while(iterator.hasNext()) {
  HD2 desk=    iterator.next();
  if(desk.getPriority().equalsIgnoreCase("very high")) {
	  sort.add(0, desk);
	   }
	}
 //2 
  iterator=Hd2.iterator();
  while(iterator.hasNext()) {
	  HD2 desk=iterator.next();
	  if(desk.getPriority().equalsIgnoreCase("high")) {
		  sort.add(desk);
 }
	  }
		 
iterator=Hd2.iterator();
while(iterator.hasNext()) {
	HD2 desk=iterator.next();
	if(desk.getPriority().equalsIgnoreCase("normal")) {
		sort.add(desk);
	}
} 
		return sort;	
		  }
	 

	public static void main(String[] args) {
		List<HD2>Hd2=new ArrayList<>();
		Hd2.add(new HD2("RRR","periodic","normal","profit"));
		Hd2.add(new HD2("Nan-E","fantasy","high","profit"));
		Hd2.add(new HD2("maaveran","periodic action","normal","profit"));
		Hd2.add(new HD2("BB","hitorical","very high","profit"));
		// string over ride ??  System.out.println(Hd2);
		
		
		List<HD2> sort=top_prior(Hd2);
		System.out.println(sort);
		}

}
	// Scanner listuser=new Scanner(System.in);
	