package Assignment;

public class Sbuffer {
	public static void show(StringBuffer s) {
		s.append("now");
	}
	public  static void  display(StringBuffer t) {
		t.append("done");
	}
	public static void slow(StringBuffer r) {
		r=new StringBuffer("but safe");
	}
	public static void main(String[] args) {
	StringBuffer	sb=new StringBuffer("just do it");
	System.err.println(sb);
		show(sb);
		System.out.println(sb);
		
		String st=new String("Attempt");
		System.out.println(st);
		//display(st);
		System.out.println(st);
		
		StringBuffer bs=new StringBuffer("it's slow");
		slow(bs);
		System.out.println(bs);
		}

}
