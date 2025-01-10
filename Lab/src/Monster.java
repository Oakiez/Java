import java.lang.Math;

public class Monster extends Actors{
    //---- Constructors
    public Monster(){super();}
    public Monster(double hp, double atk, double def){
        super(hp,atk,def);
    }

    //---- Methods
    public boolean dodge(){
        return Math.random() < 0.5;
    }

}
