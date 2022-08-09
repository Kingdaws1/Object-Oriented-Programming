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
		boolean locationLoop = false;
		while (locationLoop == false) {
			System.out.println("Enter an option to learn about that location: \n"
					+ "1. Main Street Hole \n"
					+ "2. Outdoor Mall Corner \n"
					+ "3. Business Zone Stand Alone");
			int locationChoice = input.nextInt();
			if (locationChoice == 1) {
				Main_street_hole.getDescription();
				System.out.println("Choose this location? Type 'yes' or 'no': ");
				String yesOrNoInput = input.next();
				if (yesOrNoInput.equalsIgnoreCase("yes")) {
					Locations userLocation = new Main_street_hole();
					newUser.setLocation(userLocation);
					locationLoop = true;
				}
			}
			else if (locationChoice == 2) {
				Outdoor_mall_corner.getDescription();
				System.out.println("Choose this location? Type 'yes' or 'no': ");
				String yesOrNoInput = input.next();
				if (yesOrNoInput.equalsIgnoreCase("yes")) {
					Locations userLocation = new Outdoor_mall_corner();
					newUser.setLocation(userLocation);
					locationLoop = true;
				}
			}
			else if (locationChoice == 3) {
				Business_zone_stand_alone.getDescription();
				System.out.println("Choose this location? Type 'yes' or 'no': ");
				String yesOrNoInput = input.next();
				if (yesOrNoInput.equalsIgnoreCase("yes")) {
					Locations userLocation = new Business_zone_stand_alone();
					newUser.setLocation(userLocation);
					locationLoop = true;
				}
			}
		}
		boolean employeeChoiceLoop = false;
		boolean weekdaysCovered = false;
		boolean weekendsCovered = false;
		while (employeeChoiceLoop == false) {
			System.out.println("Enter an option to learn about the employee candidate: \n"
					+ "1. John \n"
					+ "2. Bob \n"
					+ "3. Mary \n"
					+ "4. Jane");
			int employeeChoice = input.nextInt();
			if (employeeChoice == 1) {
				Employees john = new EmployeeJohn();
				if (newUser.employeeList.contains(john)) {
					System.out.println("You have already hired John.");
				}
				else {
				john.description();
				System.out.println("Hire this employee? \n"
						+ "Type yes or no: ");
				String employeeYesOrNo = input.next();
				if (employeeYesOrNo.equalsIgnoreCase("yes")) {
					newUser.addEmployee(john);
					weekdaysCovered = true;
				}
				}
			}
			if (employeeChoice == 2) {
				Employees bob = new EmployeeBob();
				if (newUser.employeeList.contains(bob)) {
					System.out.println("You have already hired Bob.");
				}
				else {
				bob.description();
				System.out.println("Hire this employee? \n"
						+ "Type yes or no: ");
				String employeeYesOrNo = input.next();
				if (employeeYesOrNo.equalsIgnoreCase("yes")) {
					newUser.addEmployee(bob);
					weekendsCovered = true;
				}
				}
			}
			if (employeeChoice == 3) {
				Employees mary = new EmployeeMary();
				if (newUser.employeeList.contains(mary)) {
					System.out.println("You have already hired Mary.");
				}
				else {
				mary.description();
				System.out.println("Hire this employee? \n"
						+ "Type yes or no: ");
				String employeeYesOrNo = input.next();
				if (employeeYesOrNo.equalsIgnoreCase("yes")) {
					newUser.addEmployee(mary);
					weekendsCovered = true;
				}
				}
			}
			if (employeeChoice == 4) {
				Employees jane = new EmployeeJane();
				if (newUser.employeeList.contains(jane)) {
					System.out.println("You have already hired Jane.");
				}
				else {
				jane.description();
				System.out.println("Hire this employee? \n"
						+ "Type yes or no: ");
				String employeeYesOrNo = input.next();
				if (employeeYesOrNo.equalsIgnoreCase("yes")) {
					newUser.addEmployee(jane);
					weekdaysCovered = true;
				}
				}
			}
			if ((weekdaysCovered == true) && (weekendsCovered ==true)) {
				employeeChoiceLoop = true;
			}
			else {
				System.out.println("Before you can move on you need to make sure \n"
						+ "all of the days of the week will be covered.");
			}
		}
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
