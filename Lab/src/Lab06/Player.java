package Lab06;

public class Player extends Actors {
	private Knife knife;
	
	public Player() {}
	public Player(double hp, double atk, double def, Knife knife) {
		super(hp,atk,def);
		this.knife = knife;
	}
	
	@Override
	public double attack() {
		return super.getAtk()+knife.getAtk();
	}
}
