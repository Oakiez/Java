package Lab03_Task1;

public class Calculator {
	private String id;
	private String color;
	private int battery;
	private boolean on;
	
	public Calculator() {}
	public Calculator(String id, String color) {
		this.id = id;
		this.color = color;
	}
	public Calculator(String id, String color, int battery, boolean on) {
		this.id = id;
		this.color = color;
		this.battery = battery;
		this.on = on;
	}
	
	public String getId() {
		return this.id;
	}
	public String getColor() {
		return this.color;
	}
	public int getBattery() {
		return this.battery;
	}
	public boolean getOn() {
		return this.on;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	protected void setColor(String color) {
		this.color = color;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	public double add(double a, double b) {
		return a+b;
	}
	public double add(double a, int b) {
		return a+b;
	}
	
	public int minus(int a, int b) {
		return a-b;
	}
	public double minus(double a, double b) {
		return a-b;
	}
	public double minus(double a, int b) {
		return a-b;
	}
	
	public double multiply(double a, double b) {
		return a*b;
	}
	public double multiply(double a, int b) {
		return a*b;
	}
	
	public double divide(int a, int b) {
		if (b==0) {
			throw new ArithmeticException("Cannot divided by 0");
		}
		return a/b;
	}
	public double divide(double a, int b) {
		if (b==0) {
			throw new ArithmeticException("Cannot divided by 0");
		}
		return a/b;
	}
}
