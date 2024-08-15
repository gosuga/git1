package Classtt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Classtt.Order.Item;

public class Orderservice {
	
	Map<String, Order> order= new HashMap<>();
	
	public String createordid(Order ord) {
		
		if( ord==null|| ord.getItems().isEmpty()) {
			throw new IllegalArgumentException("invalid order");
		}
		
		String orderid=generateorder();
		
		order.put(orderid, ord);
		
		return orderid;
		
	}

	private String generateorder() {
		
		return "ord"+(order.size()*0.5);
	}
	public double calcprice(Order order) {
		
		if(order==null|| order.getItems().isEmpty()) {
			
			throw new IllegalArgumentException("wrng daa");
		}
		
		return order.getItems().stream()
				.mapToDouble(itm-> itm.getQuantity()*itm.getPrice()
						).sum();
	}
	public static void main(String[] args) {
		Orderservice ordsrv=new Orderservice();
		
		Order sampleOrder=new Order();
		
		
		
		List<Item>itm= new ArrayList<>();
	itm.add(new Item("aa",2.0,10));
	
	
	
	sampleOrder.setItems(itm);
	try {
		String orderid= ordsrv.createordid(sampleOrder);
		
		double findprice=ordsrv.calcprice(sampleOrder);
		
		  String ordgen   =ordsrv.generateorder( );
		System.out.println("ordid"+orderid);
		
		System.out.println("price"+findprice);
		
		System.out.println("generationord"+findprice);
	}catch (Exception e) {
		System.out.println("errrm"+e.getMessage());
	}
		
		
		
	
	
	}
	
	

}
