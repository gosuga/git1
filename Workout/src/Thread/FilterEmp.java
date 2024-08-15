package Thread;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterEmp {
	public static void main(String[] args) {
		
	
	List<Filter>listobj=new ArrayList<>();
	
	listobj.add(new Filter("aaron", 27, 48000, "IT"));
	listobj.add(new Filter("sara", 23, 45000, "IT"));
	listobj.add(new Filter("Gohu", 28, 55000, "NOn it"));
	
	
	Predicate<Filter>departmentfilter=e-> e.getDepartment().equalsIgnoreCase("it");
	
	Predicate<Filter>agefilter=e-> e.getAge()<=25;
	Predicate<Filter>salaryfilter=e-> e.getSalary()>=45000;
	
	FilterStream(listobj,departmentfilter.and(agefilter).and(salaryfilter));

}

	public static void FilterStream(List<Filter> listobj, Predicate<Filter> and) {
		
		listobj.stream().filter(and)
		.forEach(e-> System.out.println(e.getName()+e.getAge()+e.getDepartment()+e.getSalary()));
	
	}
}