package Assignment;

import java.util.function.Predicate;

//@FunctionalInterface
//interface  sm {
//		void disp(String a,String b);
//	}
//public class MethodRef {
//			static	void disp(String a,String b) {
//			System.out.println("genocide"+" "+a+" "+b);
//		}
//public static void main(String[] args) {
//	sm mr = MethodRef ::disp;
//	mr.disp("hi","fluster");
//	}
//}


//interface imr {
//	int paru();
//}
//
//public class MethodRef{
//public 	int paru1() {
//		int a=99,b=88,c=77;
//		return a+b+c;
//		}
//public static void main(String[] args) {
//	imr ref= new MethodRef()
//			::paru1;
//	
//	
//	System.err.println(ref.paru());
//}
//}


public class MethodRef{
	static void run() {
		System.err.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		
		Runnable r= MethodRef::run;
		Thread t1=new Thread(r);
		t1.setName("THREAD ONE");
		t1.start();
		
		Thread t2=new Thread(r);
		t2.setName("thread two");
		t2.start();
		
		Predicate<Integer>p=(a)-> a>=10;
		System.out.println(p.test(80));
	}
}
