// 673380425-2 นายวงศธร ธน.ยอด
package Lecture08;

public class Employee {
    protected int id;
    protected String name;
    protected double salary;

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

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public String work(){
        return "None";
    }
}