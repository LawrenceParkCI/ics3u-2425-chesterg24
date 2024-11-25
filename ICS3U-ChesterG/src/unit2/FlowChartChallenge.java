package unit2;

import java.util.Scanner;
/**
 Description: FlowChart
 Date:2024/11/22
 @author: Gavin Chester
*/
class FlowChartChallenge {
  public static void main(String[] args) {
    /*Create a flow chart for this program. Add the Share link
    to your flowchart as a comment in this program.
    https://app.diagrams.net/#G1Zsu69_mohLvDOo0XA2E2ZiONrEvWNeBu#%7B%22pageId%22%3A%22qimAGbVej8AkoOHlHItt%22%7D

    How would the flow chart of the do-while loop
     and while loop differ?
//In a do-while loop, the action runs before the condition is checked, guaranteeing at least one execution. In a while loop, the condition is checked before the action, so the action may not run if the condition is false initially.

    */
    
	  Scanner sc = new Scanner(System.in);
	    String name;
	    do {
	      System.out.print("What is your name? ");
	      name = sc.nextLine();
	    } while (!name.equals("Ms. Kemp"));

	    System.out.println("You are welcome into the secret secret pogchamp club.");

	    in.close();
    
  }
}
