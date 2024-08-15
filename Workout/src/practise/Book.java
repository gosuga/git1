package practise;

import java.nio.channels.SelectableChannel;
import java.util.Scanner;

public class Book {

	public void G() {
		System.out.println("enter no of GOT");
		int g=s.nextInt();
		count =g*GOT;
		System.out.println("your cost is for GOT is"+" "+count);
		stock=g+GOT;
		System.out.println("Remaining book"+stock);
		
	}
	public void M() {
		
		System.out.println("enter no of M");
		int m=s.nextInt();
		count =m*M;
		System.out.println("your cost is for  is "+" "+count);
		
		
	}
	public void F() {
		System.out.println("enter no of F");
		int f=s.nextInt();
		count=f*F;
		System.out.println("your cost for F is"+" "+count);
	}
	void k() {
		System.out.println("enter no of k");
		int k=s.nextInt();
		count=k*k;
	System.out.println("your cost for k is "+" "+k);	
	}
	void p() {
		System.out.println("enter no of p");
		int p=s.nextInt();
		count =p*p;
		System.out.println("your cost for p is"+" "+count);
	}
	static Scanner s=new Scanner(System.in);
	static int count, GOT,M,F,k,p;
	 static int  stock;
public static void main(String[] args) {
System.out.println(" Availables GOT,M,F,k,p");
	GOT=5;M=10;F=13;k=25;p=20;
	
	 
	System.out.println("enter the name of book");
	String n=s.next();
	System.out.println("select the book accordingly");
	Book b=new Book();
	switch (n) {
	case "GOT": {
		System.out.println("You choose GOT ");
		b.G();
	
	}
	break;
	case "M":{
		System.out.println("you choose M ");
		b.M();
	}
	break;
	case "F":{
		System.out.println("you choose F");
		b.F();
		
	}
	break;
	case "k":{
		 System.out.println("you choose k");
		 b.k();
		 
	}
	break;
	case"p":{
		b.p();
	}
	break;
	
	default:
		System.err.println("invalid key");
	}
	
	
	}
}
