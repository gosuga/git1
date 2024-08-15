package Test;

public class Order {
int o_id;
String o_detail;
int pro_id;


Order(int o_id,String o_detail,int pro_id){
	//super(o_id, o_detail, o_id, pro_id);
	this.o_id=o_id;
	this.o_detail=o_detail;
	this.pro_id=pro_id;
	
}
public String toString() {
	return o_detail+" "+o_id+" "+pro_id;
}

//public static void main(String[] args) {
////	List<Order> obj1=new ArrayList<>();
////	obj1.add(new Order(201, "audi", null))
////	System.out.println(obj1);
//}

}
