package Assignment;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Parent {
public static void main(String[] args) {
	Predicate<Integer> p=(a)-> a>10;
	System.out.println(p.test(9));//returns boolean
	
	BiPredicate<String, String>p1=(a,b)-> {int i1=a.length();int i2=b.length();return i1==i2;};
	
	System.err.println(p1.test("hlooo", "hi"));
	
//	Function<String, Integer> f=(a)-> {String d=a +20;return  parseInt(d); };
//	System.out.println(f.apply("10"));
//	
//	BiFunction<int, String, String> p2
	Consumer<String> c=(a)-> System.out.println(a);
	c.accept("oiii");
	BiConsumer<Integer, Integer>p4=(a,b)-> System.out.println(a*b);
	p4.accept(15, 15);
	
	Supplier<Integer> p6=()-> 8-10;
	System.out.println(p6.get());
	
	UnaryOperator<String> u=(a)-> a.concat("asdfg");
	System.err.println(u.apply("yes"));
	
	//BinaryOperator<Integer> b=(a)->
	
	
	
}
}

