// 673380425-2 นายวงศธร ธน.ยอด Section 4
package Lab08_Task2;

public class Player{
    private int id;
    private String name;
    private IRoleBehavior roles;

    public Player(){}
    public Player(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public IRoleBehavior getRole(){
        return this.roles;
    }

    public String getPlayerInfo(){
        return String.format("\t\t%d\t\t%s\t\t%s\t\t%.2f", getId(), getName(), roles.jobDescription(), roles.cost());

    }

    public void setRole(IRoleBehavior role){
        this.roles = role;
    }
}
