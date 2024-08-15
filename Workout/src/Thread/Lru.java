package Thread;

import java.util.LinkedHashMap;
import java.util.Map;



public class Lru<key,value> extends LinkedHashMap<key,value> {
	private final int  capacity;

	public Lru(int capacity) {
		super(capacity,0.75f,true);
		this.capacity = capacity;
	}

	
	@Override
	public boolean removeEldestEntry(Map.Entry<key,value> obj) {
	return size()> capacity;

	}
	
	public static void main(String[] args) {
		
		Lru<Integer,Integer> cache=new Lru<>(2);
		cache.put(1,1);
		cache.put(2, 2);
		System.out.println(cache.get(1));
		cache.put(3, 3);
		System.out.println(cache.get(3));
		System.out.println(cache.get(2));
		
		
		
		
	}
	
	

	
	
	
}
