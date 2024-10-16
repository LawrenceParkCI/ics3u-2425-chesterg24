package unit1;

/**
* Description:
* Date:
* @author 
*/
public class Casting3 {
  
  /**
   * This is the entry point to the program.
   * @param args unused
   */
 public static void main(String[] args) {
    /* 
    * Strings and Back Again
    */
    //Recall:
    System.out.println("Part 1");
    System.out.println("1 + 2 + 3" + 4 + 5);
    //why did it print out this way?
    //Expression is evaluated left to right. "1 + 2 + 3" is a String, and adding 4 and 5 brings them to the String instead of adding the numbers first. This results in "1 + 2 + 34 5".
    //Demonstrate casting a double value to a String in this way
    double myDouble = 10.25;
    String doubleToString = Double.toString(myDouble);
    System.out.println("Double to String: " + doubleToString);
   
    //Demonstrate casting a boolean value to a String in this way
    boolean myBoolean = true;
    String booleanToString = Boolean.toString(myBoolean);
    System.out.println("Boolean to String: " + booleanToString);

    //Demonstrate casting a char value to a String in this way
    char myChar = 'A';
    String charToString = Character.toString(myChar);
    System.out.println("Char to String: " + charToString);


    System.out.println("Part 2");
    //In order to change a String into an integer, we need another set of code

    String strNum = "25";
    int myNum = Integer.parseInt(strNum);
    System.out.println(strNum + " x 2 = " + (myNum + myNum));

    /*Change strNum to the following values, and see if they work:
     * "25.2"
     * "23c"
     * "2 3"
     * "Lol23"
     * "-5"
    */
    //What can you say about how we can use the function, Integer.parseInt()?
    //Integer.parseInt() works only with integer strings. If the string contains non-numeric characters, it will show a NumberFormatException.

    // What do you think the code to change a String to double would look like?
    //    String strDouble = "25.2";
    //double myDoubleVal = Double.parseDouble(strDouble);
    //System.out.println(strDouble + " x 2 = " + (myDoubleVal * 2));
   //Similar to Integer.parseInt(), but using Double.parseDouble() to convert a string to a double
    //Similarly, test out the code and write down what instructions
  

    //When do you think it might be necessary to change a string value into an integer value/double value?
   //performing calculations on user input from forms and the input comes as strings but you need to process them as numbers for mathematical operations.
  }
}