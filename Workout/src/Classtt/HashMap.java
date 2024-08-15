package Classtt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

class Emp {
	
	private int id;
	
	private String name;
	
	private int Department;
	
	public Emp() {
}
	
public Emp(int id, String name, int Department) {
		this.id=id;
		this.name=name;
		this.Department=Department;
	}

public int getid(){	
	return id;
}

public String getname() {
	return name;
}

public int getdepartment() {
	return Department;
}


public  String toString() {
	return "Employee{id=" + id + ", name='" + name + "', departmentId=" + Department + '}';
}
}

 public class HashMap{
	 public static void main(String[] args) {
		 List <Emp> objList = Arrays.asList(
				 new Emp(101,"aaa",666),
				 new Emp(102,"bbb",999)
		 );
		 
		 Map<Integer, List <Emp>> objmap= new java.util.HashMap<>();
			
		 for(Emp ep:objList) {
			int deptname=ep.getdepartment();
			 
			 objmap.computeIfAbsent(deptname, i-> new ArrayList<>()).add(ep);
		 }
			
		 
		 for(Map.Entry <Integer, List <Emp>> entry:objmap.entrySet()) {
			 System.out.println("deptt"+entry.getKey());
			 
			 for(Emp ee:entry.getValue()) {
				 System.out.println("kooo"+ee);
			 }
			 
		 }
		
	}
	 
 } 
 
	
	
	
	
	


