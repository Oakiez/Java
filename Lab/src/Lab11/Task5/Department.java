package Lab11.Task5;

import java.util.List;

public class Department {
    private int departmentId;
    private String name;
    private List<Employee> employees;

    public Department(int departmentId, String name, List<Employee> employees) {
        this.departmentId = departmentId;
        this.name = name;
        this.employees = employees;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
