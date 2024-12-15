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
		        num = num + 7;
		      } else  {
		        num = num + 1;
		      }
		    }
		    System.out.println(num);
		  }

	}

