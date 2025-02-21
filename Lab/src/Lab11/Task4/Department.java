package Lab11.Task4;

import java.util.*;

public class Department {
    private int dept_Id;
    private String departmentName;
    private List<Employee> employees;

    public Department(int departmentId, String name, List<Employee> employees) {
        this.dept_Id = departmentId;
        this.departmentName = name;
        this.employees = employees;
    }

    public int getDepartmentId() {
        return this.dept_Id;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }
}
