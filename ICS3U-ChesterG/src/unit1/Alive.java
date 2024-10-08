package unit1;

import java.util.Scanner;

public class Alive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare variables
		
		int year1, month1, day1, year2, month2, day2, daysalive; 

		
		//get the user input 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Alive!");
		System.out.print("Your birthdate: ");
		System.out.print("\n");
		System.out.print("\n");
		
		System.out.print("Type in your birth year: ");
		year1 = sc.nextInt();
		
		System.out.print("Type in your birth month: ");
		month1 = sc.nextInt();
		
		System.out.print("Type in your birth date: ");
		day1 = sc.nextInt();
		
		System.out.print("Today's date: ");
		System.out.print("\n");
		System.out.print("\n");
	    
		System.out.print("Type in this current year: ");
		year2 = sc.nextInt();
		
		System.out.print("Type in this month number: ");
		month2 = sc.nextInt();
		
		System.out.print("Type in today's date: ");
		day2 = sc.nextInt();
		System.out.print("\n");
		
		
		
		
		//alive for how many days 
	
		
		
		//print the output 
		System.out.println("You have been alive for " + (daysalive = ((year2 - year1)*365)+ ((month2- month1)*30) + ((day2- day1))) + " days");
		System.out.print("You have slept for " + (daysalive)*8 + " hours");
		
		
				
		
		

	}

}
//