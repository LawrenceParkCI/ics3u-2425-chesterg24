package unit2;
import java.util.Scanner;
/**
 * Description: 
 * Date: 
 * Author:
 */


public class StringChallenge {
    public static void main(String[] args) {
       
        //String Comparison Examples
        String str1 = "Hello";
        String str2 = "hello";
       
        // .equals() - Checks if str1 and str2 are exactly the same, with case sensitivity.
        // This is used to compare two strings exactly as they are, where "Hello" is not equal to "hello" because of case.
        // Expected output: "str1 is NOT equal to str2 using .equals()" because 'H' is different from 'h'.
        if (str1.equals(str2)) {
            System.out.println("str1 is equal to str2 using .equals()");
        } else {
            System.out.println("str1 is NOT equal to str2 using .equals()");
        }
       
        //.equalsIgnoreCase() - Compares str1 and str2, ignoring case differences.
        //This function is used when we want to check if two strings are equal in content but don’t care about case.
        //Expected output: "str1 is equal to str2 using .equalsIgnoreCase()" because it ignores the case difference.
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("str1 is equal to str2 using .equalsIgnoreCase()");
        }


        //.compareTo() - Compares str1 and str2 lexicographically (alphabetical order).
        //If str1 is exactly equal to str2, it returns 0.
        //If str1 is alphabetically before str2, it returns a negative value.
        //If str1 is alphabetically after str2, it returns a positive value.
        //Here, since "Hello" is lexicographically greater than "hello" due to ASCII values, a positive number will be returned.
        int comparisonResult = str1.compareTo(str2);
        if (comparisonResult == 0) {
            System.out.println("str1 is equal to str2 using .compareTo()");
        } else if (comparisonResult < 0) {
            System.out.println("str1 comes before str2 using .compareTo()");
        } else {
            System.out.println("str1 comes after str2 using .compareTo()");
        }


        //Casting Examples
        
        //Implicit Casting (Widening): Automatically converts a smaller data type (int) to a larger data type (double).
        //'num' is an int, and it is automatically cast to double when assigned to 'numDouble'.
        //This preserves the numeric value but changes the type to double, allowing it to hold decimal points if needed.
        int num = 42;
        double numDouble = num; // 42 becomes 42.0
        System.out.println("Implicit casting: int " + num + " to double is " + numDouble);


        //Explicit Casting: Converts a larger data type to a smaller data type.
        //Here, 'pi' is a double with a decimal value. When cast to int, the decimal part is truncated, and only the integer part is kept.
        //This type of casting must be done explicitly to avoid data loss.
        double pi = 3.14;
        int piInt = (int) pi; // 3.14 becomes 3
        System.out.println("Explicit casting: double " + pi + " to int is " + piInt);
    }
}






