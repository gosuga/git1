package practise;

import java.util.HashSet;
public class Work {
	public static void main(String[] args) {
		HashSet<String>st=new HashSet();
		st.add("ram");
		st.add("laxman");
		st.add("ravanan");
		//st.add("ram");
		st.add("hanuman");
		st.add("goku");
		st.add("trunkz");
		//System.out.println(st);
		//checking present
		String search="goku";
		if(st.contains(search)) {
			
			System.out.println("present"+search);
			
		}else {
			System.out.println("absent"+st);
		}
		//removal
		String search1="ram";
		if(st.remove(search1)) {
			System.out.println("terminated"+search1);
		}else {
			System.out.println(st+"he's not here");
		}
		//after removal
		System.out.println(st+" "+"after removal");
		//getting size of hashset
		System.out.println("size is"+" "+st.size());
		//cleared
		st.clear();
		//after clearence
		System.out.println(st+" "+"after clearence");
		
	}

}
