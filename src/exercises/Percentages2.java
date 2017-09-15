package exercises;

import java.util.Scanner;

public class Percentages2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		double numOne;
		double numTwo;
		System.out.print("Please enter a double >> ");
		numOne = keyboard.nextDouble();
		System.out.print("Please enter another double >> ");
		numTwo = keyboard.nextDouble();
		computePercent(numOne, numTwo);
		computePercent(numTwo, numOne);

	}
	
	public static void computePercent(double x, double y) {
		double result = x/y;
		result = result * 100;
		System.out.println(x + " is " + result + " percent of " + y);
	}
}
