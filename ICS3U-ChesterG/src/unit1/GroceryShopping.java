package unit1;

import java.util.Scanner;
import java.time.LocalDateTime; //LocalDateTime class
import java.time.format.DateTimeFormatter; //DateTimeFormatter class

public class GroceryShopping {
	
	 final static double TAX_RATE = 0.13;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.printf("%5s%5s%5s%5s%5s%5s%5s%5s%5s", "$$$", "^^^", "*** ","|||||", "\"Mr. Chester's Grocery\"", "|||||","***", "^^^", "$$$");
		
		//Declare variables
		
		String product1, product2;
		double cost1, cost2, quantity1, quantity2;
		LocalDateTime myDateObj = LocalDateTime.now();
		
		System.out.print("\n\n");
		System.out.print("What product are you buying?");
		product1 = sc.next();
		
		System.out.print("What is the cost of the product?");
		cost1 = sc.nextDouble();
		
		System.out.print("How many are you buying?");
		quantity1 = sc.nextDouble();
		System.out.print("Very good."); 
		
		System.out.print("\n\n");
		System.out.print("What product are you buying?");
		product2 = sc.next();
		
		System.out.print("What is the cost of the product?");
		cost2 = sc.nextDouble();
		
		System.out.print("How many are you buying?");
		quantity2 = sc.nextDouble();
		System.out.print("Very good\n\n"); 
		
		//Calculations
        double subtotal = Math.abs((cost1 * quantity1) + (cost2 * quantity2));  // using Math.abs() for safe calculation
        double tax = Math.round(subtotal * TAX_RATE);  // using Math.round() to round tax
        double total = subtotal + tax;

		//Recipt 
		System.out.print("This is your recipt:\n\n"); 
		System.out.print("\t Mr. Chester's Grocery\n"); 
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println(formattedDate);
        System.out.println("\nItem       |  Price  | Quant. | Total Price ");
        System.out.println("------------------------------------------");
        System.out.printf("%-10s | $%1s | %10s | $%10s", product1, cost1, quantity1, cost1 * quantity1);
        System.out.printf("%-10s | $%10s | %10s | $%10s", product2, cost2, quantity2, cost2 * quantity2);
        System.out.println("------------------------------------------");
        System.out.printf("%25s Subtotal: $%10s", "", subtotal);
        System.out.printf("%25s      Tax: $%10s", "", tax);
        System.out.printf("%25s    Total: $%10s", "", total);
        
        //Math.rint() 
        System.out.println("The total rounded to the nearest dollar is $" + Math.rint(total) + ".");

        System.out.println("\nHave a good day!");
        System.out.println("Thank you for shopping at Mr. Chester’s Grocery!");


	}

}


