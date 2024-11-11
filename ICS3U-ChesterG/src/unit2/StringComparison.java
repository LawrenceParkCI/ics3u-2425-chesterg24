package unit2;

import java.util.Scanner;
/**
 * Description:
 * Date:
 * @author 
*/

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner in = new Scanner(System.in);

	    System.out.println("What is the capital of Ontario?");
	    String answer = in.nextLine();

	    // Corrected string 
	    if (answer.equals("Toronto")) {
	      System.out.println("Correct!");
	    } else {
	      System.out.println("Sorry, that's incorrect.");
	    }

	    // Demonstrating .compareTo(), .equals(), and .equalsIgnoreCase()
	    System.out.println("\nString Comparison Examples:");
	    String correctAnswer = "Toronto";

	    // compareTo() 
	    int result = answer.compareTo(correctAnswer);
	    if (result == 0) {
	      System.out.println("compareTo: The answers are identical.");
	    } else if (result < 0) {
	      System.out.println("compareTo: Your answer comes before the correct answer.");
	    } else {
	      System.out.println("compareTo: Your answer comes after the correct answer.");
	    }

	    // equals()
	    System.out.println("equals: " + answer.equals(correctAnswer));

	    // equalsIgnoreCase()
	    System.out.println("equalsIgnoreCase: " + answer.equalsIgnoreCase(correctAnswer));

	    // What values does compareTo() return? How can we interpret the value?
	    //The compareTo() method returns an integer:
	    //0 if the strings are identical.
	    //A negative value if the calling string (e.g., answer) comes before the compared string (e.g., correctAnswer) lexicographically.
	    //A positive value if the calling string comes after the compared string lexicographically.
	    //This allows us to determine the relative ordering of two strings.

	    // What value does equals() and equalsIgnoreCase() return?
	    //Both methods return a boolean:
	    //true if the strings are considered equal based on their criteria.
	    //false if they are not equal.
	    //equals() requires an exact match (case-sensitive), while equalsIgnoreCase() ignores case differences.

	    // What is the difference between these two functions?
	    //equals() checks for an exact, case-sensitive match.
	    //equalsIgnoreCase() checks for equality while ignoring case differences, making "Toronto" and "toronto" equal.


	    in.close();
	}

}
