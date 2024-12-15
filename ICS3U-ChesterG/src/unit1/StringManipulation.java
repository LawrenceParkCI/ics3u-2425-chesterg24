package unit1;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    // declare variables 
		String input;
		
		//user input 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("String Manipulation");
		System.out.print("\n");
		
		System.out.print("Input a sentance: ");
		System.out.print("\n");
		input = sc.nextLine();
		
		//print
		
		System.out.println("This sentance has been printed:");
		System.out.print("\n");
		System.out.println(input);
		System.out.println(input.toUpperCase());
		System.out.println(input.toLowerCase());
		System.out.println("This sentance is " + input.length() + " characters long");
		System.out.println("At index 5, the characters displayed is: " + input.charAt(5));
		

	}

}

