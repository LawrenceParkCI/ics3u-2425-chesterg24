package unit1;

import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare variables
		
				int hours, wage, insurance;
				 double tax;
		
				
				//get the user input 
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Net Pay!");
				System.out.print("Type in the hourly pay and <Enter>: ");
				hours = sc.nextInt();
				
				System.out.print("Type in the job wage and <Enter>: ");
				wage = sc.nextInt();
				
				System.out.print("Type in the insurance deducation and <Enter>: ");
				insurance = sc.nextInt();
				
				System.out.print("Type in the tax in decimal form and <Enter>: ");
				tax = sc.nextDouble();
				
				//calculate the Net Pay 
				double NetPay = (hours*wage-insurance) - tax*(hours*wage-insurance);
				
				
				//print the output 
				System.out.println("The value of Net Pay is " + NetPay);
				sc.close();
				

	}

}
