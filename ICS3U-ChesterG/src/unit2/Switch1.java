package unit2;
import java.util.Scanner;
/**
Description:
Date:
@author
*/

public class Switch1 {
public static void main(String[] args) {
		    
		    Scanner in = new Scanner(System.in);

		    System.out.println("What day is it?");
		    String day = in.nextLine().trim();
		    int daysUntilWeekend;

		    switch(day.toLowerCase()) { 
		      case "sunday":
		        daysUntilWeekend = 6;
		        break;
		      case "monday":
		        daysUntilWeekend = 5;
		        break;
		      case "tuesday":
		        daysUntilWeekend = 4;
		        break;
		      case "wednesday":
		        daysUntilWeekend = 3;
		        break;
		      case "thursday":
		        daysUntilWeekend = 2;
		        break;
		      case "friday":
		        daysUntilWeekend = 1;
		        break;
		      case "saturday":
		        daysUntilWeekend = 0;
		        break;
		      default:
		        System.out.println("Invalid day entered.");
		        return;
		    }

		    // Output the result
		    System.out.println("There are " + daysUntilWeekend + " day(s) until the weekend.");


		    //Run the program. Type in a number between 1-7, and then a number bigger than that. What is the result?
		    //System prints "Invalid day entered". 
		    //What do you think default means?
		    //If the user enters an invalid day name, the program will print an error message and exit.
		    //What do you think break means? What happens when you remove a break?
		    //This statement exits the switch block once a case has been matched. Without break, the program would continue executing the code for the following cases, causing all case statements to run until it hits the next break or exits the switch block.


		    //Create another program, this time asking what day it is (String), and printing out how many days until the weekend

		  }
		}

