package Lab11.Task3;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private int dept_id;
    private String departmentName;
    private List<Employee> employees;

    public Department(int dept_id, String departmentName, List<Employee> employees) {
        this.dept_id = dept_id;
        this.departmentName = departmentName;
        this.employees = employees;
    }

    public int getId() {
        return dept_id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
