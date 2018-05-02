import java.util.Scanner;

// Tim Pieniazek 05/01/2018
// GCB Java Lab 8

public class StudentInformation {
	
	// final static constants for the arrays of student information
	//**Thank you Vicki Rush for providing these** :)
	final static String[] NAMES = { "Amy Tan", "Kim Kardashian", "Carrie Fisher", "Angela Lansbury",
			"Eleanor Roosevelt", "Fannie Brice", "Debbie Reynolds", "Elizabeth Taylor", "Shirley MacLaine",
			"Kim Driscoll", "Peter Parker", "Tony Stark", "Stan Lee", "Ayn Rand", "Rand Paul", "Al Franken",
			"Mike Huckabee", "Mary Jones", "Tim Smith", "Jimmy Johnson" };
	final static String[] HOMETOWNS = { "Dayton, OH", "Los Angeles, CA", "Portland, ME", "Boston, MA", "Seattle, WA",
			"Chicago, IL", "New York, NY", "Albequerque, NM", "Atlanta, GA", "Dayton, OH", "Los Angeles, CA",
			"Portland, ME", "Boston, MA", "Seattle, WA", "Chicago, IL", "New York, NY", "Albequerque, NM",
			"Atlanta, GA", "Dayton, OH", "Los Angeles, CA", "Portland, ME", "Boston, MA", "Seattle, WA", "Chicago, IL",
			"Dayton, OH", "Los Angeles, CA" };
	final static String[] FAVORITEFOODS = { "Pad Thai", "Mac & Cheese", "Chicken Soup", "Beef Tartare",
			"Grilled Cheese", "PopTarts", "Ramen", "Sauerkraut", "Fruit Snacks", "Sandwiches", "Pad Thai",
			"Mac & Cheese", "Chicken Soup", "Beef Tartare", "Grilled Cheese", "PopTarts", "Ramen", "Sauerkraut",
			"Fruit Snacks", "Sandwiches" };

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// final constants for prompts for use in Validator class methods
		final String PROMPT_ONE = "(enter a number 1-20): ";
		final String PROMPT_TWO = "(enter \"hometown\" or \"favorite food\"): ";
		final String PROMPT_THREE = "Would you like to know more? ";
		final String PROMPT_FOUR = "(enter \"yes\" or \"no\"): ";
		
		// final constants for multi-use statements and strings
		final String HOME_STATEMENT = "%n%s is from %s. ";
		final String FOOD_STATEMENT = "%n%s will tell you their favorite food is %s. ";
		final String HOMETOWN = "hometown";
		final String FAVORITE_FOOD = "favorite food";
		final String YES = "yes";

		System.out.print("Welcome to our Java class. ");

		// outer while loop conditional for exiting out of program
		String cont = YES;

		while (cont.equalsIgnoreCase(YES)) {

			System.out.print("Which student would you like to learn more about? ");

			// calls Validator.getInt to choose a student from NAMES[] with range of 1 - 20
			int studentId = Validator.getInt(scan, PROMPT_ONE, 1, 20);
			System.out.printf("%nStudent %s is %s. What would you like to know about %s? ",
					studentId, NAMES[studentId], NAMES[studentId].split(" ")[0]);

			// calls Validator.getString to prompt for information topic (hometown or favorite food)
			String infoTopic = Validator.getString(scan, PROMPT_TWO, HOMETOWN, FAVORITE_FOOD);

			if (infoTopic.equalsIgnoreCase(HOMETOWN)) {
				// if "hometown" is chosen, prints the home statement
				System.out.printf(HOME_STATEMENT, NAMES[studentId].split(" ")[0], HOMETOWNS[studentId]);
				
				// if user chooses to continue, print the other food statement
				if (Validator.getYesOrNo(scan, PROMPT_THREE + PROMPT_FOUR).equalsIgnoreCase(YES)) {
					System.out.printf(FOOD_STATEMENT, NAMES[studentId].split(" ")[0], FAVORITEFOODS[studentId]);
				}
				

			} else {
				// otherwise "favorite food" must be chosen, prints the food statement
				System.out.printf(FOOD_STATEMENT, NAMES[studentId].split(" ")[0], FAVORITEFOODS[studentId]);
				
				// if user chooses to continue, print the other home statement
				if (Validator.getYesOrNo(scan, PROMPT_THREE + PROMPT_FOUR).equalsIgnoreCase(YES)) {
					System.out.printf(HOME_STATEMENT, NAMES[studentId].split(" ")[0], HOMETOWNS[studentId]);
				}				

			}
			
			// ends the outer loop to asking user to start learning about another student
			System.out.print("\nWould you like to learn about another student? ");
			
			cont = Validator.getYesOrNo(scan, PROMPT_FOUR);
			System.out.println();
		}
		
		// end of program
		System.out.println("\nThanks! Goodbye :)");
		
	}
	
}
