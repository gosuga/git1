package Thread;

public class Filter {
    private String name;
    private int age;
    private double salary;
    private String department;

    // Constructors, getters, and setters
    public Filter(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}

