package Assignment;

import java.util.Comparator;

public class Order extends Arraypro {

	public Order(String item, int amount, int count) {
		super(item, amount, count);
		
	}
	
	
	public int notes(){
		Comparator<Arraypro> c=(Arraypro a1,Arraypro a2)->{
			if(a1.amount<a2.amount)
			{
				return 1;
			}
			else {
				return -1;
			}
		};
//	System.out.println("Welcome to food order");
//		return item+" "+amount+" "+count;
//	
//		
	}
}
