package practise;


interface in{
	int i=10;
	void show();
}
interface in2 extends in{
	int i=20;
	void d();
}

public class Inter implements in2 {
	public void show() {
		System.out.println("happens");
	}
	public void d() {
		System.out.println("odd");
	}
	
public static void main(String[] args) {
	Inter q= new Inter()
;
	
	System.out.println(q.i);
	q.show();
	q.d();
	
	}
}
