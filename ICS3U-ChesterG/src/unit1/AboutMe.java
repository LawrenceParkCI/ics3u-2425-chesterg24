package unit1;
/**
 * Date: 09/20/24
 * Description: This is all about me and my information (Name, Grade, School and Teacher)
 * @author Gavin Chester
 */
public class AboutMe {
	/**
	 * Entry point to the program
	 * @param args unused 
	 */
	
	public static void main(String[] args) {
		// This prints my information to the system console
		System.out.println("Gavin Chester");
		System.out.println("Grade 11");
		System.out.println("Ms. Kemp");
		System.out.println("Lawrence Park CI");
		System.out.println("GO PANTHERS!");
		
		System.out.format("\nMy Late Start Schedule:");
		System.out.format("\n");
		System.out.format("\n Day: \t\t%-10s | %-12s| %-10s | %-10s", " Period 1", "Period 2", "Period 3", "Period 4");
		System.out.format("\n -----------------------------------------------------------------");
		System.out.format("\n Monday \t9:00-10:15 | 10:20-11:40 | 12:40-1:55 | 2:00-3:15");
		System.out.format("\n Teacher: \t%-10s | %-12s| %-10s | %-10s",  "C.Kamp", "B.Goldkind", "A. Solakis", "B.Goldkind");
		System.out.format("\n -----------------------------------------------------------------");
		System.out.format("\n Tuesday \t9:00-10:15 | 10:20-11:40 | 12:40-1:55 | 2:00-3:15");
		System.out.format("\n Teacher: \t%-10s | %-12s| %-10s | %-10s",  "B.Goldkind", "C.Kemp", "B.Goldkind", "A. Solakis");
		System.out.format("\n -----------------------------------------------------------------");
		System.out.format("\n Wednesday \t9:55-10:55 | 11:00-11:59 | 1:00-2:05  | 2:10-3:15");
		System.out.format("\n Teacher: \t%-10s | %-12s| %-10s | %-10s",  "C.Kamp", "B.Goldkind", "A. Solakis", "B.Goldkind");
		System.out.format("\n -----------------------------------------------------------------");
		System.out.format("\n Thursday \t9:00-10:15 | 10:20-11:40 | 12:40-1:55 | 2:00-3:15");
		System.out.format("\n Teacher: \t%-10s | %-12s| %-10s | %-10s",  "B.Goldkind", "C.Kemp", "B.Goldkind", "A. Solakis");
		System.out.format("\n -----------------------------------------------------------------");
		System.out.format("\n Friday \t9:00-10:15 | 10:20-11:40 | 12:40-1:55 | 2:00-3:15");
		System.out.format("\n Teacher: \t%-10s | %-12s| %-10s | %-10s",  "C.Kamp", "B.Goldkind", "A. Solakis", "B.Goldkind");
	}

}
