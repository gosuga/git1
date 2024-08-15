package Assignment;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

//@FunctionalInterface
//interface A{
//	void result();
//}

   public class Lambdain {
	static int avg =100;
	
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("enter sub1 mark");
	int m1=s.nextInt();
	System.out.println("enter sub 2 mark");
	int m2=s.nextInt();
	
BiConsumer<Integer, Integer> bc=(Integer,Integer1)-> System.out.println(m1+m2/2 );
bc.accept(m1, m2);
int n=m1+m2;
System.err.println(n);
if(n>50)
	System.out.println("pass");
else
	System.out.println("padida");



	
		
}
}

