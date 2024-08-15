package practise;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Hash {
	static Scanner s= new Scanner(System.in);
public static void main(String[] args) {
	ArrayList<String>a=new ArrayList<>();
	System.out.println("enter the name and end to stop");
	String input;
	
	while( !(input=s.nextLine()).equals("end")) { 
		a.add(input);
	}
	
	System.out.println(a);
}
}
