package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DelgadosTacos {

	public static void main(String[] args) {
		String pattern = "0.00";
		DecimalFormat df = new DecimalFormat(pattern);
		
		System.out.println("Welcome to Delgados Tacos Truck!");
		tacoTruck();
		menu();

	}
	
	@SuppressWarnings("unused")
	public static void menu() {
		Scanner keyboard = new Scanner(System.in);
		double tacoPrice = 1.99;
		double enchilada = 2.75;
		double water = .99;
		double churros = .99;
		double mexicanCandy = 1.25;
		double pop = 1.35;
		double nachos = 1.99;
		double burrito = 1.99;
		double extraToppings = .99;
		double chimichanga = 2.25;
		
		int amountTacosOrdered;
		int amountEnchiladasOrdered;
		int amountWatersOrdered;
		int amountChurrosOrdered;
		int amountMexicanCandyOrdered;
		int amountPopsOrdered;
		int amountNachosOrdered;
		int amountBurritosOrdered;
		int amountExtraToppingsOrdered;
		int amountChimichangasOrdered;
		
		double tacoPriceTotal;
		double enchiladaPriceTotal;
		double waterPriceTotal;
		double churrosPriceTotal;
		double mexicanCandyPriceTotal;
		double popPriceTotal;
		double nachosPriceTotal;
		double burritoPriceTotal;
		double extraToppingsPriceTotal;
		double chimichangaPriceTotal;
		
		
		System.out.println("Heres our menu:");
		System.out.println("Tacos $1.99             Enchiladas $2.75 \nWater $.99              Churros $.99 \nMex. Candy $1.25     "
				+ "   Pop $1.35 \nNachos $1.99            Burritos $1.99"
				+ " \nExtra Toppings $.99     Chimichangas $2.25");
		System.out.println("\nHow many tacos would you like? >> ");
		amountTacosOrdered = keyboard.nextInt();
		System.out.println("How many enchiladas would you like? >> ");
		amountEnchiladasOrdered = keyboard.nextInt();
		System.out.println("How many water bottles would you like? >> ");
		amountWatersOrdered = keyboard.nextInt();
		System.out.println("How many churros would you like? >> ");
		amountChurrosOrdered = keyboard.nextInt();
		System.out.println("How many pieces of mexican candy would you like? >> ");
		amountMexicanCandyOrdered = keyboard.nextInt();
		System.out.println("How many cans of pop would you like? >> ");
		amountPopsOrdered = keyboard.nextInt();
		System.out.println("How many plates of nachos would you like? >> ");
		amountNachosOrdered = keyboard.nextInt();
		System.out.println("How many burritos would you like? >> ");
		amountBurritosOrdered = keyboard.nextInt();
		System.out.println("How much extra toppings would you like? >> ");
		amountExtraToppingsOrdered = keyboard.nextInt();
		System.out.println("How many chimichangas would you like? >> ");
		amountChimichangasOrdered = keyboard.nextInt();
		
		tacoPriceTotal = amountTacosOrdered * tacoPrice;
		enchiladaPriceTotal = amountEnchiladasOrdered * enchilada;
		waterPriceTotal = amountWatersOrdered * water;
		churrosPriceTotal = amountChurrosOrdered * churros;
		mexicanCandyPriceTotal = amountMexicanCandyOrdered * mexicanCandy;
		popPriceTotal = amountPopsOrdered * pop;
		nachosPriceTotal = amountNachosOrdered * nachos;
		burritoPriceTotal = amountBurritosOrdered * burrito;
		extraToppingsPriceTotal = amountExtraToppingsOrdered * extraToppings;
		chimichangaPriceTotal = amountChimichangasOrdered * chimichanga;
	}
	
	public static void salesTax() { 
		
		
	}
	
	public static void tacoTruck() {
		
		
		System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
		System.out.println("M           Delgados Tacos         M");
		System.out.println("M                                  M");
		System.out.println("M                                  M");
		System.out.println("M                                  M");
		System.out.println("M                                  M");
		System.out.println("M----------------------------------M");
		System.out.println("-          Burritos! Nachos!       -");
		System.out.println("------------------------------------");
		System.out.println(" OOOO                         OOOO");
		System.out.println("OO  OO                       OO   OO");
		System.out.println("OO  OO                       OO   OO");
		System.out.println(" OOOO                         OOOO");
		
		
	}

}
