
public class Player extends Actors {
    //---- Attributes
    private Knife knife;

    //---- Constructors
    public Player(){super();}
    public Player(double hp, double atk, double def,Knife knife){
        super(hp,atk,def);
        this.knife = knife;
    }

    //---- Methods
    public double attack(){
        double PStat = super.attack();
        return PStat+knife.getAtk();
    }
}
