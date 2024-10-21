package unit1;

import java.util.Scanner;
import java.time.LocalDateTime; //LocalDateTime class
import java.time.format.DateTimeFormatter; //DateTimeFormatter class

public class GroceryShopping {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("%5s%5s%5s%5s%5s%5s%5s%5s%5s", "$$$", "^^^", "*** ","|||||", "\"Mr. Chester's Grocery\"", "|||||","***", "^^^", "$$$");
		
		//Declare variables
		
		String product;
		double cost, quantity;
		LocalDateTime myDateObj = LocalDateTime.now();
		
		System.out.print("\n\n");
		System.out.print("What product are you buying?");
		product = sc.next();
		
		System.out.print("What is the cost of the product?");
		cost = sc.nextDouble();
		
		System.out.print("How many are you buying?");
		quantity = sc.nextDouble();
		System.out.print("Very good."); 
		
		System.out.print("\n\n");
		System.out.print("What product are you buying?");
		product = sc.next();
		
		System.out.print("What is the cost of the product?");
		cost = sc.nextDouble();
		
		System.out.print("How many are you buying?");
		quantity = sc.nextDouble();
		System.out.print("Very good\n\n"); 
		
		System.out.print("This is your recipt:\n\n"); 
		System.out.print("\t Mr. Chester's Grocery\n"); 
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println(formattedDate);
		 
	}

}


