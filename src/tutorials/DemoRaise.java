package tutorials;

import java.util.Scanner;

public class DemoRaise {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Enter your salary >> ");
		double salary = inputDevice.nextDouble();
		System.out.println("Enter your starting wage >> ");
		double startingWage = inputDevice.nextDouble();
		
		System.out.println("Demonstrating some raises");
		predictRaise(400.00);
		predictRaise(salary);
		predictRaise(startingWage);

	}
	
	
	public static void predictRaise(double salary) {
		double newSalary;
		final double RAISE_RATE = 1.10;
		newSalary = salary * RAISE_RATE;
		System.out.println("Current salary: " + 
		salary + "    After raise: " + 
				newSalary);
		
		
		
		
	}
	

}
