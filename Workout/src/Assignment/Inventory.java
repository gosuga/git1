package Assignment;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

class Inventory {
private	int num;
private	String name;
private	int price;
private	int stock;
	static int q;
	
final static String N = "Goku";
final	static String P = "java123";
public Inventory(int num, String name, int price, int stock) {
		this.num = num;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	public String toString() {
		return name + " " + price + " " + stock;
	}
public void CalcPrice() {
		System.out.println("Enter the number of quantity");
		int calc = user.nextInt();
		q = price * calc;
		System.out.println("your price is" + q);
		int left = stock - calc;
		System.out.println("Remaining availability left on your selected book " + left);
}
	public void ship() {
		System.out.println("Shipping Address \n");
		System.out.println("Address(House no;street;area)");
		user.next();
		String a1=user.nextLine();
		System.out.println("Enter City");
		String a2=user.nextLine();
	System.out.println("Enter pincode");
	int a3=user.nextInt();
//		try {
			while(String.valueOf(a3).length()!=6) {
				System.err.println("Enter valid pincode");
				a3=user.nextInt();
			}
//		} catch (InputMismatchException e) {
//			e.printStackTrace();
		//	System.err.println("Invalid.Please enter valid pincode");
//		}
System.out.println("your cart amount is"+q);
		System.out.println("Are you confirm to place the order ,true or flase?");
		String c=user.next();
		if(c.equals("true") ) {
			System.out.println("Sucessfully order placed");
		}else if(c.equals("false")){
			System.err.println("Order Cancelled");
		}
		
}
	public  static String names(String name) {
		if(name.equals(N))
			return name;
		else 
			System.err.println("Enter the Valid  name");
			 name = user.nextLine();
			 return names(name);
		}
	public static  String word(String pass) {
		if(pass.equals(P))
	return pass;
		else 
			System.err.println("Enter the  Valid Password");
		 pass = user.nextLine();
		 return word(pass);
	}

	static Scanner user = new Scanner(System.in);

	public static void main(String[] args) {
System.out.println(".*.*..*.Readbook.com Greets you.*..*..*\n");
		System.out.println(" Kindly Signup\n");
		System.out.println("Enter the name");
		String name = user.nextLine();
	names(name);
			System.out.println("Enter the Password");
			String pass = user.nextLine();
			word(pass);
			
				System.out.println("welcome to E-Book shopping\n");
			
//				System.exit(0);
Map<Integer, Inventory> objMap = new HashMap<>();
		objMap.put(1, new Inventory(1, "RichDad&PoorDad", 500, 50));
		objMap.put(2, new Inventory(2, "HarryPotter", 750, 60));
		objMap.put(3, new Inventory(3, "The Alchemist", 800, 70));
		objMap.put(4, new Inventory(4, "The Lord of the Rings", 700, 40));
		objMap.put(5, new Inventory(5, "Alice In The Wonderland", 999, 20));
		for (Map.Entry<Integer, Inventory> l : objMap.entrySet()) {
			System.out.println(l.getKey() + " " + l.getValue());
			// System.out.println(objMap);
		}
	System.out.println("\nselect the book Id");
		int Id =user.nextInt();
		//int Id = user.nextInt();
//		try {
		while (Id>5) {
			System.err.println("\nselect the Exisiting book Id");
			Id=user.nextInt();
		}
//		} catch (Exception e) {
//			e.printStackTrace();
//	}
		Inventory in = objMap.get(Id);
		in.CalcPrice();
	in.ship();
	}

}
