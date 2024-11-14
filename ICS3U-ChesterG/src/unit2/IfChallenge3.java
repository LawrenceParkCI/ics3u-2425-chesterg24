package unit2;
import java.util.Scanner;

/**
 * Description: Interactive Quiz Program
 * Date: 11/14/2024
 * Author: Gavin Chester
 */

public class IfChallenge3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wrongAnswers = 0; // Track incorrect answers

        System.out.println("Are you ready for the quiz:");
        System.out.println("Yes or No");
        System.out.println("Answer:");
        String ready = scanner.nextLine();

        if (ready.equalsIgnoreCase("No")) {
            System.out.println("Okay, still get ready!\n");
        } else {
            System.out.println("Let's get started!\n");
        }

        // Question 1
        System.out.println("Q1) What is the capital of France?");
        System.out.println(" 1) Berlin");
        System.out.println(" 2) Madrid");
        System.out.println(" 3) Paris");
        System.out.print("> ");
        int answer1 = scanner.nextInt();
        
        if (answer1 == 3) {
            System.out.println("That's right!");
        } else {
            System.out.println("Sorry, the correct answer is Paris.");
            wrongAnswers++;
        }
        System.out.println();

        // Question 2
        System.out.println("Q2) Can a shark live on land?");
        System.out.println(" 1) Yes");
        System.out.println(" 2) No");
        System.out.print("> ");
        int answer2 = scanner.nextInt();
        
        if (answer2 == 2) {
            System.out.println("That's right!");
        } else {
            System.out.println("Incorrect, a shark cannot live on land.");
            wrongAnswers++;
        }
        System.out.println();

        // Question 3
        System.out.println("Q3) Is the sun a star?");
        System.out.println(" 1) Yes");
        System.out.println(" 2) No");
        System.out.print("> ");
        int answer3 = scanner.nextInt();
        
        if (answer3 == 1) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect, the sun is a star.");
            wrongAnswers++;
        }
        System.out.println();
        
        // Question 4
        System.out.println("Q4) Do you love Computer Science?");
        System.out.println(" 1) Yes, I love CS!");
        System.out.println(" 2) Yes, I love CS even more!");
        System.out.print("> ");
        int answer4 = scanner.nextInt();
        
        if (answer4 == 1) {
            System.out.println("Correct, CS is the best course at LP!");
        } else {
            System.out.println("Correct, CS is the best course at LP!");
        }
        System.out.println();
        
        // Question 4
        System.out.println("Q5) Which of these primitive data types are four bytes or less?");
        System.out.println(" 1) Byte");
        System.out.println(" 2) Short");
        System.out.println(" 3) Int");
        System.out.println(" 4) All of the above");
        System.out.print("> ");
        int answer5 = scanner.nextInt();
        
        if (answer5 == 4) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Sorry, those types are all four bytes or less.");
        }
        System.out.println();
        

        // Display final score
        System.out.println("You have completed the quix. You got " + wrongAnswers + " questions wrong.\n");
        
        //Quiz Results 
        System.out.println("Your answers for the quiz include:");
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);
        System.out.println(answer5);
    
        scanner.close();
    }
}
