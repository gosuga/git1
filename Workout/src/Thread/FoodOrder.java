package Thread;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FoodOrder {
	
	private List<Food>objFood= new ArrayList<>();
	
	public void addfood(Food fd) {
		
		objFood.add(fd);
			}
	
	public List<Food>  getfood() {
		
		return objFood;
			}
	
	
	public List<Food>sortfood(){
		objFood.sort(Comparator.comparingDouble(Food::getId));
		
		return objFood;
	}
	
	public List<Food>optionaList(int id){
		objFood.stream().filter(fd -> fd.getId()==id).findFirst();
		return objFood;
	}
	public void CalcThread(){
		
		ExecutorService exe= Executors.newFixedThreadPool(3);
		
		for(Food fd: objFood) {
	exe.submit(()->{
		double hike= fd.getAmount()*10;
		System.out.println(fd.getName()+"bonus"+hike);
		});
	
}
		exe.shutdown();
	}
	public static void main(String[] args) {
		
	FoodOrder foodOrder=new FoodOrder();
	
	foodOrder.addfood(new Food(101L, "pizza", 500.0));
	foodOrder.addfood(new Food(109l, "bun", 20.0));
	foodOrder.addfood(new Food(106l, "juice", 800.0));
	
	for(Food fd:foodOrder.sortfood()) {
		System.out.println(fd);
	}
		
	// foodOrder.CalcThread();
	System.out.println(foodOrder.sortfood()) ;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
