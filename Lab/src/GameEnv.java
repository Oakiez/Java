
public class GameEnv {
    //---- Attributes
    private Player myPlayer;
    private Monster myMonster;

    //---- Constructors
    public GameEnv(){}
    public GameEnv(Player player, Monster monster){
        this.myPlayer = player;
        this.myMonster = monster;
    }

    //---- Methods
    public void setPlayer(double hp, double atk, double def,Knife knife){
        this.myPlayer = new Player(hp, atk, def, knife);
    }
    public void setMonster(double hp, double atk, double def){
        this.myMonster = new Monster(hp, atk, def);
    }
    public double getPlayerHP(){
        return this.myPlayer.getHp();
    }
    public double getMonsterHP(){
        return this.myMonster.getHp();
    }
    public void pressSpacebar(){
        if(this.myMonster.dodge() == true){
            System.out.println("Monster dodged!");
        }
        else{
            playerAttack();
        }
    }
    public void monsterAttack(){
        myPlayer.setHp(this.myPlayer.getHp() - getDamage(myMonster, myPlayer));
    }
    private void playerAttack(){
        myMonster.setHp(this.myMonster.getHp() - getDamage(myPlayer, myMonster));
    }
    private double getDamage(Player player_attack, Monster monster_defend){
        return player_attack.attack() * (1/monster_defend.getDef());
    }
    private double getDamage(Monster monster_attack, Player player_defend){
        return monster_attack.attack() * (1/player_defend.getDef());
    }
}
