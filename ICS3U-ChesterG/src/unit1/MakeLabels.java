package unit1;

import java.util.Scanner;

public class MakeLabels {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String subject; 
		String name;
		
		System.out.println("Type in the subject and press <Enter>");
		name = sc.next();
		
		System.out.println("Type in the subject and press <Enter>");
		subject = sc.next();
		
		
		System.out.println();
		System.out.println("***************************");
		System.out.println(name);
		System.out.println(subject);
		System.out.println("***************************");
		sc.close();

	}

}
