package Assignment;

//interface space{
//	void sky();
//}
 public class  Tlambda {
	//String  disp(String a,int b);
//	void run() {
//	};
public static void main(String[] args) {
//Tlambda t=new Tlambda()	;
//	wal w=()-> s
Runnable r= ()-> System.err.println("hi");	
Thread tr= new Thread(r);
tr.start();
//Lma m =()-> system.out.println("hoi");
}
}
