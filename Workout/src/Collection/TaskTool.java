package Collection;

public class TaskTool {

private	String TaskName;
private	String status;


public TaskTool(String TaskName,	String status) {
	this.TaskName=TaskName;
	this.status=status;
}
public TaskTool() {
	
}

public String getTaskName() {
	return TaskName;
}
public String getstatus() {
	return status;
}

public String toString() {
	return TaskName+" "+status;
}
}
