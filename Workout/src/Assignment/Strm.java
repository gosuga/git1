package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Strm {
	static boolean ret(String q) {
		return q.isEmpty();
	}

	static String cat(String a2, String a3) {

		return a3.concat(a2);
	}

	static String ucase(String u) {
		return u.toUpperCase();
	}

	public void sort() {
		System.out.println();
	}

	public static void main(String[] args) {
// 1		
		String q = "";
		Predicate<String> pr = Strm::ret;
		System.out.println(pr.test(q));

		String a1 = "hlo";
		String a2 = "hi";
		String a3 = "bye";
//2		
		BiFunction<String, String, String> bf = Strm::cat;
		System.out.println(bf.apply("hi", "bye"));
//3		
		String u = "uppercase";
		Function<String, String> fn = Strm::ucase;
		System.out.println(fn.apply(u));

//4
		List<String> so = Arrays.asList("menace", "hi", "bye", "helo", "subtle");
		so.sort(Strm::comp);
		so.forEach(System.out::println);
//5
		List<Integer>in = Arrays.asList(3,11,2,4,6,8,10,9);
		 in.stream().map(a->a*a).filter(a->a%2==0).forEach(c-> System.out.println(c));
		 
	
		}

	public static int comp(String z, String x) {
		return Integer.compare(z.length(), x.length());
	}

}
