package practise;

import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {
	
	int bookId;
	int bookQuantity;
	int Price;
	
	static ArrayList <Books> bookList = new ArrayList<>();
	
	
//		bookList.add(new Books(1,"Fifty Shades", 100, 5));
//		bookList.add(new Books(2,"Atomic habits", 200, 3));
//		bookList.add(new Books(3,"Ikagai", 350, 7));
//		bookList.add(new Books(4,"kutraparambari", 600, 7));
//	
	
	public int calculateBookPrice(int bookId, int quantity) {
		int price = 0;
		for(Books books : bookList) {
			if(books.bookId == bookId) {
				price = books.bookPrice * quantity;
				books.quantity -=quantity;
				//quantity=quantity-books.quantity;
			}
		}
		return price;
	}
	
	public void checkOut(int bookId, int price) {
		System.out.println("Your order details : \n" );
		for(Books books : bookList) {
			if(books.bookId == bookId) {
				System.out.println("Book Name : " + books.bookName +"\n"
						+"Total Book Price : "+price);
			}
		}
	}

	public static void main(String[] args) {
		for(Books books : bookList) {
			System.out.println(books);
		}
		bookList.add(new Books(1,"Fifty Shades", 100, 5));
		bookList.add(new Books(2,"Atomic habits", 200, 3));
		bookList.add(new Books(3,"Ikagai", 350, 7));
		bookList.add(new Books(4,"kutraparambari", 600, 7));
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Book Id you want to purchase ");
		BookStore purchase = new BookStore();
		purchase.bookId = scanner.nextInt();
		System.out.println("Enter the quantity ");
		purchase.bookQuantity = scanner.nextInt();
		
		purchase.Price = purchase.calculateBookPrice(purchase.bookId, purchase.bookQuantity);
		purchase.checkOut(purchase.bookId, purchase.Price);
		System.out.println("Thanks for shopping...!");
		System.out.println(bookList);
		scanner.close();
	}
}

class Books {
	
	String bookName;
	int bookPrice;
	int quantity;
	int bookId;
	public Books(int bookId,String bookName, int bookPrice, int quantity) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "\nbookId= "+ bookId + "\nbookName= " + bookName + ",\nbookPrice= " + bookPrice + ",\nquantity= " + quantity + "\n";
	}
	
}