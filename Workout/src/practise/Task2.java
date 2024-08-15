package practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


class Task2{
	 String empName;
	 int empId;
	 long empSalary;
	long mobNum;
	
public Task2(String empName,int empId,long empSalary,long mobNum) {
	this.empName=empName;
	this.empId=empId;
	this.empSalary=empSalary;
	this.mobNum=mobNum;
	}
 public String toString() {
return "employee{"+"name"+empName+"id"+empId+"salary"+empSalary+"mob"+mobNum+"}";
	}
	
static Scanner s=new Scanner(System.in);
public static void main(String[] args) {
	ArrayList<Task2>e=new ArrayList<>();
	long salary =0;
//	emp w=new emp();
	for(int i=1;i<=2;i++){
	System.out.println("employee name");
	String a=s.next();
	
	System.out.println("employee salary");
	long c=s.nextInt();
	System.out.println("employee mobile number");
	long d=s.nextInt();
	e.add(new Task2(a, i, c, d));

	}
	Iterator tr=e.iterator();
	while(tr.hasNext()) {
		Task2 ts=(Task2) tr.next();
		salary =ts.empSalary+salary;
		//System.out.println("monthly wage"+salary);
	}
	System.out.println("monthly wage"+salary);
	Iterator tr1=e.iterator();
	while(tr1.hasNext()) {
		Task2 ts=(Task2) tr1.next();
		System.out.println("annual sal"+ts.empName+"="+ts.empSalary*12);
		//System.out.println("monthly wage"+salary);
	}
		}

	
}

