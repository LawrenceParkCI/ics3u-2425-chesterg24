package unit1;

/**
* Description:
* Date:
* @author 
*/
public class Commenting {
  
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

    System.out.println(myChar2);

    //Explain what is happening in the code. Where is there explicit casting, where is there implicit casting?
    //The program starts by printing the character 'a'.Then, the character 'a' is added to the integer 1, which results in 98 (the ASCII value for 'b'), and this result is printed. 
    //The integer result 98 is explicitly cast back to a character ('b') and printed.
    //Finally, the character 'a' is converted to its uppercase version ('A') using Character.toUpperCase(), and this is printed.
    //When adding 1 to the char myChar, Java automatically converts myChar (which has the ASCII value of 97) to an integer for the arithmetic operation. This happens implicitly.

    //Why do you think this happens?
    //This happens because Java internally represents characters using ASCII codes. When a char is involved in arithmetic operations, it is treated as its corresponding integer (ASCII) value.

    //Investigate what is ASCII. What is it?
    //ASCII (American Standard Code for Information Interchange) assigns numeric values to characters. Ex. a=97,A=65

    //Can you find the number value for 'a'? Does it match with your findings above?
    //Yes, the ASCII (American Standard Code for Information Interchange) value for the character 'a' is 97. This matches the findings in the code above.

    //create a new character myCharCap, and transform myChar into a capital 'A' and print it
    char myCharCap = Character.toUpperCase(myChar); 
    System.out.println(myCharCap);
    

  }
}