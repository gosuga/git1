package practise;

import java.util.Scanner;


public class Bill {
static Scanner obj= new Scanner(System.in);
static int wb=10;

	public static void select() {
		System.out.println("1 for add 2 for get 3 for exit");
		int a=obj.nextInt();
		if(a==1) {
		Bill.add();
		}
		if(a==2) {
			Bill.get();
			}
			if(a==3) {
				System.out.println("thank you");
			}
			
	}
	public static void add() {
		System.out.println("how much do you want to add?");
		int w=obj.nextInt();
		wb=w+wb;
		System.out.println("stock is"+wb);
	    Bill.select();
	    
	}
	public static void get() {
		System.out.println("how much do u want to buy");
		int q=obj.nextInt();
		wb=wb-q;
		System.out.println("stock remaining "+wb);
		Bill.select();
		}
	
	public static void main(String[] args) {
		System.out.println("welcome to store");
		
		Bill.select();
		
	}

}
