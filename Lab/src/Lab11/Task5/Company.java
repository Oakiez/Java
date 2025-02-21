package Lab11.Task5;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Department> departments;

    public Company(List<Department> departments) {
        this.departments = departments;
    }

    public List<Department> getDepartments() {
        return departments;
    }


}
