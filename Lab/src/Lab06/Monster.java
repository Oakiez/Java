package Lab06;

public class Monster extends Actors {
	public Monster() {}
	public Monster(double hp, double atk, double def) {
		super(hp,atk,def);
	}
	
	public boolean dodge() {
		return Math.random() < 0.5;
	}
	
}
