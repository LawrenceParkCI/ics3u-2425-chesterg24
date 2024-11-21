package unit2;

import java.util.Scanner;

/**
Description: Name Game 
Date: 2024/11/21
@author: Gavin Chester
*/

import java.util.Scanner;

public class DoWhile {
 public static void main(String[] args) {
   /*
   A loop is another control structure that allows for repetition. It 
   does not make a decision on which branch to go on, like the 
   conditional.
   It makes a decision whether it should go back to redo a set of code.
   */
   Scanner in = new Scanner(System.in);
   String name;
   do {
     System.out.print("What is your name? ");
     name = in.nextLine();
   } while (!name.equals("Mr. Lee"));

   System.out.println("You are welcome into the secret secret pogchamp club.");

   //Run the code. Explain the code in your own words

   //What code is repeated?
   //The what is your name code is repeated until Mr. Lee is entered 
   //When does it decide whether to repeat or not?
   //if the name equals to Mr. Lee
   //What is the condition for repeating?
   //this is a post-conditional loop


   /*
    Note:Pay attention to the brackets, and the semicolon
   */

   /*
     When constructing a loop, there are many strategies. I like to 
     break down the problems this way:
       1. What commands am I going to repeat?
       2. How many times/until when will I repeat the code?
   */

   //Create a do-while loop that asks for a word, and 
   //prints it out 20 times.
   String userInput;
  
   
   System.out.println("What word would you like printed");
	userInput = in.nextLine();
	int numberCount = 20;
	
   do { 
	   System.out.println (userInput);
	   numberCount --;
   } while (numberCount > 0);
 
   
 }
}
