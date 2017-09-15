package exercises;

import java.util.Scanner;

public class NumberDemos2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		// int numberOne = 6;
		// int numberTwo = 12;
		int numberOne;
		int numberTwo;
		
		System.out.println("Please enter an integer >> ");
		numberOne = keyboard.nextInt();
		System.out.println("Please enter another integer >> ");
		numberTwo = keyboard.nextInt();
		displayTwiceTheNumber(numberOne, numberTwo);
		displayNumberPlusFive(numberOne, numberTwo);
		displayNumberSquared(numberOne, numberTwo);
	}
	public static void displayTwiceTheNumber(int x, int y) {
		int twiceNumberOne = x * 2;
		int twiceNumberTwo = y * 2;
		
		System.out.println(twiceNumberOne);
		System.out.println(twiceNumberTwo);
	}
	public static void displayNumberPlusFive(int x, int y) {
		int numberPlusFiveOne = x + 5;
		int numberPlusFiveTwo = y + 5;
		
		System.out.println(numberPlusFiveOne);
		System.out.println(numberPlusFiveTwo);
	}
	public static void displayNumberSquared(int x, int y) {
		int numberOneSquared = x * x;
		int numberTwoSquared = y * y;
		
		System.out.println(numberOneSquared);
		System.out.println(numberTwoSquared);
	}
}
