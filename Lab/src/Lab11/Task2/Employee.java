package Lab11.Task2;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(){}
    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employee[id=" + id + ", name='" + name + "', salary=" + salary + "]";
    }
}
