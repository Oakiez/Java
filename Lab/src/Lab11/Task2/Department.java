package Lab11.Task2;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private int dept_it;
    private String departmentName;
    private List<Employee> employees;

    public Department(){}
    public Department(int dept_it, String departmentName){
        this.departmentName = departmentName;
        this.dept_it = dept_it;
        this.employees = new ArrayList<>();
    }

    public int getId() {
        return this.dept_it;
    }
    public String getDepartmentName(){
        return this.departmentName;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public List<Employee> getEmployees(){
        return this.employees;
    }

    @Override
    public String toString() {
        return "Department[id=" + this.dept_it + ", name='" + departmentName + "', employees=" + employees + "]";
    }
}
