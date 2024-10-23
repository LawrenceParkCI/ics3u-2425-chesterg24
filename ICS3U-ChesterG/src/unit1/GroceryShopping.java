package unit1;

import java.util.Scanner;
import java.text.DecimalFormat; // Importing DecimalFormat for formatting
import java.time.LocalDateTime; // LocalDateTime class
import java.time.format.DateTimeFormatter; // DateTimeFormatter class

public class GroceryShopping {
	
	final static double TAX_RATE = 0.13;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00"); // DecimalFormat to round to two decimal places
		
		System.out.printf("%5s%5s%5s%5s%5s%5s%5s%5s%5s", "$$$", "^^^", "*** ", "|||||", "\"Mr. Chester's Grocery\"", "|||||", "***", "^^^", "$$$");
		
		// Declare variables
		String product1, product2;
		double cost1, cost2, quantity1, quantity2;
		LocalDateTime myDateObj = LocalDateTime.now();
		
		System.out.print("\n\n");
		System.out.print("What product are you buying? ");
		product1 = sc.next();
		
		System.out.print("What is the cost of the product? ");
		cost1 = sc.nextDouble();
		
		System.out.print("How many are you buying? ");
		quantity1 = sc.nextDouble();
		System.out.print("Very good.\n\n"); 
		
		System.out.print("What product are you buying? ");
		product2 = sc.next();
		
		System.out.print("What is the cost of the product? ");
		cost2 = sc.nextDouble();
		
		System.out.print("How many are you buying? ");
		quantity2 = sc.nextDouble();
		System.out.print("Very good\n\n"); 
		
		
		// Calculations
		double subtotal = (cost1 * quantity1) + (cost2 * quantity2); // No need for Math.abs() here
		double tax = Math.round(subtotal * TAX_RATE * 100.0) / 100.0; // Round tax to two decimal places
		double total = subtotal + tax;
		
		// Round total to the nearest dollar
		long totalRoundedToDollar = Math.round(total);

		// Round total to the nearest 5 cents
		double totalRoundedToFiveCents = Math.round(total * 20.0) / 20.0;

		// Receipt 
		System.out.print("This is your receipt:\n\n"); 
		System.out.print("\t Mr. Chester's Grocery\n"); 
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println(formattedDate);
        System.out.println("\nItem       |  Price  | Quant. | Total Price ");
        System.out.println("--------------------------------------------");
        System.out.printf("%-8s | $%8s | %8s | $%8s", product1, df.format(cost1), df.format(quantity1), df.format(cost1 * quantity1));
        System.out.print("\n"); 
        System.out.printf("%-8s | $%8s | %8s | $%8s", product2, df.format(cost2), df.format(quantity2), df.format(cost2 * quantity2));
        System.out.print("\n"); 
        System.out.println("--------------------------------------------");
        System.out.print("\n"); 
        System.out.printf("%25s Subtotal: $%10s", "", df.format(subtotal));
        System.out.print("\n"); 
        System.out.printf("%25s      Tax: $%10s", "", df.format(tax));
        System.out.print("\n"); 
        System.out.printf("%25s    Total: $%10s", "", df.format(total));
        System.out.print("\n\n"); 
        
        System.out.println("The total rounded to the nearest dollar is $" + Math.rint(total) + ".");
        
        // After calculating total
        double total1 = subtotal + tax;
        
        // Round total to the nearest 5 cents
        double totalRoundedToFiveCents1 = Math.round(total1 * 20.0) / 20.0;

        // Before the end of receipt printing

        System.out.println("The total rounded to the nearest 5 cents is $" + (Math.round(total * 20.0) / 20.0) + ".");
        System.out.print("\n");
        System.out.println("\nHave a good day!");
        System.out.println("Thank you for shopping at Mr. Chester’s Grocery!");
        
        //Smiley face :)
        
        System.out.print("\n\n");        
        System.out.println("                               %%@@@@@&(((&@@@@@#%  ");
        System.out.println("                            @@&                   @@@  ");
        System.out.println("                         @@                          .@@   ");
        System.out.println("                       @@        @@@         @@@        @@  ");
        System.out.println("                     @@          @@@         @@@          @(  ");
        System.out.println("                    @@          @@@@        @@@@           @&");
        System.out.println("                   (@            @@@         @@@            @  ");
        System.out.println("                   @&             @           @             @@  ");
        System.out.println("                   @(    @@                           @@    @@ ");
        System.out.println("                   @@    @@                           @@    @@   ");
        System.out.println("                   *@     @@                         @@     @ ");
        System.out.println("                    @@     @@                       @%     @%");
        System.out.println("                     &@      @@                  *@@      @, ");
        System.out.println("                       @@       @@@          *@@@       @@");
        System.out.println("                         @@.       @@,%%%,@@@         #@@ ");
        System.out.println("                            @@@                   @@@ ");
        System.out.println("                                 @@@@@@@@@@@@@@@ ");
        System.out.println("");

	}
}