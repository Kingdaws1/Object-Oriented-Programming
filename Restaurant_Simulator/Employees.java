import java.util.ArrayList;

public abstract class Employees {

	String name = "";
	double payPerDay = 0.0;
	int daysPerWeekWorked = 0;
	double addsToMultiplier = 0;
	ArrayList<String> workDays = new ArrayList<>();
	
	public Employees() {
		double payPerDay = 0.0;
		int daysPerWeekWorked = 0;
		double biWeeklyPayCheck = this.payPerDay * this.daysPerWeekWorked;
	}
	
	public void description() {
		
	}
	
	public double getAddsToMultiplier() {
		return(this.addsToMultiplier);
	}
	
	public void addWorkDays() {}

}
