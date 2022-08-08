import java.util.Scanner;

public class Restaurant_Simulator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		User newUser = new User();
		String name = input.next();
		newUser.setName(name);
		System.out.println("Welcome to the restaurant industry " + newUser.getName() + "!");
		boolean typeCheck = false;
		while (typeCheck == false) {
			System.out.println("Please enter an option for your restaurant genre: \n"
					+ "1. Italian \n"
					+ "2. Mexican \n"
					+ "3. American \n"
					+ "4. Chinese");
			int userType = input.nextInt();
			if (userType == 1) {
				newUser.setRestaurantType("Italian");
				typeCheck = true;
			}
			else if (userType == 2) {
				newUser.setRestaurantType("Mexican");
				typeCheck = true;
					}
			else if (userType == 3) {
				newUser.setRestaurantType("American");
				typeCheck = true;
			}
			else if (userType == 4) {
				newUser.setRestaurantType("Chinese");
				typeCheck = true;
			}
			else {
				System.out.println("Please input a valid number.");
			}
		}
		System.out.println("Aweseome! Your restaurant name will be " + newUser.getRestaurantName());
		boolean whileLoop = false;
		while (whileLoop == false) {
			System.out.println("Enter an option to learn about that location: \n"
					+ "1. Main Street Hole \n"
					+ "2. Outdoor Mall Corner \n"
					+ "3. Business Zone Stand Alone");
			int locationChoice = input.nextInt();
			if (locationChoice == 1) {
				Main_street_hole.getDescription();
			}
			else if (locationChoice == 2) {
				Outdoor_mall_corner.getDescription();
			}
			else if (locationChoice == 3) {
				Business_zone_stand_alone.getDescription();
			}
			
		}
		System.out.println("Enter an option for a bank loan: \n"
				+ "1. 10,000$ at 4.0% \n"
				+ "2. 20,000$ at 2.5% \n"
				+ "3. 30,000$ at 1.5%");
		System.out.println("Enter an option to learn about the employee candidate: \n"
				+ "1. Stan \n"
				+ "2. Bob"
				+ "3. Mary"
				+ "4. Jane");
		System.out.println("Enter the amount of supplies you would like to order \n"
				+ "for the first week: ");
		System.out.println("Enter the price would like to sell your items at: ");
		System.out.println("Enter an option for advertising: \n"
				+ "1. No advertising (0$) \n"
				+ "2. Billboard ad (500$) \n"
				+ "3. Radio ad (250$) \n"
				+ "4. TV ad (750$)");
		System.out.println("Your Restaurant Is Open!");
		DayOfWeek userDay = new DayOfWeek();
		System.out.println(userDay.getStringDay() + " Week: " + userDay.getWeek());
		System.out.println("It is 3pm, so far you have served (insert number of people) "
				+ "and earned (insert money made)");
		System.out.println("It is 10pm, today you served (insert number of people) "
				+ "and earned (insert money made)");
		System.out.println("Your budget now reads: ");
		System.out.println("Enter the amount of supplies you would like to order \n"
				+ "for the next week: ");
		System.out.println("Enter the price would like to sell your items at: ");
		System.out.println("Here is your employee evaluations for the week: ");
		System.out.println("Would you like to hire/fire employees? Enter yes or no: ");
		System.out.println("Enter an option for advertising option for the next week: \n"
				+ "1. No advertising (0$) \n"
				+ "2. Billboard ad (500$) \n"
				+ "3. Radio ad (250$) \n"
				+ "4. TV ad (750$)");

	}

}
