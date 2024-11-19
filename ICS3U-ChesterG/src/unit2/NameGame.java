package unit2;

import java.util.Scanner;

/**
 * Description:NameGame
 * Date: 2024/11/19
 * @author: Gavin Chester
 */
public class NameGame {

 public static void main(String[] args) {
  /*
   * The application should prompt the user for their name. 
   * 70% of the time the program should output that the user's name is their favourite, 
   * and 30% of the time says they hate that name.
   * */
	 
	 Scanner sc = new Scanner (System.in);
	 
		//Variables
		String name1;
		int random = (int)(Math.random() * 10);
		
		//Name
		System.out.println("What is your name?");
		name1 = sc.nextLine();



		if(random < 7) {
			System.out.println( name1 + " is my favourite name!");
		}
		else {
			System.out.println(name1 + ", I hate that name!");
		}

		sc.close();
	}
 }

