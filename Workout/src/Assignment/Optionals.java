package Assignment;

import java.util.Optional;

public class Optionals {
public static void main(String[] args) {
	String a=null;
	String b="hloo";
	Optional<String>ab=Optional.ofNullable(a);
	System.out.println(ab);
	
	System.err.println(!ab.equals(Optional.empty()));
	//System.out.println(ab.get());
	System.out.println(ab.isPresent());
	ab.ifPresent((c)->System.out.println("vanakam da "+c));
	
	System.err.println(ab.orElse("1"+"1"));
}
}
