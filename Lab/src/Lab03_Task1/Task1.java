package Lab03_Task1;

public class Task1 {

	public static void main(String[] args) {
		//---- Task 1
		Calculator myCalculator = new Calculator("1598","Pink");
		System.out.println(myCalculator.add(3, 5, 100));
		System.out.println(myCalculator.add(45, 8.99));
		try {
			System.out.println(myCalculator.divide(59, 0));
		}
		catch (ArithmeticException e) {
			System.out.println("Error: "+e.getMessage());
		}
		System.out.println(myCalculator.divide(5.01, 2));
	}

}
