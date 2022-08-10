
public abstract class Employees {

	String name = "";
	double payPerDay = 0.0;
	int daysPerWeekWorked = 0;
	String[] workDays;
	double addsToMultiplier = 0;
	
	public Employees() {
		double payPerDay = 0.0;
		int daysPerWeekWorked = 0;
		double biWeeklyPayCheck = payPerDay * daysPerWeekWorked;
	}
	
	public void description() {
		
	}

}
