package practise;

public class Wrapper {
	public static void main(String[] args) {
//		String q="10";
//		Integer w =new Integer(q);
//		int w1=w.intValue();
//		
//		String r=String.valueOf(q);
//		System.out.println(w+10);
		
		interface inner{
public static final 	int i=10;
	public abstract void show();
	//System.out.println(i);
		}
		String a=2+2+"hello";
		String c=new String(2+2+"hello");
		String b="3HELLO";
		
		System.out.println(b.indexOf("3"));
		
		System.out.println(a==b);
		System.out.println(a==c);
//		String.is

		
		
	}

}
