package Lab11.Task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "John", 75000.0);
        Employee emp2 = new Employee(2, "Amory", 35000.0);
        Employee emp3 = new Employee(3, "Bob", 65000.0);
        Employee emp4 = new Employee(4, "Cherry", 45000.0);
        Employee emp5 = new Employee(5, "Rose", 25000.0);
        Employee emp6 = new Employee(6, "Sumaree", 43000.0);

        Department itDepartment = new Department(1,"IT", Arrays.asList(emp1, emp2));
        Department salesDepartment = new Department(2,"Sale", Arrays.asList(emp3, emp6));
        Department accountingDepartment = new Department(3,"Accounting", Arrays.asList(emp4, emp5));

        Company company = new Company();
        company.addDepartment(itDepartment);
        company.addDepartment(salesDepartment);
        company.addDepartment(accountingDepartment);

        System.out.println("------Using Stream and Method Reference----");

        // วนลูปจัดกลุ่มพนักงานตามหน่วยงาน
        company.getDepartments().forEach(department -> {
            System.out.println(department.getDepartmentName());
            department.getEmployees().forEach(System.out::println);
        });
    }
}
