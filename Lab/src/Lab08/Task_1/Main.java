package Task_1;

public class Main {
    public static void main(String[] args){
        Team team = new Team("Khon Kaen United","Khon Kaen");

        Player p1 = new Player(1,"Joey");
        p1.setRole(new GoalKeeper(4500,"Goal Keeper"));
        team.addMember(p1);

        Player p2 = new Player(2,"Tony");
        p2.setRole(new CenterBack(500,"Center Back"));
        team.addMember(p2);

        team.showPlayersInfo();

    }
}
