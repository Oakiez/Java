// 673380425-2 นายวงศธร ธน.ยอด
package Lecture08;

public class Manager extends Employee{
    public Manager(){}
    public Manager(int id, String name, double salary){
        super(id,name,salary);
    }

    @Override
    public String work(){
        return "I'm a manager";
    }
}
