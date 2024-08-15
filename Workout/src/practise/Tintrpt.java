package practise;

public class Tintrpt extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
			if(Thread.interrupted()) 
				System.err.println("hlooo");
			
			else 
				System.out.println("feather on a cap");
							
		}
	}
	
	

	
	    public static void main(String[] args) {
	Tintrpt t=new Tintrpt();
	
	t.interrupt();
	t.start();
	
}
}
