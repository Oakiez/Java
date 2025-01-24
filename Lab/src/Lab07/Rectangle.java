// นายวงศธร ธน.ยอด 673380425-2 Section 4
package Lab07;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(){}
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double getCircumference(){
        return (2*width) + (2*height);
    }

    @Override
    public double getArea(){
        return width*height;
    }
}
