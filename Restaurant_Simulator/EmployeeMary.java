
public class EmployeeMary extends Employees{

	String name = "Mary";
	double payPerDay = 150;
	int daysPerWeekWorked = 3;
	String[] workDays = {
			"Friday", "Saturday", "Sunday"
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
				+ "A freindly woman who has experience working in the restaurant feild. \n"
				+ "Pay per day: " + this.getPayPerDay() + " \n"
				+ "Works days: " + this.getWorkDays());
	}

}
