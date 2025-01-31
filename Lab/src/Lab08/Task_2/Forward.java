// 673380425-2 นายวงศธร ธน.ยอด Section 4
package Lab08_Task2;

public class Forward implements IRoleBehavior{
    protected int earn_amt;
    protected String jobdesc;

    public Forward(){}
    public Forward(int earn_amt, String jobdesc){
        this.earn_amt = earn_amt;
        this.jobdesc = jobdesc;
    }

    @Override
    public double cost(){
        return this.earn_amt;
    }

    @Override
    public String jobDescription(){
        return this.jobdesc;
    }

}