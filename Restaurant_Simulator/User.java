import java.util.ArrayList;

public class User {

	String name = "";
	String type = "";
	String restaurantName = "";
	Locations userLocation = null;
	int rent = 0;
	double multiplier = 1.0;
	double customers = 0;
	int customersPerDay = 0;
	ArrayList<Employees> employeeList = new ArrayList<>();
	
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
	
	public double getCustomers() {
		customers = this.userLocation.getCustomers();
		return(customers);
	}
	
	public double getMultiplier() {
		multiplier = this.userLocation.getMultiplier();
		return(multiplier);
	}
	
	public  int getCustomersPerDay() {
		customersPerDay = (int) (this.getCustomers() * this.getMultiplier());
		return(customersPerDay);
	}

	public String getLocationName() {
		return(this.userLocation.getLocationName());
	}
	
	public void addEmployee(Employees newEmployee) {
		this.employeeList.add(newEmployee);
	}

}
