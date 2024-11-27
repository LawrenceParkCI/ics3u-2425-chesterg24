package unit2;

/**
 * Description: Creates a range of numbers with user input for start, end, and step
 * Date: 2024/11/26
 * @author: Gavin Chester
 */
import java.util.Scanner;

public class ForChallenge1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Getting user input
    System.out.print("Starting Num: ");
    double start = scanner.nextDouble();

    System.out.print("Ending Num: ");
    double end = scanner.nextDouble();

    System.out.print("Count by: ");
    double increment = scanner.nextDouble();

    // Printing the range using a for loop
    System.out.println("Result: ");
    for (double i = start; i <= end; i += increment) {
      System.out.printf("%.1f ", i); // Format to 1 decimal place
    }
    System.out.println(); // New line
    scanner.close();
  }
}
