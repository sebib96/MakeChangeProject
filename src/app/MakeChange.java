package app;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter the item price: ");
		double itemPrice = kb.nextDouble();
		kb.nextLine();
		System.out.println("Enter $ tendered: ");
		double cashTendered = kb.nextDouble();
		kb.nextLine();
		double change = 0;
		change = cashTendered - itemPrice;
		
		
		int dollars = (int) change;
		float coins = (float) (change - dollars);
		coins *= 100;

		int twentyDollar = dollars / 20;
		int tenDollar = (dollars % 20) / 10;
		int fiveDollar = (dollars % 10) / 5;
		int oneDollar = (dollars % 5) / 1;
		int quarters = (int) (coins / 25);
		int dimes = (int)(coins % 25) / 10;
		int nickels = (int)(coins % 25) % 10 / 5;
		int pennies = (int)(coins % 5) / 1;
		

		if (change < 0) {
			System.out.println("Not enough $");
		} else if (change == 0) {
			System.out.println("No change :)!");
		} else if (change > 0) {
			if (change % 100 >1) {
				System.out.println("Your change is: " + (change%100));
				
			} else {
				System.out.println("Your change is: " + (coins / 100));
			}
		}
			if (twentyDollar > 0) {
				System.out.println("Twenty Dollar Bills: " + twentyDollar);
			} if (tenDollar > 0) {
				System.out.println("Ten Dollar Bills: " + tenDollar);
			} if (fiveDollar > 0 ) {
				System.out.println("Five Dollar Bills: " + fiveDollar);
			} if (oneDollar > 0) {
				System.out.println("One Dollar Bills: " + oneDollar);
			} if (quarters > 0) {
				System.out.println("Quarters: " + quarters);
			} if (dimes > 0) {
				System.out.println("Dimes: " + dimes);
			} if (nickels > 0) {
				System.out.println("Nickels: " + nickels);
			} if (pennies > 0) {
				System.out.println("Pennies: " + pennies);
			}
	}
}
