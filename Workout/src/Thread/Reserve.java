package Thread;

public class Reserve {

	public static synchronized void ticket() {
		
		for(int i=1;i<=5;i++) {
			try {
				//Thread.sleep(1500);
System.out.println(Thread.currentThread().getName()+" @"+i);		
		}
		catch(Exception   e) {
		System.out.println(e);	
		}
	}
		
	}

	public static void main(String[] args) {
		Threadclass2 thread1=new Threadclass2();
		Threadclass1 thread2=new Threadclass1();
		
		thread2.start();
		thread1.start();
	}

}
