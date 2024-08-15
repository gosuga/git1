package Collection;

import java.util.Map.Entry;

public class Task1_1 {

//	Task1 task1 = new Task1();

	public String search(Task1 task1) {
		System.out.println("enter the author name");
		String FindAuthorName = task1.user.next();
		for (Entry<Integer, Task1> entry : task1.mapobj.entrySet()) {
			if (FindAuthorName.equalsIgnoreCase(entry.getValue().getAuthor()))
				return "title Name : " + entry.getValue().getTitle() + " No. of copy : "
						+ entry.getValue().getnum_of_copy();
		}
		return "invalid Author Name";
	}
	
	
}
