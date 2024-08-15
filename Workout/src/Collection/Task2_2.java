package Collection;

import java.util.Map;
import java.util.Map.Entry;

public class Task2_2  {
//	Task2 task2 =new Task2();	
	
	//Task2_2 task2_2=new Task2_2();
	//Map<Integer, Task2> studentMap;
	

	public void FindStudent(Task2 task2) {
		System.out.println("enter course to find out student ");
		String StudentCourse=task2.UserStudent.next();
for(Entry<Integer, Task2> entry:task2.studentMap.entrySet()) {
			if(StudentCourse.equalsIgnoreCase(entry.getValue(). getCourse())) {
				System.out.println(entry.getValue().getStudentName()); 
			}
		}
	}
}
