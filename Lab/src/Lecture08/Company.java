// 673380425-2 นายวงศธร ธน.ยอด
package Lecture08;
import java.util.ArrayList;

public class Company {
    private String name;
    private String tel;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(){}
    public Company(String name, String tel){
        this.name = name;
        this.tel = tel;
    }

    public String getName(){
        return this.name;
    }
    public String getTel(){
        return this.tel;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setTel(String tel){
        this.tel = tel;        
    }
    
    public void add(Employee employee) {
    	employees.add(employee);
    }

    public void showAllEmployee(){
    	System.out.println("ID\t\tName\t\tSalary\t\tWork (Job description)");
        for (Employee employee : employees){
            System.out.format("%d\t\t%s\t\t%.2f\t\t%s\n",employee.getId(),employee.getName()
            		,employee.getSalary(),employee.work());
        }
    }

    
    
    
}
