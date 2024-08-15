package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;


 public class java8 {
public static void main(String[] args) {
//  Predicate<String> t= (a)-> a=="go";
 // System.out.println( t.test("hi"));
  List<String> obj =Arrays.asList("Ram","Goku","arya","azar");
  for(String s:obj) {
	  //System.out.println(s);
	  if(s.startsWith("a"))
		  System.out.println(s);
  }
  
  
  System.out.println(obj);
  Predicate<String> m= a-> obj.contains("arya");
  System.out.println(m.test(String.valueOf(obj.get(0).startsWith("a"))));
  
  //System.out.println((a)-> a.startsWith(a));
  List<String> c=Arrays.asList("hi","bye","app","hloo","go");
   c.sort(Comparator.comparingInt(q-> q.length()));
   System.out.println();
   for(String st:c) {
	   System.out.println(st);
   }
	
  
  }

}
