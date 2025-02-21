// 673380425-2 นายวงศธร ธน.ยอด Section 4
package Lab08_Task1;

public class Main {
    public static void main(String[] args){
        System.out.println("====== Task 1 ======");
        Team team = new Team("Khon Kaen United","Khon Kaen");

        Player p1 = new Player(1,"Joey");
        p1.setRole(new GoalKeeper(4500,"Goal Keeper"));
        team.addMember(p1);

        Player p2 = new Player(2,"Tony");
        p2.setRole(new CenterBack(500,"Center Back"));
        team.addMember(p2);

        Player p3 = new Player(3, "Oaky");
        p3.setRole(new Forward(5000,"L-Forward"));
        team.addMember(p3);

        team.showPlayersInfo();

    }
}
