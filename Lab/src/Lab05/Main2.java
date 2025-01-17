package Lab05;

public class Main2 {
	public static void main(String[] args) {
		Line myLine = new Line(3,4,5,6);
		System.out.println("X: "+myLine.getStartPoint().getX()+"Y: "+myLine.getStartPoint().getY());
		System.out.println("X: "+myLine.getEndPoint().getX()+"Y: "+myLine.getEndPoint().getY());
		System.out.println(myLine.getLength());
		System.out.println();
		
		myLine.getStartPoint().setX(70);
		myLine.getStartPoint().setY(150);
		myLine.getEndPoint().setX(90);
		myLine.getEndPoint().setY(120);
		System.out.println("X: "+myLine.getStartPoint().getX()+"Y: "+myLine.getStartPoint().getY());
		System.out.println("X: "+myLine.getEndPoint().getX()+"Y: "+myLine.getEndPoint().getY());
		System.out.println(myLine.getLength());
	}
}
