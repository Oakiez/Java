// 673380425-2 นายวงศธร ธน.ยอด Section 4
package Lab08_Task1;

public class CenterBack extends RoleBehavior {

    public CenterBack(){}
    public CenterBack(int earn_amt, String roleName){
        super(earn_amt, roleName);
    }

    @Override
    public double cost(){
        return this.earn_amt;
    }

    @Override
    public String jobDescription(){
        return this.roleName;
    }

}
