package unit2;

import java.util.Scanner;

/**
 * Description:
 * Date:
 * @author 
*/

public class IfStatements2 {
  public static void main(String[] args) {
	  
	  
	//User Input
    Scanner in = new Scanner(System.in);
    System.out.println("What is your age?");
    
    //Variables
    int userAge = in.nextInt();
    
    //Over 18
    if (userAge > 18) { 
        String title = "Adult";
        System.out.println("title: "+ title);
      } 
    
    //Not Over 18
    else {  
        System.out.println("Sorry, not quite yet.");
      }



    
    
    
    /*
    if (userAge > 18) { //If they're over 18, they are titled an adult
      String title = "Adult";
    } else {  //if they're not over 18, I don't want a title
      System.out.println("Sorry, not quite yet.");
    }

    System.out.println(title);
    */
    //Looking at the logic above, why do you think the 
    //program won't work? 
    //This program looks to be all jumbled up and not correct format.

    //Copy the code below, and try to find a solution.
    //Comment the code above to avoid compilation errors.


  }
}
