package Assignment;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.lang.Thread;



public class Maptask extends Thread {
	static Long Mob;
	static int num;
	static String add;
	static Scanner data = new Scanner(System.in);
public static void main(String[] args) throws InterruptedException  {
		Map<String, Long> objMap=new HashMap<>();
		System.err.println("our schemas to do with change");
		System.out.println("1. Add the name");
		System.out.println("2.Modify the name");
		System.out.println("3.Remove the name");
		System.out.println("4,Display the name");
		System.out.println("5.Exit");
	
		int num=0;
		while (num<=5) {
			try {
			System.out.println("enter one of the above id");
			num =data.nextInt();
			}catch (Exception e) {
				System.out.println(e);
			}
		switch (num) {
		case 1:
			
			System.out.println("proceed the adding...");
			System.out.println("Add Name");
		 add=data.next();
			System.out.println("Add Mob Num");
			 Mob=data.nextLong();
			String str=Long.toString(Mob);
			if(str.length()==10) {
				objMap.put(add,Mob);
			}else {
				System.out.println("Irrational Num");
				
			}
			break;
			case 2:
			Thread.sleep(2000);
			System.out.println("proceed modify..");
			System.out.println("enter the name to modify");
			String modify=data.next();
			System.out.println("enter the mob num to modify if u need by enter true or false ");
			boolean check= data.nextBoolean();
			//System.out.println(check);
			if(check==true) {
				System.out.println("enter mob num for modify");
				Long Modnum=data.nextLong();
				String Strnum= Long.toString(Modnum);
				 if  (Strnum.length()==10) {
					objMap.replace(modify, Modnum);
				
				}else {
				
				}
				
			}
			break;
			case 3:
				for(Map.Entry<String, Long>entry:objMap.entrySet()) {
			System.out.println("enter the name to evite");
		String delete=data.next();
		try {
//		if(delete.equalsIgnoreCase(add)) {
			objMap.remove(delete);
		System.out.println("removed successfully"+" "+add);
//		}else 
//			System.err.println("invalid input");
		}
				 catch (Exception  e) {
					}
//			System.out.println("removed successfully"+add);
				}
			break;
		case 4:
	//	System.err.println((data.hasNext()));
//			for(Map.Entry<String, Long> entry: HashMap.entrySet())
//			{
//				System.out.println(entry.getValue()+" "+entry.getKey());
//			} 
			System.out.println("Displaying the data");
			for (Map.Entry<String, Long> entry :objMap.entrySet()) {
				
				
				String key=entry.getKey();
				Long value=entry.getValue();
				System.out.println(key+" "+value);
			}
		
			//System.out.println(key+" "+value);
			break;
		case 5:
			System.exit(0);
					}
//	objMap.put("RAm", 1234567890l);
//		objMap.put("Laxman",9876543210l);
//		System.out.println(objMap);
//		for(Map.Entry<String, Long>l:objMap.entrySet()){
//			System.out.println(l.getKey()+" "+l.getValue());
//		}
		}
		}
	}
