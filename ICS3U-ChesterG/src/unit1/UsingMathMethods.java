package unit1;
import java.util.Scanner;

/**
 * Description:
 * Date:
 * @author 
 */
public class UsingMathMethods {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, num1, integer;
		
		System.out.println("Part A");
		//Write code to ask the user for any real number to be input.
		//Store their input into the num variable
		
		System.out.print("Type in any real number:");
		num = sc.nextDouble();
		
		System.out.println(Math.round(num));
		System.out.println(Math.rint(num));
		System.out.println(Math.sqrt(num));
		System.out.println(Math.abs(num));
		System.out.println(Math.pow(num, 2));
		System.out.println(Math.pow(num,num));
		System.out.println(Math.pow(num, 3));
		
		/*
		 * Run the program and write down the output that is produced
		 * when each of the following values are input:
		 * 
		 * 					num = 16.75		| num = 4.0		| num = -23.45
		 * 					-----------------------------------------------
		 * Math.round(num)			17		| 		4		| -23
		 * Math.rint(num)			17.0	| 		4.0		| -23.0
		 * Math.sqrt(num)4.092676385936225  |		2.0		| NaN
		 * Math.abs(num)			16.75	|		4.0		| 23.45
		 * Math.pow(num, 2)	   280.5625	    |		16.0	| 549.9024999999999
		 * Math.pow(num, num)3.178689376746782E20|	256.0	| NaN
		 * Math.pow(num, 3)	4699.421875	    |		64.0	| -12895.213624999999
		 * 
		 */
		
		//Why does the last value(-23.45) give strange output for Math.sqrt(num)?
		//Nan stands for Not a number!
		//The value of sqrt -23.45 is NaN (Not a Number) because there is no true square root of a negative number. Square roots of negative numbers can only be determined using the imaginary number called an i.
		
		
		
		//In your own words describe what the following Math methods does
		/*
		 * round:
		 *The number in the program is rounded based off decimal numbers. In the program, if the decimal digit is less than 5, round down and if the  decimal digit is 5 or more than 5, round up.
		 * rint:
		 * A number in the rint method is rounded to the nearest integer. If two integers are equally close to the number then the even integer will be returned.
		 * sqrt:
		 * This is the square root function. This method returns a number to the square root. 
		 * abs: 
		 * The abs method returns the absolute value of a number. 
		 * pow:
		 * The pow method returns the x value to the power of y. x^y
		 */
		
		//The methods round, sqrt and abs only have one parameter (which is in the brackets).
		//Why does the pow method have 2 parameters? Explain the purpose of these 2 parameters.
		//The pow method has two parameters because  'x,' is an integer, which is the base and "y", is the exponent to the base.
		
		System.out.println("\n");
		System.out.println("Part B");
		//Ask the user for any real number and an integer to be input. Display the real number,
		//and its square root. Also determine and display the real number raised to the integer power.
		//Use suitable headings, displaying the results across the screen.\
		//
	
		System.out.print("Type in any real number and a real number power:");
		num1 = sc.nextDouble();
		integer = sc.nextDouble();
		
		System.out.print("REAL NUMBER \t SQUARE ROOT \t REAL NUMBER POWER");
		System.out.println("\n");
		System.out.print((num1)); System.out.println("\t"); System.out.print(Math.sqrt(num1)); System.out.println("\t"); System.out.print(Math.pow(num1, integer));
		
		
		
		//Eg. If the real number 13.5 and the integer 2 are input, display
		//REAL NUMBER	SQUARE ROOT		RAISED TO POWER 2 <- display power here
		//   13.5		   3.6742			182.25
		
		
		
		
		//Write down the results produced by your program when the real number 7.8985 and
		//the integer 3 are input.
		
		//7.8985
		//2.8104270138183627
		//492.75820832162503
		
		
		//Change your program so that instead of inputting an integer power, a real number
		//power can be input.
		//Write down the results produced by your program when the following are input:
		//a) the number 16 and the real number power 0.5
		
		//Real Number: 16.0
		//Square Number: 4.0
		//Real Number Power: 4.0
		
		//b) the number 8 and the real number power 0.33
		
		//Real Number: 8.0 
		//Square Root: 2.8284271247461903
		//Real Number Power: 1.9861849908740719
		
		
		
		//Does your program give a different answer if 0.3333333 is input instead of 0.33 for the power?
		//Yes the program gives the output of 1.9999999999998614
		
		
		
	}

}
