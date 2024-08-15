package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HelpDesk {
private	String title;
private	String Descp;
private	String Priority;
private	String Status;
public HelpDesk(String title,String Descp,String Priority,String Status) {
	this.title=title;
	this.Descp=Descp;
	this.Priority=Priority;
	this.Status=Status;
	
}
public HelpDesk() {
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
List<HelpDesk>listobj=new ArrayList<>();
	// Scanner listuser=new Scanner(System.in);
	
	public static void main(String[] args) {
//		List<HelpDesk>listobj=new LinkedList<>();
	HelpDesk helpdeskobj =new HelpDesk();
	ticket tt=new ticket();
	
	helpdeskobj.	listobj.add(new HelpDesk("RRR","periodic","normal","profit"));
	helpdeskobj.	listobj.add(new HelpDesk("Nan-E","fantasy","high","profit"));
	helpdeskobj.	listobj.add(new HelpDesk("maaveran","periodic action","normal","profit"));
	helpdeskobj.	listobj.add(new HelpDesk("BB","hitorical","very high","profit"));
		
//	Iterator<HelpDesk>iterator=helpdeskobj.listobj	.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		//tt.topPriority(helpdeskobj);
//	}
	System.out.println(tt.topPriority(helpdeskobj.listobj));

}
}

class ticket {
//	ticket tt=new ticket();
	public List<HelpDesk> topPriority(List<HelpDesk> helpDesks) {
		System.out.println(" title based on priority ");
		List<HelpDesk> sortedHelpDesks = new ArrayList<>();
		// if(prio)
		for (HelpDesk desk : helpDesks) {
			if (desk.getPriority().equalsIgnoreCase("normal")) {
				sortedHelpDesks.add(desk);
			}
		}
		helpDesks.remove(sortedHelpDesks);
		for (HelpDesk desk : helpDesks) {
			if (desk.getPriority().equalsIgnoreCase("high")) {
				sortedHelpDesks.add(0,desk);
			}
		}
		helpDesks.remove(sortedHelpDesks);
		for (HelpDesk desk : helpDesks) {
			if (desk.getPriority().equalsIgnoreCase("very high")) {
				sortedHelpDesks.add(0,desk);
			}
		}
		helpDesks.remove(sortedHelpDesks);
		return sortedHelpDesks;
	}  
}
