package unit2;
/**
 * Description: Creates a program with a correct password
 * Date: 2024/11/22
 * @author: Gavin Chester
 */

import java.util.Scanner;
public class LoopChallenge1 {
	public static void main(String[] args) {
	    /*
	      Create a program that will ask for the password.  If they answer 
	      incorrectly, tell them, and repeat. If they answer correctly, 
	      welcome them in.
	      
	      Extra: if they don't give a proper answer within 3 
	      Decide on whether you should use the while or do while loop.
	    */


		Scanner scanner = new Scanner(System.in);

		//correct password
		String correctPassword = "ChesterChester"; 

		//Variables
		String enteredPassword;
		int attempts = 0;
		boolean isCorrect = false;

		// Do-while loop
		do {
			System.out.print("Enter the password: ");
			enteredPassword = scanner.nextLine(); 
			attempts++;  // Increase attempt count

			if (enteredPassword.equals(correctPassword)) {
				isCorrect = true;  // Password is correct
			} else {
				System.out.println("Try again.");
			}
		} while (!isCorrect && attempts < 3);  // Repeat password is wrong, attempts less than 3

		// Check for success or failed after 3 attempts
		if (isCorrect) {
			System.out.println("Welcome!");
		} else {
			System.out.println("Maximum number of attempts.");
		}

		scanner.close(); 
	}
}

