package Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Combine {
	public static void main(String[] args) {
		
	
List<Product> objproduct=new ArrayList<>();
List<Order> objOrder=new ArrayList<>();
objproduct.add(new Product(101, "dell", 1000, "core processor"));
objproduct.add(new Product(102, "dell", 1000, "core processor"));
objOrder.add(new Order(1001, "packed", 101));
objOrder.add(new Order(2001, "packed", 201));

Map<Integer, Product> proMap=new HashMap<>();
Map<Integer, Order> ordMap=new HashMap<>();

for(Product pro:objproduct) {
	proMap.put(pro.p_id, pro);
}
for(Order ord:objOrder) {
	ordMap.put(ord.pro_id, ord);
}

for(Map.Entry<Integer, Product>entry:proMap.entrySet()) {
	
	Order ord=ordMap.get(entry.getKey());
	if(ord== null)
		break;
	System.out.println(entry.getValue().p_id);
	System.out.println(entry.getValue().p_descp);
	System.out.println(entry.getValue().P_price);
	System.out.println(entry.getValue().p_name);
	System.out.println(ord.o_detail);
	System.out.println(ord.o_id);
	//System.err.println(ord.num);
	
	System.out.println(ord.pro_id);
}

	}

}
