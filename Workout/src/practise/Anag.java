package practise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Anag {
	static Scanner s =new Scanner(System.in);
public static void main(String[] args) {
	
	System.out.println("enter the word");
	String a=s.next();	
	System.out.println("enter the 2nd word");
	String b=s.next();
	char []q= a.toLowerCase().toCharArray();
	char []w=b.toLowerCase().toCharArray();
	

 Arrays.sort(q);
 //Arrays.sort(w);              
String e=Arrays.toString(q);

String f =Arrays.toString(w);
if (f.equals(e)) System.out.println("anagram");
	
else 
    System.out.println("not anagram");
	
}
}
