package practise;

import java.util.Scanner;

public class Task3 {

static	int bottle;
static int price=100;
static int liability;
static	int sum;
static	int stock=10;
static int earn;
	static void buy() {
			bottle=bottle+sum;
		System.out.println("bought bottle"+bottle);
		
		earn=price*bottle;
		System.out.println(earn+"earned amount");
//		liability=liability-price;
//		System.out.println(liability);
	}
	static void remain() {
		bottle=bottle-stock;
		System.out.println("remaining bottle"+bottle);
	}

	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		
	//	int num = s.nextInt();
	System.out.println("enter 1 to add the product");
	
	System.out.println("enter 2 to bill the product");
		int num = s.nextInt();
		switch (num) {
		case 1: {
			
			System.out.println("buying the product");
			sum=s.nextInt();
		
		}
		break;
		case 2:{
			System.out.println("welcome to billing the product");
		}
		
		break;
		default:
		   System.out.println("invalid key");
		}
		Task3 t3=new Task3();
		t3.buy();
		t3.remain();
	}

	
}
