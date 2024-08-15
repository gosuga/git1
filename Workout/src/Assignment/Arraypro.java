package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraypro {//extends Thread{
static 	String item;
static 	int amount;
static 	int count;
	public Arraypro(String item, int amount, int count) {
		this.item = item;
		this.amount = amount;
		this.count = count;
	}
public String toString() {
		return item + "  " + amount + " " + count;
	}
static Scanner user=new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
		ArrayList<Arraypro> e = new ArrayList<>();
		//Arraypro ar=new Arraypro(item, amount, count);
		
		System.out.println("MENU");
		e.add(new Arraypro("dosai",   20, 1));
		e.add(new Arraypro("Idly",    10, 1));
		e.add(new Arraypro("fries", 50, 1));
		e.add(new Arraypro("chappathi", 40, 2));
		e.add(new Arraypro("dosai", 20, 1));
		e.add(new Arraypro("Poori", 30, 2));
		e.add(new Arraypro("parotta", 50, 2));
		// System.out.println(e);
//		for (Arraypro ap : e) {
//			System.out.println(ap);
//		}
//		System.out.println("press any key to proceed");
//		String any=user.next();
//		if(any.equalsIgnoreCase(any)) {
//			Thread.sleep(1000);
//			notes();
//		}else {
//			System.err.println("Enter valid key");
//		}
		
		
		

	}

}
