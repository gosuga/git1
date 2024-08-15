package practise;

import java.util.ArrayList;
import java.util.Scanner;
public class Task1 {
	
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
	for(int i=1;i<=3;i++) {
		if(!a.contains(a))
		System.out.println("enter the word"+i);
		a.add(s.next());
	}
	a.add("go");
	a.add("come");
	System.err.println(a);
	
	}
	
}
