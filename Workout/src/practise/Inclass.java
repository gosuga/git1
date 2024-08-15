package practise;

public  abstract class Inclass {
	abstract void show();

	void get(){
		System.out.println("hi");
	}
	
	
public static void main(String[] args) {
	
	Inclass ic =new Inclass(){
		
		@Override
		void show() {
			// TODO Auto-generated method stub
			System.out.println("worked");
			
		}
	};
	ic.get();ic.show();
}
	
}	
	

