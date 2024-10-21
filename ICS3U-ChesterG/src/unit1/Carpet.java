package unit1;

import java.util.Scanner;

public class Carpet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare variables
		
		int length, width, cost;

		
		//get the user input 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Carpet");
		
		System.out.print("Type in the length of the rug in meters");
		length = sc.nextInt();
		
		System.out.print("Type in the width of the rug in meters");
		width = sc.nextInt();
		
		System.out.print("Type in the cost of the rug per square-meter");
		cost  = sc.nextInt();
		
		//calculate the size 
		double size = (length*width);
		
		//calculate the cost
				double totalcost = (size*cost);

		
		
		//print the size
		System.out.println("The size of the rug is " + size + " meters");
		sc.close();
		
		//cost of the rug
		System.out.println("The cost of the rug is " + totalcost + " dollars" );
		
		sc.close();

	}

}
