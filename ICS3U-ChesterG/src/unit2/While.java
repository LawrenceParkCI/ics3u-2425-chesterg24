package unit2;
/**
 * Description: While program
 * Date: 2024/11/22
 * @author: Gavin Chester
 */
import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many people are you planning to see?");

		//Why do you think I coded it this way?
		int numPeople = Integer.parseInt(in.nextLine());

		while (numPeople > 0) {
			System.out.print("What is this person's name? ");

			//Why do you think the variable is declared here?
			String name = in.nextLine();
			System.out.println("Welcome, " + name + "!");

			numPeople = numPeople - 1;
		}


		in.close();
		//Run the code Using the debugger. 
		//Explain the code in your own words
		//This code asks for a number of people and then asks for each person's name.

		//What code is repeated?
		//"What is this person's name?" and "Welcome,..!" code are repeated

		//When does it decide whether to repeat or not?
		//"When there are same number of names as people entered."

		//What is the condition for repeating?
		//This condition is for repeating: "What is this persons name?" until the number of names as people is entered.


		//What is the difference between a while loop and a do-while loop?
		//The do-while loop is used when the number of iterations is uncertain, where the while loop is typically used when you want to repeat a task a specific number of times.


		//Create a while loop that asks for a word, 
		//and prints it out 20 times.

		System.out.print("Type any word.");
		String word = in.nextLine();
		int repeat = 1;
		while (repeat<=20 ) {
			System.out.println(word);
			repeat ++;
		}
		in.close();
	}
}
