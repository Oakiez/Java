// 673380425-2 นายวงศธร ธน.ยอด Section 4
package Lab08_Task1;

public class Forward extends RoleBehavior{

    public Forward(){}
    public Forward(int earn_amt, String roleName){
        super(earn_amt,roleName);
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
