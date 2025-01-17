package Lab03_Task2;
import Lab03_Task1.Calculator;


public class Task2 extends Calculator {

	public static void main(String[] args) {
		//---- Task 2
		Task2 myCalculator = new Task2();
		
		myCalculator.setColor("Red");
		System.out.println(myCalculator.getColor());
	}

}
