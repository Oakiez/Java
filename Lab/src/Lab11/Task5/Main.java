package Lab11.Task5;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "John", 75000.0);
        Employee emp2 = new Employee(2, "Amory", 35000.0);
        Employee emp3 = new Employee(3, "Bob", 65000.0);
        Employee emp4 = new Employee(4, "Cherry", 45000.0);
        Employee emp5 = new Employee(5, "Rose", 25000.0);
        Employee emp6 = new Employee(6, "Sumaree", 43000.0);

        Department itDepartment = new Department(101, "IT", Arrays.asList(emp1, emp2));
        Department salesDepartment = new Department(102, "Sales", Arrays.asList(emp3, emp6));
        Department accountingDepartment = new Department(103, "Accounting", Arrays.asList(emp4, emp5));

        Company company = new Company(Arrays.asList(itDepartment, salesDepartment, accountingDepartment));

        // Using Streams to sort by Department name and within Department by Employee name
        company.getDepartments().stream()
                .sorted(Comparator.comparing(Department::getName))
                .forEach(department -> {
                    System.out.println(department.getName());
                    department.getEmployees().stream()
                            .sorted(Comparator.comparing(Employee::getName))
                            .forEach(System.out::println);
                });
    }
}
