package unit2;
import java.util.Scanner;

public class PositiveNegative {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter an integer: ");
     int number = scanner.nextInt();

     // Check if the number is positive or negative
     if (number > 0) {
         System.out.println("The number " + number + " is positive.");
     } else if (number < 0) {
         System.out.println("The number " + number + " is negative.");
     } else {
         System.out.println("The number is zero.");
     }

     // Check if the number is divisible by 7
     if (number % 7 == 0) {
         System.out.println("The number " + number + " is divisible by 7.");
     } else {
         System.out.println("The number " + number + " is not divisible by 7.");
     }

     scanner.close();
 }
}

