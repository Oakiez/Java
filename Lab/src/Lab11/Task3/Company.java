package Lab11.Task3;

import java.util.*;
import java.util.stream.Collectors;

public class Company {
    private List<Department> departments;

    public Company() {
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    // This method was used to group employees by department
    public Map<String, List<Employee>> getEmployeesByDepartment() {
        return departments.stream()
                .flatMap(dept -> dept.getEmployees().stream())
                .collect(Collectors.groupingBy(emp ->
                        departments.stream()
                                .filter(dept -> dept.getEmployees().contains(emp))
                                .findFirst()
                                .map(Department::getDepartmentName)
                                .orElse("Unknown")));
    }
}
