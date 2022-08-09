
public class EmployeeJohn extends Employees{

	String name = "John";
	double payPerDay = 150;
	int daysPerWeekWorked = 4;
	String[] workDays = {
			"Monday", "Tuesday", "Wednesday", "Thursday"
	};
	double addsToMultiplier = 0.2;
	
	public String getWorkDays() {
		String workDaysString = "";
		for (int i = 0; i < workDays.length; i ++) {
			workDaysString += workDays[i];
			workDaysString += " ";
		}
		return(workDaysString);
	}
	
	public String getName() {
		return(this.name);
	}
	
	public double getPayPerDay() {
		return(this.payPerDay);
	}
	
	public void gettingARaise() {
		this.payPerDay += 10;
	}
	
	public void description() {
		System.out.println("John: \n"
				+ "A freindly guy who has experience working in the restaurant feild. \n"
				+ "Pay per day: " + this.getPayPerDay() + " \n"
				+ "Works days: " + this.getWorkDays());
	}

}
