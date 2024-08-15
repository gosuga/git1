package practise; 
class people{
	static int amt=5000;
 public   synchronized void take(int amt) {
		if(amt>this.amt) {
			
			System.err.println("kasu ila poda");
		}
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
			this.amt-=amt;
			
		}
		System.out.println("withdraw sucessfull");
		
	}
	
	public synchronized void put(int amt) {
		this.amt+=amt;
		System.err.println("amt being deposited..");
		notifyAll();
	}
	
}
class settle extends Thread{
	people p;
	settle(people p){
		this.p=p;
	}
	public void run() {
p.take(3000);
	}
	
}
class took extends Thread{
	people p;
	took(people p){
		this.p=p;
	} public void run() {
		p.put(5000);
	}
	
}


public class Syncro {
	
public static void main(String[] args) {
	people p =new people();
	settle  s =new settle(p);
	took t = new took(p);
	s.start();
	t.start();
	
	
	}  
}
