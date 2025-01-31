// 673380425-2 นายวงศธร ธน.ยอด Section 4
package Lab08_Task1;

import java.util.ArrayList;

public class Player{
    private int id;
    private String name;
    private RoleBehavior roles;

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
    public RoleBehavior getRole(){
        return this.roles;
    }

    public String getPlayerInfo(){
        return String.format("\t\t%d\t\t%s\t\t%s\t\t%.2f", getId(), getName(), roles.getRoleName(), roles.cost());

    }

    public void setRole(RoleBehavior role){
        this.roles = role;
    }
}
