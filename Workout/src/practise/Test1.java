package practise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test1 {
//private static final Character Character = null;

public static void main(String[] args) {
	 int a=6;
	String s="gopi";
	char[] w=s.toCharArray();
	Map<Character, Character>m= new LinkedHashMap<>();
	Map<Character, Character>mdupMap = new LinkedHashMap<>();
	int i =0;
	for(char d:w) {
		if(m.containsKey(d)) {
			i++;
			if (mdupMap.containsKey(d)) {
				i--;
			}
			mdupMap.put(d, null);
//			System.out.println(mdupMap+"q");
		}
		System.out.println(mdupMap+"q");	
		m.put(d, null);
		System.err.println(m);
}
	System.out.println("Duplicate count is"+" "+i);
	 
	System.out.println("duplicate count is"+" "+(s.length()-m.size()));
	
	
	System.out.println();
//		String s="gooku";
//	char []c =s.toCharArray();
//	int orgSize=c.length;
//	Map<Character, String>map=new HashMap<>();
//	//int w=0;
//for(char store:c) {
//	map.put(store, null);
//	System.err.println(map);
//	//w++;
//}
//	System.out.println(orgSize-map.size());
}

}
