package Classtt;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private List<Item> items=new ArrayList<>();
	

public List<Item> getItems() {
		return items;
	}


	public void setItems(List<Item> items) {
		this.items = items;
	}



static class Item{
 private String name;

 private double quantity;
 
 private int price;
 
 public Item()
 {
	 
 }
public Item(String name, double quantity, int price) {
	super();
	this.name = name;
	this.quantity = quantity;
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getQuantity() {
	return quantity;
}
public void setQuantity(double quantity) {
	this.quantity = quantity;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}


}
 
}