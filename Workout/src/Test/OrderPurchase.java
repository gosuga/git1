package Test;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//
//public class OrderPurchase {
//	
//	private List<Product> products = new ArrayList<>();
//	
//	private List<Order> orders =  new ArrayList<>();
//	
//	public static void main(String[] args) {
//		OrderPurchase purchaseDetails = new OrderPurchase();
//		
//		purchaseDetails.products.add(new Product(1,"apple", 100, "It is an apple"));
//		purchaseDetails.products.add(new Product(2,"orange", 100, "It is an orange"));
//		purchaseDetails.products.add(new Product(3,"banana", 100, "It is an banana"));
//		purchaseDetails.products.add(new Product(4,"mango", 100, "It is an mango"));
//		
//		purchaseDetails.orders.add(new Order(1, "red", 1));
//		purchaseDetails.orders.add(new Order(1, "orage", 2));
//		purchaseDetails.orders.add(new Order(2, "yellow", 3));
////		purchaseDetails.orders.add(new Order(2, "round mango", 4));
//		
//		Map<Integer, Product> productMap = new HashMap<>();
//		Map<Integer, Order> orderMap = new HashMap<>();
//		for(Product product : purchaseDetails.products) {
//			productMap.put(product.p_id, product);
//		}
//		for(Order order : purchaseDetails.orders) {
//			orderMap.put(order.o_id, order);
//		}
//		
//		for(Map.Entry<Integer, Product> entry : productMap.entrySet()) {
//			Order order = orderMap.get(entry.getKey());
//			if(null == order)
//				break;
//			System.out.println("product id : " + entry.getValue().p_id);
//			System.out.println("product description : " + entry.getValue().p_descp);
//			System.out.println("product price : " + entry.getValue().P_price);
//			System.out.println("product name : " + entry.getValue().p_id);
//			System.out.println("order id : " + order.o_id);
//			System.out.println("order details : " + order.o_detail);
//		}
//	}
//}
