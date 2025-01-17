package Lab06;

public class Actors {
    //---- Attributes
    private double hp;
    private double atk;
    private double def;

    //---- Constructors
    public Actors(){}
    public Actors(double hp, double atk, double def){
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    //---- Methods
    public double getHp(){
        return this.hp;
    }
    protected double getAtk(){
        return this.atk;
    }
    public double getDef(){
        return this.def;
    }

    public void setHp(double hp){
        this.hp = hp;
    }

    public double attack(){
        return this.atk;
    }
}
