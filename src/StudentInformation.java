import java.util.Scanner;

public class StudentInformation {

	final static String[] NAMES = { "Amy Tan", "Kim Kardashian", "Carrie Fisher", "Angela Lansbury", "Eleanor Roosevelt",
			"Fannie Brice", "Debbie Reynolds", "Elizabeth Taylor", "Shirley MacLaine", "Kim Driscoll",
			"Peter Parker", "Tony Stark", "Stan Lee", "Ayn Rand", "Rand Paul", "Al Franken", "Mike Huckabee",
			"Mary Jones", "Tim Smith", "Jimmy Johnson" };
	final static String[] HOMETOWNS = { "Dayton, OH", "Los Angeles, CA", "Portland, ME", "Boston, MA", "Seattle, WA",
			"Chicago, IL", "New York, NY", "Albequerque, NM", "Atlanta, GA", "Dayton, OH", "Los Angeles, CA",
			"Portland, ME", "Boston, MA", "Seattle, WA", "Chicago, IL", "New York, NY", "Albequerque, NM",
			"Atlanta, GA", "Dayton, OH", "Los Angeles, CA", "Portland, ME", "Boston, MA", "Seattle, WA",
			"Chicago, IL", "Dayton, OH", "Los Angeles, CA" };
	final static String[] FAVORITEFOODS = { "Pad Thai", "Mac & Cheese", "Chicken Soup", "Beef Tartare", "Grilled Cheese",
			"PopTarts", "Ramen", "Sauerkraut", "Fruit Snacks", "Sandwiches", "Pad Thai", "Mac & Cheese",
			"Chicken Soup", "Beef Tartare", "Grilled Cheese", "PopTarts", "Ramen", "Sauerkraut", "Fruit Snacks",
			"Sandwiches" };
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final String PROMPT_ONE = "(enter a number 1-20): ";
		final String PROMPT_TWO = "(enter \"hometown\" or \"favorite food\"): ";
		final String PROMPT_THREE = "Would you like to know more? (enter \"yes\" or \"no\"): ";

		

		System.out.print("Welcome to our Java class. ");

		String cont = "y";

		while (cont.equalsIgnoreCase("y")) {

			System.out.print("Which student would you like to learn more about? ");
			
			int studentId = Validator.getInt(scan, PROMPT_ONE, 1, 20);

			System.out.printf("%nStudent %s is %s. What would you like to know about %s?", studentId, NAMES[studentId],
					NAMES[studentId].split(" ")[0]);
			
			String infoTopic = Validator.getString(scan, PROMPT_TWO);

			if (infoTopic.equalsIgnoreCase("hometown")) {

				System.out.printf("%n%s is from %s.", NAMES[studentId].split(" ")[0], HOMETOWNS[studentId]);

			} else if (infoTopic.equalsIgnoreCase("favorite food")) {

				System.out.printf("%n%s will tell you their favorite food is %s", names[studentId].split(" ")[0],
						favoriteFoods[studentId]);

			} else {

				System.out.print("\nThat data does not exist. Please try again. ");

			}

		}
	}

	public static boolean isValidInfoTopic(String topic) {
		if (topic.equalsIgnoreCase(anotherString))
	}
	
	public static String printHometown()

}
