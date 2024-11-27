package unit2;

/**
 * Description: Demonstrates string methods with for loops
 * Date: 2024/11/26
 * @author: Gavin Chester
 */
import java.util.Scanner;

public class StringLengthAndChars {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Prompting user for a name
    System.out.print("Enter a name: ");
    String name = scanner.nextLine();

    // Printing each character in the name
    System.out.println("Characters in the name:");
    for (int i = 0; i < name.length(); i++) {
      System.out.println(name.charAt(i));
    }

    // Demonstrating length and charAt
    System.out.println("Example with hardcoded string 'Ms. Kemp':");
    String example = "Ms. Kemp";
    System.out.println(example.length()); 
    System.out.println(example.charAt(1)); 
    System.out.println(example.charAt(2)); 
    System.out.println(example.charAt(3)); 

    scanner.close();
  }
}
