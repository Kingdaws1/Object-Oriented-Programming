
public class Business_zone_stand_alone extends Locations {

	String locationName = "Business Zone Stand Alone";
	double customers = 75;
	int rent = 1000;
	
	public static void getDescription() {
		System.out.println("Business Zone Stand Alone: \n"
				+ "A small space close to several very large companies. \n"
				+ "The rent runs at 1000$ every four weeks and similar businesses \n"
				+ "in that area average about 75 people served per day.");
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
