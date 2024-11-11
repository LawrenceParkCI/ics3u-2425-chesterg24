package unit2;

public class BasicBoolean {
	/**
	 * Description:
	 * Date:
	 * @author 
	*/

	public static void main(String[] args) {
	    //we've declared a variable called isPurple of boolean type
	    //Recall: boolean holds either true or false
	    boolean isPurple = false;

	    /*
	      Boolean Operators, Expressions
	    */
	    //boolean expressions are ways we can "calculate" whether
	    //something is true or false
	    int firstNum = 5;
	    int secondNum = 10;
	    double thirdNum = 5.5;
	    //this prints out true because firstnum less than second num
	    System.out.println("1: " + (firstNum < secondNum)); 
	    //this prints out false because firstnum is not greater than second num
	    System.out.println("2: " + (firstNum > secondNum)); 
		//this prints out true because first num is greater than or equal to int third num (5)
	    System.out.println("3: " + (firstNum <= (int)thirdNum)); 
	    //this prints out false because first num is not greater than or equal to third num
	    System.out.println("4: " + (firstNum <= thirdNum)); 
	    /*Test out these boolean operators. Figure out the meaning
	      * > means: Greater than
	      * < means: Less than 
	      * <= means: Less than or Equal to
	      * >= means: Greater than or Equal to 
	      * == means: Equals 
	      * != means: Does not Equal 
	    */
	  }
	}