
public class EmployeeJane extends Employees{

	String name = "Jane";
	double payPerDay = 120;
	int daysPerWeekWorked = 4;
	String[] workDays = {
			"Monday", "Tuesday", "Wednesday", "Thursday"
	};
	double addsToMultiplier = 0.0;
	
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
				+ "A good worker with no experience in the restaurant industry. \n"
				+ "Pay per day: " + this.getPayPerDay() + " \n"
				+ "Works days: " + this.getWorkDays());
	}

}
