package unit1;

/**
* Description:
* Date:
* @author 
*/

public class Casting2 {
  
  /**
   * This is the entry point to the program.
   * @param args unused
   */
  public static void main(String[] args) {
    /*
    Char and int
    */
    char myChar = 'a';
    System.out.println(myChar);
    System.out.println(myChar + 1);

    char myChar2 = (char) (myChar + 1); 
    System.out.println(myChar2); // Prints 'b'

    //Explain what is happening in the code. Where is there explicit casting, where is there implicit casting?
    //The code has the character "a" and the next line adds by the number 1. This is explicit casting. Then char1 is changed to char2 which is also explicit casting
    //Why do you think this happens?
    //The code follows the direction and there is a combo of explicit and implicit casting
    //Investigate what is ASCII. What is it?
    //ASCII is an acronym for American Standard Code for Information Interchange. ASCII codes represent text in computers, telecommunications equipment, and other devices.
    //Can you find the number value for 'a'? Does it match with your findings above?
    //a = 97. Yes the number value matches my findings above

    //create a new character myCharCap, and transform myChar into a capital 'A' and print it

    char myCharCap = Character.toUpperCase(myChar); 
    System.out.println(myCharCap); // Prints 'A'
    
    

  }
}
