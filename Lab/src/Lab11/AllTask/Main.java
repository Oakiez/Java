// 673380425-2 นายวงศธร ธน.ยอด Section 4
package Lab11.AllTask;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // บริษัท
        Company company = new Company(4252, "Wongsathon Thanayod");

        Department sales = new Department(1, "Sale");
        Department accounting = new Department(2, "Accounting");
        Department it = new Department(3, "IT");

        // พนักงาน
        Employee emp1 = new Employee(1, "Oak", 100000);
        Employee emp2 = new Employee(2, "Mark", 80000);
        Employee emp3 = new Employee(3, "Garfield", 70000);
        Employee emp4 = new Employee(4, "Notch", 60000);
        Employee emp5 = new Employee(5, "Peach", 50000);
        Employee emp6 = new Employee(6, "Cheetah", 40000);

        // ----- Task 1 -----
        Map<String, List<Employee>> Hash_employee = new HashMap<>();

        Hash_employee.put("Sale", List.of(emp3,emp6));
        Hash_employee.put("Accounting", List.of(emp4,emp5));
        Hash_employee.put("IT", List.of(emp1,emp2));

        System.out.println("\n"+"================== HashMap without stream ==================");
        for (var employee: Hash_employee.entrySet()) {
            System.out.println(employee.getKey());
            for (var department : employee.getValue()) {
                System.out.println(department);
            }
        }

        // ----- Task 2 -----
        System.out.println("\n"+"================== TreeMap without stream ==================");
        TreeMap<String,List<Employee>> Tree_employee = new TreeMap<>();

        Tree_employee.put("Sale", List.of(emp3,emp6));
        Tree_employee.put("Accounting", List.of(emp4,emp5));
        Tree_employee.put("IT", List.of(emp1,emp2));

        for (var employee: Tree_employee.entrySet()) {
            System.out.println(employee.getKey());
            for (var department : employee.getValue()) {
                System.out.println(department);
            }
        }

        // ----- Task 3 -----
        System.out.println("\n"+"================== Stream and Lambda expression via using collect and Collectors.groupingBy ==================");
        List<Employee> Lambda_employee = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6);

        Map<String,List<Employee>> Lambda_group = Lambda_employee.stream().collect(Collectors.groupingBy(employee ->{
            if (employee.getId() == 3 || employee.getId() == 6)
                return "Sale";
            if (employee.getId() == 4 || employee.getId() == 5)
                return "Accounting";
            return "IT";
        }));

        Lambda_group.forEach((Key, Value)->{
            System.out.println(Key);Value.forEach(System.out::println);
        });

        // ----- Task 4 -----
        System.out.println("\n"+"================== Stream and Method reference via using collect and Collectors.groupingBy ==================");
        List<Employee> MethodR_employee = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6);

        Map<String,List<Employee>> grouped_MR_emp = MethodR_employee.stream()
                .collect(Collectors.groupingBy(Main::grouping));

        grouped_MR_emp.forEach((Key, Value)->{
            System.out.println(Key);
            Value.forEach(System.out::println);});

        // ----- Task 5 -----
        System.out.println("\n"+"================== entrySet() via using stream and sorted by department name and employee name ==================");
        TreeMap<String,List<Employee>> entry_employee = new TreeMap<>();

        entry_employee.put("Sale", List.of(emp3,emp6));
        entry_employee.put("Accounting", List.of(emp4,emp5));
        entry_employee.put("IT", List.of(emp1,emp2));

        entry_employee.forEach((key, value) -> {
            System.out.println(key);
            value.stream().sorted(Comparator.comparing(Employee::getName))
                    .forEach(emp -> System.out.println(emp.getId() + "," + emp.getName() + "," + emp.getSalary()));
        });
    }

    public static String grouping(Employee employee) {
        if (employee.getId() == 3 || employee.getId() == 6) {
            return "Sale";
        }
        if (employee.getId() == 4 || employee.getId() == 5) {
            return "Accounting";
        }
        else {
            return "IT";
        }
    }
}