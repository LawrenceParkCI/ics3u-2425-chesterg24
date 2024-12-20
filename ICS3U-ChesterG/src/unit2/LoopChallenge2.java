package unit2;
import java.util.Scanner;

/**
 Description: Square root of a positive number
 Date: 2024/11/22
 @author: Gavin Chester
 */

public class LoopChallenge2 {
	public static void main(String[] args) {
		/*
      Write a program to take the square root of a number typed in by 
      the user. Your program should use a loop to ensure that the number 
      they typed in is positive. If the number is negative, you should 
      print out some sort of warning and make them type it in again.

      You can get the square root of a number n with Math.sqrt(n). Make 
      sure you don't do this until the loop is done and you know for 
      sure you've got a positive number.

      Use the loop that you didn't use in LoopChallenge1
		 */

		Scanner scanner = new Scanner(System.in);
		double number; 

		// Number
		System.out.print("What is a positive number?");

		// Use a while loop for positive number
		while (true) {
			number = scanner.nextDouble(); 

			//Check positive number 
				if (number >= 0) {
				break;  // Exit loop if positive
			} else {
				System.out.println("This number is negative. ERROR");
			}
		}

		//Square root of number entered
		double squareRoot = Math.sqrt(number);
		System.out.println("The square root of " + number + " is: " + squareRoot);

		scanner.close();
	}
}

