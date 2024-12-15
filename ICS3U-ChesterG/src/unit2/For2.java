package unit2;

/**
 * Description: Basic for loop usage 
 * Date: 2024/11/26
 * @author: Gavin Chester
 */

public class For2 {
  public static void main(String[] args) {
    // Basic for loop printing numbers 1 to 10
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }

    // For loop with a custom starting and ending range using an integer counter
    int times = 20;
    for (int i = 15; i < times; i++) {
      System.out.println(i);
    }

    // Using a double as the counter
    double increment = 0.1;
    for (double i = 0; i < 2; i += increment) {
      System.out.println(i);
    }

    // Summing numbers in a range
    int sum = 0; 
    for (int i = 1; i < 10; i++) {
      sum += i;
    }
    System.out.println("Sum of 1 to 9: " + sum);
  }
}
