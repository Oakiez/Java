// 673380425-2 นายวงศธร ธน.ยอด
package Lecture08;

public class Developer extends Employee{
    public Developer(){}
    public Developer(int id, String name, double salary){
        super(id,name,salary);
    }

    @Override
    public String work(){
        return "I'm a developer";
    }
}
