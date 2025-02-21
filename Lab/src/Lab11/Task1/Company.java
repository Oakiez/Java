package Lab11.Task1;

import java.util.*;

public class Company {
    private int id;
    private String companyName;
    private Map<Integer, Department> departments;

    public Company(){}
    public Company(int id, String companyName){
        this.id = id;
        this.companyName = companyName;
        this.departments = new HashMap<>();
    }

    public int getId(){
        return this.id;
    }
    public String getCompanyName(){
        return this.companyName;
    }
    public void addDepartment(Department department){
        this.departments.put(department.getId(), department);
    }

    public Map<Integer, Department> getDepartments() {
        return this.departments;
    }

    @Override
    public String toString() {
        return "Company[id=" + id + ", name='" + companyName + "', departments=" + departments + "]";
    }
}
