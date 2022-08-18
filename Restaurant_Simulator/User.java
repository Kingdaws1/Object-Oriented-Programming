import java.util.ArrayList;
import java.util.Scanner;

public class User {

	String name = "";
	String type = "";
	String restaurantName = "";
	Locations userLocation = null;
	int rent = 0;
	double multiplier = 1.0;
	int customers = 0;
	int customersPerDay = 0;
	ArrayList<Employees> employeeList = new ArrayList<>();
	MenuItems userMenuItems = null;
	DayOfWeek userDay = null;
	int advertisingWeek = 0;
	double advertisingMultiplier = 0;
	double totalMoney = 0.0;
	
	public User() {
		this.name = "";
	}
	
	public User(String newName) {
		this.name = newName;
	}
	
	public String getName() {
		return(this.name);
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public String getRestaurantName() {
		return(this.restaurantName = this.name + "'s " + this.type + " Restaurant");
	}
	
	public void setRestaurantType(String newType) {
		this.type = newType;
	}
	
	public void setLocation(Locations newUserLocation) {
		this.userLocation = newUserLocation;
	}
	
	public Locations getUserLocation() {
		return(this.userLocation);
	}
	
	public int getRent() {
		rent = this.userLocation.getRent();
		return(this.rent);
	}
	
	public int getCustomers() {
		customers = (int) (getMultiplier() * this.userLocation.getCustomers());
		return(customers);
	}
	
	public double getMultiplier() {
		multiplier = this.userLocation.getMultiplier() + this.getAdvertisingMultiplier()
		+ this.getEmployeeMultiplier() + this.userMenuItems.getSalePriceAddsToMultiplier()
		+ this.userDay.getDayOfWeekMultiplier();
		return(multiplier);
	}

	public String getLocationName() {
		return(this.userLocation.getLocationName());
	}
	
	public void addEmployee(Employees newEmployee) {
		this.employeeList.add(newEmployee);
	}
	
	public void setMenuItems(MenuItems newUserMenuItems) {
		this.userMenuItems = newUserMenuItems;
	}
	
	public void setUserDayOfWeek(DayOfWeek newUserDay) {
		this.userDay = newUserDay;
	}
	
	public void setAdvertisingWeek(int newAdvertisingWeek) {
		this.advertisingWeek = newAdvertisingWeek;
	}
	
	public void setAdvertisingMultiplier() {
		System.out.println("Enter an option for advertising for the week: \n"
				+ "1. No advertising (0$) \n"
				+ "2. Billboard ad (500$) \n"
				+ "3. Radio ad (250$) \n"
				+ "4. TV ad (750$)");
		Scanner input = new Scanner(System.in);
		int advertisingOption = input.nextInt();
		double newAdvertisingMultiplier = 0.0;
		if (advertisingOption == 1) {
			newAdvertisingMultiplier = 0.0;
			this.totalMoney += 0;
		}
		else if (advertisingOption == 2) {
			newAdvertisingMultiplier = 0.5;
			this.totalMoney += -500;
		}
		else if (advertisingOption == 3) {
			newAdvertisingMultiplier = 0.25;
			this.totalMoney += -250;
		}
		else {
			newAdvertisingMultiplier = 0.75;
			this.totalMoney += -750;
		}
		this.advertisingMultiplier = newAdvertisingMultiplier;
	}
	
	public double getAdvertisingMultiplier() {
		return(this.advertisingMultiplier);
	}
	
	public double getEmployeeMultiplier() {
		double employeeAdvertisingMultiplier = 0;
		Employees currentEmployee = null;
		for (int i = 0; i < this.employeeList.size(); i++) {
			currentEmployee = this.employeeList.get(i);
			if (currentEmployee.workDays.contains(this.userDay.stringDay)) {
				employeeAdvertisingMultiplier += currentEmployee.getAddsToMultiplier();
			}
		}
		return(employeeAdvertisingMultiplier);
	}
	public void addToTotalMoney(double newAddToTotalMoney) {
		this.totalMoney += newAddToTotalMoney;
	}
	
	public double getTotalMoney() {
		return(this.totalMoney);
	}

}
