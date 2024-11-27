package unit2;

/**
 * Description: Counts the occurrences of A, C, G, and T in a DNA string
 * Date: 2024/11/26
 * @author: Gavin Chester
 */
import java.util.Scanner;

public class DNAStringChallenge {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input DNA string
    System.out.print("Enter DNA String: ");
    String dna = scanner.nextLine().toUpperCase();

    int countA = 0, countC = 0, countG = 0, countT = 0;

    // Counting nucleotide occurrences
    for (int i = 0; i < dna.length(); i++) {
      char nucleotide = dna.charAt(i);
      switch (nucleotide) {
        case 'A': countA++; break;
        case 'C': countC++; break;
        case 'G': countG++; break;
        case 'T': countT++; break;
        default: break; // Ignores non-DNA characters
      }
    }

    // Printing results
    System.out.println("A: " + countA);
    System.out.println("C: " + countC);
    System.out.println("G: " + countG);
    System.out.println("T: " + countT);

    scanner.close();
  }
}
