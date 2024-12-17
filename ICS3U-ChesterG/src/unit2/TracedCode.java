package unit2;

public class TracedCode {
		/**
		Name: Mr. Lee
		Date: Oct 29, 2021
		Description: Tracing through code
		*/
		  public static void main1(String[] args) {
		    int num = 0;
		    String word = "Que";

		    while (num < 15) {
		      System.out.println(word);
		      num = num + 1;
		    }
		    word = word + word;
		    while (num > 0) {
		      System.out.println(word);
		      num = num - 1;
		    }
		  }

		/**
		Name: Mr. Lee
		Date: Oct 29, 2021
		Description: Tracing through code
		*/

		  public static void main2(String[] args) {
		    int num = 500;

		    while (num > 1) {
		      if (num % 2 == 0) {
		        num = num / 2;
		      } else if (num % 3 == 0) {
			        System.out.println("Condition: num % 3 == 0, adding 7 to num");
			        num = num + 7;
		      } else {
			        System.out.println("Default condition: incrementing num by 1");
			        num = num + 1;
		      }
		    }
		    System.out.println(num);
		  }

	}

public class Main2Trace {
	  public static void main(String[] args) {
	    // Initialization
	    int num = 500;

	    // Trace - Initial value
	    System.out.println("Initial state: num = " + num);

	    // While loop
	    while (num > 1) {
	      if (num % 2 == 0) {
	        System.out.println("Condition: num % 2 == 0, dividing num by 2");
	        num = num / 2;
	      } else if (num % 3 == 0) {
	        System.out.println("Condition: num % 3 == 0, adding 7 to num");
	        num = num + 7;

	      }

	      // Print after each step
	      System.out.println("Current state: num = " + num);
	    }

	    // Final state
	    System.out.println("Final state: num = " + num);
	  }
	}

