package Lab11.Task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // สร้างบริษัท
        Company company = new Company(1, "TechCorp");

        // สร้างแผนก
        Department accounting = new Department(1, "Accounting");
        Department it = new Department(2, "IT");
        Department sale = new Department(3, "Sale");

        // สร้างพนักงาน
        Employee emp1 = new Employee(1, "John", 75000.0);
        Employee emp2 = new Employee(2, "Amory", 35000.0);
        Employee emp3 = new Employee(3, "Bob", 65000.0);
        Employee emp4 = new Employee(4, "Cherry", 45000.0);
        Employee emp5 = new Employee(5, "Rose", 25000.0);
        Employee emp6 = new Employee(6, "Sumaree", 43000.0);

        // เพิ่มแผนก
        company.addDepartment(accounting);
        company.addDepartment(it);
        company.addDepartment(sale);

        // เพิ่มพนง. ในแผนกต่างๆ
        accounting.addEmployee(emp4);
        accounting.addEmployee(emp5);
        it.addEmployee(emp1);
        it.addEmployee(emp2);
        sale.addEmployee(emp3);
        sale.addEmployee(emp6);

        // สร้าง Treemap ของแต่ละแผนกโดยมี List ของพนักงานอยู่ข้างใน
        Map<String, List<Employee>> departmentMap = new TreeMap<>();

        // ใส่รายละเอียดของ แผนก และ พนักงาน ลงใน Treemap
        departmentMap.put(accounting.getDepartmentName(), accounting.getEmployees());
        departmentMap.put(it.getDepartmentName(), it.getEmployees());
        departmentMap.put(sale.getDepartmentName(), sale.getEmployees());

        // ไล่ print
        for (Map.Entry<String, List<Employee>> entry : departmentMap.entrySet()) {
            System.out.println(entry.getKey()); // ชื่อแผนก
            for (Employee employee : entry.getValue()) {
                System.out.println(employee); // รายละเอียดลพนักงาน
            }
        }
    }
}
