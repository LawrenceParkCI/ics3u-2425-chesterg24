package unit2;
/**
 * Description: Two dice roll for user and computer 
 * Date: 2024/11/22
 * @author: Gavin Chester
 */
public class DoubleDiceContest {

/*
 * Write code that simulates rolling two dice for the user and then two dice for the computer. 
 * The program should output the total of the two dice for both the user and the computer, 
 * then announce who won: the computer, the user, or say it was a tie.
 */

	public static void main(String[] args) {


		//Variables
		int userdie1, userdie2, computerdie1, computerdie2;

		//User dice roll
		System.out.println("Roll a die");
		userdie1 = (int)(Math.random()*6)+1;
		System.out.println(userdie1);
		System.out.println("Roll another die.");
		userdie2 = (int)(Math.random()*6)+1;
		System.out.println(userdie2);
		System.out.println("Human score is " + (userdie1+userdie2));

		//Computer dice roll
		System.out.println("");
		System.out.println("Computer roll");
		computerdie1 = (int)(Math.random()*6)+1;
		System.out.println(computerdie1);
		System.out.println("Roll another die.");
		computerdie2 = (int)(Math.random()*6)+1;
		System.out.println(computerdie2);
		System.out.println("Computer score is " + (computerdie1+computerdie2));

		System.out.println(2);
		if (userdie1+userdie2<computerdie1+computerdie2) {
		System.out.println("You win!"); 
	}
	else {
	System.out.println("Computer Wins!");
	}
}
}


