package unit1;

import java.util.Scanner;

public class GroceryShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("%5s%5s%5s%5s%5s%5s%5s%5s%5s", "$$$", "^^^", "*** ","|||||", "\"Mr. Chester's Grocery\"", "|||||","***", "^^^", "$$$");
		
		//declare variables
		
		String product;
		double cost, quantity;
		
		System.out.print("\n\n");
		System.out.print("What product are you buying?");
		product = sc.next();
		
		System.out.print("What is the cost of the product?");
		cost = sc.nextDouble();
		
		System.out.print("How many are you buying?");
		quantity = sc.nextDouble();
		System.out.print("Very good.");
		
	}

}
