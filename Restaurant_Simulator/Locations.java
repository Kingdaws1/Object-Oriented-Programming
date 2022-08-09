
public abstract class Locations {
	
	double customers = 100;
	double multiplier = 1.0;
	int customersPerDay = (int)(customers * multiplier);
	int rent = 1200;
	String locationName = "";
	
	public Locations() {
		double customers = 100;
		double multiplier = 1.0;
		this.customersPerDay = (int)(customers * multiplier);
	}
	
	public Locations(double newCustomers, double newMultiplier) {
		this.customers = newCustomers;
		this.multiplier = newMultiplier;
		this.customersPerDay = (int)(customers * multiplier);
	}
	
	public int getCustomersPerDay() {
		return(customersPerDay);
	}
	
	public void setMultiplier(double addToMultiplier) {
		multiplier = this.multiplier + addToMultiplier;
	}
	
	public int getRent() {
		return(this.rent);
	}
	
	public double getCustomers() {
		return(this.customers);
	}
	
	public double getMultiplier() {
		return(this.multiplier);
	}
	
	public String getLocationName() {
		return(this.locationName);
	}

}
