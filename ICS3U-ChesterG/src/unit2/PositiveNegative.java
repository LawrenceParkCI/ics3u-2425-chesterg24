package unit2;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables 
		Scanner sc = new Scanner(System.in);
		double integer;
		
		//input
		System.out.print("Enter any number");
		integer = sc.nextInt();
		
		//determine if the number is odd or even
		if ((integer % 2) == 0) {
			System.out.println("This number is even!");
			   // even
			} else {
				System.out.println("This number is odd!");
			   // odd
			}
		
		
		
		
	}

}
