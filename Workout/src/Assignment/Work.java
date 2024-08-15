package Assignment;

import java.util.Scanner;


public class Work {
static	Scanner user=new Scanner(System.in);
	public static void main(String[] args) {
		String issue="/Name=\"Gopi\"/companyName=\"uniqTech\"/Experience=\"3years\"";
String[] 	methodString=issue.split("/");
System.out.println(" type word");
String getString=	user.next();
for(int i=1;i<methodString.length;i++) {
	if(getString.contains(issue)) {
		System.out.println(methodString[i]);
	}else {
		break;
	}
}
		     
}
}