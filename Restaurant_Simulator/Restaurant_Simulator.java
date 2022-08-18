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
		Employees john = new EmployeeJohn();
		john.addWorkDays();
		Employees bob = new EmployeeBob();
		bob.addWorkDays();
		Employees mary = new EmployeeMary();
		mary.addWorkDays();
		Employees jane = new EmployeeJane();
		jane.addWorkDays();
		while (employeeChoiceLoop == false) {
			System.out.println("Enter an option to learn about the employee candidate: \n"
					+ "1. John \n"
					+ "2. Bob \n"
					+ "3. Mary \n"
					+ "4. Jane");
			int employeeChoice = input.nextInt();
			if (employeeChoice == 1) {
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
		MenuItems newMenuItems = new MenuItems();
		newUser.setMenuItems(newMenuItems);
		System.out.println("Enter a name for your first of three menu items: ");
		String userMenuItem1Name = input.next();
		newUser.userMenuItems.setItem1Name(userMenuItem1Name);
		System.out.println("Enter a name for your second of three menu items: ");
		String userMenuItem2Name = input.next();
		newUser.userMenuItems.setItem2Name(userMenuItem2Name);
		System.out.println("Enter a name for your last of three menu items: ");
		String userMenuItem3Name = input.next();
		newUser.userMenuItems.setItem3Name(userMenuItem3Name);
		newUser.userMenuItems.setItem1IngredientsArray();
		newUser.userMenuItems.setItem2IngredientsArray();
		newUser.userMenuItems.setItem3IngredientsArray();
		System.out.print("Enter the total cost of " + newUser.userMenuItems.getItem1Name() + ": ");
		double userTotalCostOfItem1 = input.nextDouble();
		newUser.userMenuItems.setTotalCostOfItem1(userTotalCostOfItem1);
		System.out.print("Enter the total cost of " + newUser.userMenuItems.getItem2Name() + ": ");
		double userTotalCostOfItem2 = input.nextDouble();
		newUser.userMenuItems.setTotalCostOfItem2(userTotalCostOfItem2);
		System.out.print("Enter the total cost of " + newUser.userMenuItems.getItem3Name() + ": ");
		double userTotalCostOfItem3 = input.nextDouble();
		newUser.userMenuItems.setTotalCostOfItem3(userTotalCostOfItem3);
		System.out.println("Its time to set your sales prices for your items. Keep in \n"
				+ "mind that if your prices are too high you will get less sales \n"
				+ "and lower prices tend to increase sales. Typical food items \n"
				+ "cost around 12$ in your area.");
		System.out.println("Enter the sales price for " + newUser.userMenuItems.getItem1Name() + ": ");
		double userSalesPriceForItem1 = input.nextDouble();
		newUser.userMenuItems.setSalePriceOfItem1(userSalesPriceForItem1);
		System.out.println("Enter the sales price for " + newUser.userMenuItems.getItem2Name() + ": ");
		double userSalesPriceForItem2 = input.nextDouble();
		newUser.userMenuItems.setSalePriceOfItem2(userSalesPriceForItem2);
		System.out.println("Enter the sales price for " + newUser.userMenuItems.getItem3Name() + ": ");
		double userSalesPriceForItem3 = input.nextDouble();
		newUser.userMenuItems.setSalePriceOfItem3(userSalesPriceForItem3);
		System.out.println("Your Restaurant Is Open!");
		DayOfWeek userDay = new DayOfWeek();
		newUser.setUserDayOfWeek(userDay);
		newUser.setAdvertisingMultiplier();
		gameLoop(newUser);

	}
	
	public static void gameLoop(User existingUser) {
		Scanner input = new Scanner(System.in);
		String priceChange = "";
		while (existingUser.getTotalMoney() < 1000000) {
			existingUser.userDay.nextDay();
			if (existingUser.userDay.getDayOfWeek() % 7 == 0) {
				existingUser.setAdvertisingMultiplier();
			}
			if (existingUser.userDay.getDayOfWeek() % 14 == 0) {
				System.out.println("It is time to give your employees their paychecks.\n"
						+ existingUser.employeeList.get(0).getName() + " Earned: " + existingUser.employeeList.get(0).getPayCheck() + "\n"
				+ existingUser.employeeList.get(1).getName() + " Earned: " + existingUser.employeeList.get(1).getPayCheck());
				existingUser.addToTotalMoney(existingUser.employeeList.get(0).getPayCheck() + existingUser.employeeList.get(1).getPayCheck());
			}
			int totalItem1s = 0;
			int totalItem2s = 0;
			int totalItem3s = 0;
			int randomItemChoice = 0;
			for (int i = 0; i < existingUser.getCustomers(); i++) {
				randomItemChoice = (int) (Math.random() * 100);
				if (randomItemChoice < 34) {
					totalItem1s += 1;
				}
				if (randomItemChoice < 67) {
					totalItem2s += 1;
				}
				else {
					totalItem3s += 1;
				}
			}
			double dailySalesTotal = (existingUser.userMenuItems.salePriceOfItem1 * totalItem1s) 
					+ (existingUser.userMenuItems.salePriceOfItem2 * totalItem2s) 
					+ (existingUser.userMenuItems.salePriceOfItem3 * totalItem3s);
			double dailyExpenseTotal = (existingUser.userMenuItems.totalCostOfItem1 * totalItem1s) 
					+ (existingUser.userMenuItems.totalCostOfItem2 * totalItem2s) 
					+ (existingUser.userMenuItems.totalCostOfItem3 * totalItem3s);
			double dailyNetTotal = dailySalesTotal - dailyExpenseTotal;
			existingUser.addToTotalMoney(dailyNetTotal);
			System.out.println(existingUser.userDay.getStringDay() + " Week: " + existingUser.userDay.getWeek());
			System.out.println("It is 10pm, today you served " + existingUser.getCustomers()
					+ " and earned a net gain of " + dailyNetTotal);
			System.out.println("Your total capital now reads: \n"
					+ existingUser.getTotalMoney());
			System.out.println("Would you like to change your prices for the next day? \n"
					+ "Type 'yes' or 'no': ");
			priceChange = input.next();
			if (priceChange.equalsIgnoreCase("yes")) {
				System.out.println("Enter the sales price for " + existingUser.userMenuItems.getItem1Name() + ": ");
				double userSalesPriceForItem1 = input.nextDouble();
				existingUser.userMenuItems.setSalePriceOfItem1(userSalesPriceForItem1);
				System.out.println("Enter the sales price for " + existingUser.userMenuItems.getItem2Name() + ": ");
				double userSalesPriceForItem2 = input.nextDouble();
				existingUser.userMenuItems.setSalePriceOfItem2(userSalesPriceForItem2);
				System.out.println("Enter the sales price for " + existingUser.userMenuItems.getItem3Name() + ": ");
				double userSalesPriceForItem3 = input.nextDouble();
				existingUser.userMenuItems.setSalePriceOfItem3(userSalesPriceForItem3);
			}
		}
	
	}

}
