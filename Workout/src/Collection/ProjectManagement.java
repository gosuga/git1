package Collection;

import java.time.LocalDate;

public class ProjectManagement {
	public static void main(String[] args) {
		ProjectTool objProjectTool=new ProjectTool("Digital",LocalDate.of(2024, 4, 1),LocalDate.of(2024, 5,1));
		objProjectTool.addtask(new TaskTool("task1"));
		
		ProjectTool objProjectTool1=new ProjectTool("MOB",LocalDate.of(2024, 4, 15),LocalDate.of(2024,5,8));
		
		//objProjectTool.addtask(new TaskTool("task1"));
		objProjectTool1.addtask(new TaskTool("task2"));
		
		
		
		
		
		TaskTool objTaskTool=new TaskTool();
		
		
		
		
	}

}
