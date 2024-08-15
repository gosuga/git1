package Collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2  extends Task2_2{
private String StudentName;
private int StudentId;
private String Course;
//private String python;
//private String AI;

public Task2(String StudentName,int StudentId,String Course) {
	this.StudentName=StudentName;
	this.StudentId=StudentId;
	this.Course=Course;
}

public Task2() {
	// TODO Auto-generated constructor stub
}

public String getStudentName() {
	return StudentName;
}

public int getStudentId() {
	return StudentId;
}

public String getCourse() {
	
	return Course;
}

public String toString() {
	return "StudentName"+" "+StudentName+" StudentId"+" "+ StudentId+" Course"+" "+  Course;
}

Map<Integer, Task2>studentMap=new LinkedHashMap<>();
Scanner UserStudent=new Scanner(System.in);
public static void main(String[] args) {
	Task2 task2 =new Task2();	
	Task2_2 task2_2=new Task2_2();
	
task2.	studentMap.put(1, new Task2("Aaron", 101, "java"));
task2.	studentMap.put(2,new Task2("Pradeep", 102 ,"python") );
task2.	studentMap.put(3,new Task2("Pradeep", 102 ,"AI") );
task2.	studentMap.put(4,new Task2("Maharaj", 104 ,"Design") );
task2.	studentMap.put(5,new Task2("Raj", 100 ,"java") );
	
	System.out.println(task2.studentMap);
	
	for(Map.Entry<Integer, Task2> studentloop:task2.studentMap.entrySet() ) {
		System.out.println(studentloop.getKey()+" "+studentloop.getValue());
	}
	task2_2.FindStudent(task2);
	
}
}
