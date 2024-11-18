package unit2;

import java.util.Scanner;
/**
 * Description:
 * Date:
 * @author 
*/

public class Switch2 {
	  public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

	    System.out.println("Enter the month name:");
	    String month = in.nextLine().trim();

	    int daysInMonth;

	    //Leap year 
	    if (month.equalsIgnoreCase("February")) {
	      System.out.println("Enter the year:");
	      int year = in.nextInt();

	      // Leap year check
	      if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
	        daysInMonth = 29;
	      } else {
	        daysInMonth = 28;
	      }
	    } else {
	    	
	      //Switch statement for other months
	      switch(month.toLowerCase()) {
	        // Months with 31 days
	        case "january":
	        case "march":
	        case "may":
	        case "july":
	        case "august":
	        case "october":
	        case "december":
	          daysInMonth = 31;
	          break;
	          
	        // Months with 30 days
	        case "april":
	        case "june":
	        case "september":
	        case "november":
	          daysInMonth = 30;
	          break;
	          
	        // Invalid month
	        default:
	          System.out.println("Invalid month entered.");
	          return; 
	      }
	    }

	    // Output the result
	    System.out.println("The month of " + month + " has " + daysInMonth + " days.");
	    
	    //Can you create it such that you can remove some breaks?
	    //I grouped cases for months with the same number of days without setting separate values within each case.
	  }
	}
