package Lab07;

public class Triangle extends Shape{
    private double width;
    private double height;
    private double length;

    public Triangle(){}
    public Triangle(double width, double height){
        this.width = width;
        this.height = height;
        this.length = 0.0;
    }
    public Triangle(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    @Override
    public double getArea() {
    	return 0.5*width*height;
    }
    
    @Override
    public double getCircumference(){
    	double res;
        if (this.length == 0.0) {
            double C = Math.sqrt(width * width + height * height);
            res = width + height + C;
        }else {
            res = width + height + length;
        }
        return res;
    }
}
