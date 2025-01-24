// นายวงศธร ธน.ยอด 673380425-2 Section 4
package Lab07;

public class Circle extends Shape{
    private double radius;

    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
