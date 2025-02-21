// 673380425-2 นายวงศธร ธน.ยอด Section 4
package Lab11.AllTask;

import java.util.*;

public class Department {
    private int dept_id;
    private String departmentName;

    public Department(){}
    public Department(int dept_it, String departmentName){
        this.departmentName = departmentName;
        this.dept_id = dept_it;
        List<Employee> employees = new ArrayList<>();
    }

    public int getId() {
        return this.dept_id;
    }
    public String getDepartmentName(){
        return this.departmentName;
    }
}
