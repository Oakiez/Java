// 673380425-2 นายวงศธร ธน.ยอด Section 4
package Lab08_Task1;

import java.util.ArrayList;

public class Team {
    private String name;
    private String address;
    private ArrayList<Player> Players;

    public Team(){}
    public Team(String name, String address){
        this.name = name;
        this.address = address;
        this.Players = new ArrayList<>();
    }

    public void addMember(Player player){
        Players.add(player);
    }

    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }

    public void setName(){
        this.name = name;
    }
    public void setAddress(){
        this.address = address;
    }

    public void showPlayersInfo(){
        System.out.println("Team name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("\t\tPlayers Information");
        System.out.println("---------------------------------------------");
        System.out.println("No.1\t\tID\t\tName\t\tRole\t\t\tCost");
        System.out.println("---------------------------------------------");
        int i = 1;
        for (Player player : Players) {
            System.out.format("%d" + "\t" +player.getPlayerInfo() + "\n",i);
            i++;
        }

    }
}
