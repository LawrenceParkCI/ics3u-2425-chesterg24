package unit2;
import java.util.Scanner;

/**
 * Description: Prompts user to enter three numbers, then checks if numbers are in increasing order.
 * Date: 
 * Author: 
 */

public class IfChallenge2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the first number: ");
    int num1 = scanner.nextInt();
    
    System.out.print("Enter the second number: ");
    int num2 = scanner.nextInt();
    
    System.out.print("Enter the third number: ");
    int num3 = scanner.nextInt();

    // Check if the numbers are in strictly increasing order
    if (num1 < num2 && num2 < num3) {
      System.out.println("The numbers are in increasing order!");
    } else {
      System.out.println("The numbers are NOT in increasing order!");
    }

    scanner.close();
  }
}
