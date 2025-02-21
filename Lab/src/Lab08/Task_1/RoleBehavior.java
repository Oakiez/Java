// 673380425-2 นายวงศธร ธน.ยอด Section 4
package Lab08_Task1;

public abstract class RoleBehavior extends Player {
    protected int earn_amt;
    protected String roleName;

    public RoleBehavior(){}
    public RoleBehavior(int earn_emt, String roleName){
        this.earn_amt = earn_emt;
        this.roleName = roleName;
    }

    public String getRoleName(){
        return this.roleName;
    }

    public abstract double cost();
    public abstract String jobDescription();
}
