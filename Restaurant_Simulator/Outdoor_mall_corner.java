
public class Outdoor_mall_corner extends Locations {

	String locationName = "Outdoor Mall Corner";
	double customers = 125;
	int rent = 1500;
	
	public static void getDescription() {
		System.out.println("Outdoor Mall Corner: \n"
				+ "A medium sized space that gets busy later in the afternoons. \n"
				+ "The rent runs at 1500$ every four weeks and similar businesses \n"
				+ "in that area average about 125 people served per day.");
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
