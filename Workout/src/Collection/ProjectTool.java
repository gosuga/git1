package Collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ProjectTool {

private	String name;
private 	LocalDate  startDate;
private 	LocalDate endDate;
private List<TaskTool>listtaskTool;

public ProjectTool(String name, LocalDate startDate, LocalDate endDate) {
this.name=name;
this.startDate=startDate;
this.endDate=endDate;
}

public ProjectTool() {
	
	
}
public String getName() {
	return name;
}
public LocalDate getStartDate() {
	return startDate;
}
public LocalDate getEndDate() {
	return endDate;
	
}
public List<TaskTool>getlisttTaskTool(){
	return listtaskTool;
}

public String toString() {
	return name+" "+startDate+" "+endDate;
}

public void addtask(TaskTool task) {
	tasks.add(task);
}

public boolean overdue() {
	return false;
		
	
}


//public String overdue() {
//		
//	
//}

//List<ProjectTool>objList=new ArrayList<>();
//public static void main(String[] args) {
//	ProjectTool objProjectTool=new ProjectTool();
//	
//	objProjectTool.objList.add(1,new ProjectTool("Digital",LocalDate.of(2024, 04,01),LocalDate.of(2024, 05, 05)));
//	
//}


	
	
}
