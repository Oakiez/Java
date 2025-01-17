package Lab05;

public class Line {
	private Point startpoint;
	private Point endpoint;
	
	public Line() {}
	public Line( double x1, double y1, double x2, double y2) {
		this.startpoint = new Point(x1,y1);
		this.endpoint = new Point(x2,y2);
	}
	
	public Point getStartPoint() {
		return this.startpoint;
	}
	public Point getEndPoint() {
		return this.endpoint;
	}
	public void setStartPoint(double x1, double y1) {
		this.startpoint = new Point(x1,y1);
	}
	public void setEndPoint(double x2, double y2) {
		this.endpoint = new Point(x2,y2);
	}
	
	public double getLength() {
		double gX = Math.pow(endpoint.getX() - startpoint.getX(),2);
		double gY = Math.pow(endpoint.getY() - startpoint.getY(),2);
		double sum = Math.sqrt(gX+gY);
		return sum;
	}
}
