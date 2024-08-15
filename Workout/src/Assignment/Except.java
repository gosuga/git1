package Assignment;

public class Except {
	
public static void main(String[] args) {
//	stuff();
//	System.out.println(0/0);
//}
//public static void stuff() {
//	moreStuff();
//	System.out.println("hlo");
//}
//public static void moreStuff() {
//	System.out.println("hi");
	try {
		System.out.println(10);
		return;
		//System.err.println("one");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("hlo");
	}
	finally {
		System.out.println("done");
	}
	System.out.println("hi");
	
}
}
