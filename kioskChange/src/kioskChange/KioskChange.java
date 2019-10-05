package kioskChange;

import java.util.Scanner;

public class KioskChange {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Input amount given: ");
		double given = input.nextDouble();
		System.out.print("Input total: ");
		double total = input.nextDouble();
		
		returnChange(total, given);
		

	}
	
	public static void returnChange(double total, double given) {
		
		double change = given - total;
		
		int dollars = (int)(change / 1);
		change = change - (dollars * 1);
		int quarters = (int)(change / 0.25);
		change = change - (quarters * 0.25);
		int dimes = (int)(change / 0.10);
		change = change - (dimes * 0.10);
		int nickels = (int)(change / 0.05);
		change = change - (nickels * 0.05);
		int pennies = (int)(change / 0.01);
		change = change - (pennies * 0.01);
		
		System.out.println("Dollars: " + dollars);
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies);
		
	}
}
