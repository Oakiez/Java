package Lab07;
import java.util.ArrayList;

public class Box {
    private ArrayList<Shape> shapes;

    public Box(){
        this.shapes = new ArrayList<>();
    }

    public void add(Shape shape){
        shapes.add(shape);
    }


    public double getTotalArea(){
        double totalArea = 0;
        for (Shape shape : shapes){
            totalArea += shape.getArea();
        }
        return totalArea;
    }
    public double getTotalCircumference(){
        double totalCircumference = 0;
        for (Shape shape : shapes){
            totalCircumference += shape.getCircumference();
        }
        return totalCircumference;
    }
}
