
public class Main_street_hole extends Locations {

	String locationName = "Main Street Hole";
	double customers = 150;
	int rent = 2000;
	
	public static void getDescription() {
		System.out.println("Main Street Hole: \n"
				+ "A small but very busy location right off of Main St. \n"
				+ "The rent runs at 2000$ every four weeks and similar businesses \n"
				+ "in that area average about 150 people served per day.");
	}

	public int getRent() {
		return(this.rent);
	}
	
	public double getCustomers() {
		return(this.customers);
	}
	
	public String getLocationName() {
		return(this.locationName);
	}
	
}
