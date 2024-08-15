package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
	private String title;
	private String author;
	private int num_of_copy;

	public Task1(String title, String author, int num_of_copy) {
		this.title = title;
		this.author = author;
		this.num_of_copy = num_of_copy;
	}

	public Task1() {

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getnum_of_copy() {
		return num_of_copy;
	}

	public void setnum_of_copy(int num_of_copy) {
		this.num_of_copy = num_of_copy;
	}

	public String toString() {
		return "Title:" + " " + title + "Author:" + " " + author + " " + "number of copy:" + " " + num_of_copy;

//return title+" "+author+" "+num_of_copy;
	}

 Map<Integer, Task1> mapobj = new HashMap<>();
	Scanner user = new Scanner(System.in);

	public static void main(String[] args) {
		Task1 task1 = new Task1();
		Task1_1 task1_1=new Task1_1();

		task1.mapobj.put(1, new Task1("GOT", "jonsnow", 10));
		task1.mapobj.put(2, new Task1("RichDadPoorDad", "Robert", 15));
		task1.mapobj.put(3, new Task1("Lord of the Flies", "William Golding", 13));
//System.out.println(mapobj);
		for (Map.Entry<Integer, Task1> loopmap :task1. mapobj.entrySet()) {
			System.out.println(loopmap.getKey() + " " + loopmap.getValue());
		}
	System.out.println(	task1_1.search(task1));
		
		
	}

}
