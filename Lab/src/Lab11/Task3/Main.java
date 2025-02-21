package Lab11.Task3;

import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        // Add departments with employees to the company
        company.addDepartment(new Department(1, "IT", Arrays.asList(
                new Employee(1, "John", 75000.0),
                new Employee(2, "Amory", 35000.0)
        )));

        company.addDepartment(new Department(2, "Sale", Arrays.asList(
                new Employee(3, "Bob", 65000.0),
                new Employee(6, "Sumaree", 43000.0)
        )));

        company.addDepartment(new Department(3, "Accounting", Arrays.asList(
                new Employee(4, "Cherry", 45000.0),
                new Employee(5, "Rose", 25000.0)
        )));

        System.out.println("------Using Stream and Lambda expression------");

        // Get employees grouped by department using Company method
        Map<String, List<Employee>> employeesByDepartment = company.getEmployeesByDepartment();

        // Print out the grouped employees
        employeesByDepartment.forEach((department, employees) -> {
            System.out.println(department);
            employees.forEach(employee -> System.out.println(employee));
        });
    }
}
