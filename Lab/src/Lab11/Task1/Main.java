package Lab11.Task1;

public class Main {
    public static void main(String[] args) {
        Company company = new Company(1, "Tech Corp");

        Department sales = new Department(101, "Sale");
        Department accounting = new Department(102, "Accounting");
        Department it = new Department(103, "IT");

        company.addDepartment(sales);
        company.addDepartment(accounting);
        company.addDepartment(it);

        Employee emp1 = new Employee(1, "John", 75000.0);
        Employee emp2 = new Employee(2, "Amory", 35000.0);
        Employee emp3 = new Employee(3, "Bob", 65000.0);
        Employee emp4 = new Employee(4, "Cherry", 45000.0);
        Employee emp5 = new Employee(5, "Rose", 25000.0);
        Employee emp6 = new Employee(6, "Sumaree", 43000.0);

        sales.addEmployee(emp3);
        sales.addEmployee(emp6);
        accounting.addEmployee(emp4);
        accounting.addEmployee(emp5);
        it.addEmployee(emp1);
        it.addEmployee(emp2);

        printCompanyDetails(company);
    }

    private static void printCompanyDetails(Company company) {
        for (Department dept : company.getDepartments().values()) {
            System.out.println(dept.getDepartmentName());
            for (Employee emp : dept.getEmployees()) {
                System.out.println("Employee [id=" + emp.getId() + ", name=" + emp.getName() +
                        ", Salary=" + emp.getSalary() + "]");
            }
        }
    }
}
