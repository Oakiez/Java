package Lab06;

public class GameEnv {
	private Player Player;
	private Monster Monster;
	
	public GameEnv() {}
	public GameEnv(Player player, Monster monster) {
		this.Player = player;
		this.Monster = monster;
	}
	
	public void setPlayer(double hp, double atk, double def, Knife knife) {
		this.Player = new Player(hp,atk,def,knife);
	}
	public void setMonster(double hp, double atk, double def) {
		this.Monster = new Monster(hp,atk,def);
	}
	public double getPlayerHp() {
		return this.Player.getHp();
	}
	public double getMonsterHp() {
		return this.Monster.getHp();
	}
	private void playerAttack() {
		Monster.setHp(Monster.getHp()-getDamage(Player, Monster));
	}
	public void monsterAttack() {
		Player.setHp(Player.getHp()-getDamage(Monster, Player));
	}
	private double getDamage(Player player , Monster monster) {
		return player.attack() * (1/monster.getDef());
	}
	private double getDamage(Monster monster, Player player) {
		return monster.attack() * (1/player.getDef());
	}
		
	public void pressSpacebar() {
		if (Monster.dodge()) {
			System.out.println("Monster dodge!");
		}
		else {
			playerAttack();
		}
	}
	
}
