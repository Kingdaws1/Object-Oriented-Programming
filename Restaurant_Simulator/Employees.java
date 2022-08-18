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
	
	public int getDaysPerWeekWorked() {
		return(this.daysPerWeekWorked);
	}
	
	public double getPayPerDay() {
		return(this.payPerDay);
	}
	
	public double getPayCheck() {
		double payCheck = (this.getDaysPerWeekWorked() * 2) * this.getPayPerDay();
		return(payCheck);
	}
	
	public String getName() {
		return(this.name);
	}

}
