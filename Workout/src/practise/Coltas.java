package practise;
import java.util.HashMap;
import java.util.Map;

public class Coltas {

	public static void main(String[] args) {
		String s="kalyan";
		char arr[]=s.toCharArray();
		int initialSize = arr.length;
		Map<Character, Integer > m= new HashMap();
		
		//int i = 0; 
		for (char a : arr) {
			m.put(a, null);
		//	i++;
		}
//		if(initialSize>m.size())
//			System.out.println("true");
//		else {
//			System.out.println("false");
//		}
		System.out.println(initialSize-m.size());
		}
}

