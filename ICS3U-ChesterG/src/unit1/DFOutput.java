package unit1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DFOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Run the following program with a cost of 10.00.
		//What value is displayed in the output?
		//The Value 11.3 is displayed
		
		final double TAX_RATE = 1.13;
		DecimalFormat money = new DecimalFormat("$#,###,##0.00");
		DecimalFormat percent = new DecimalFormat("#.#%");

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);
		
		System.out.println("The cost of your item with tax is " + money.format(total));
		

		//Change the above print statement on line 19 to:
		//System.out.println("The cost of your item with tax is " + money.format(total));
		//Run the program again, how is the output different? Why?
		//The output is different because the total of the money is formatted to two decimal places 
		
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.00"
		//Run the program again with the cost of 10, how is the output different?
		//The output is $11.30. The output is different because of the decimal format
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Run the program again with the cost of 10, how is the output different?
		//The output gives only one decimal places compared to two. The zero is dropped behind the 3
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Calculate 10.50 x 1.13 = $22.36
		//Run the program again with the cost of 10.50, what is happening?
		//The program is showing two decimal places because of the calculation and decimal format 
		
		//Modify the parameter for the DecimalFormat on line 15 as you think is appropriate for money.
		//Run the program again with the cost of 123456, what is displayed?
		//The program displays $262961.28. This because I added two ## for decimal places. 
		
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$#,###,##0.00"
		//Run the program again with the cost of 123456, how is the output different? Explain what is happening.
		//The output is $262,961.28. This output is different because numbers are shown with commas rather than one big number.  
		
		
		
		//Uncomment the following print line, and run the program with any value for the cost.
		//What value is printed for the TAX_RATE? The value printed is "The tax rate is 1.13
		double cost1;
		System.out.print("Please enter the cost of a new item then press <Enter>: $");
		cost1 = sc.nextDouble();
		final double TAX_RATE1 = 1;
		double total1 = cost1 + (cost1 * TAX_RATE1);
		
		
		DecimalFormat money1 = new DecimalFormat("$#,###.0");
		DecimalFormat percent1 = new DecimalFormat("#");
		System.out.println("The cost of your new item with tax is " + money1.format(total1));
		System.out.println("The tax rate is " + TAX_RATE1);
		
		
		//Change the above print statement to format the TAX_RATE using the percent DecimalFormat instance.
		//Run the program again with any cost, how is the TAX_RATE displayed differently?
		//The program TAX_RATE is shown as a whole number 1 


		sc.close();
	}

}
