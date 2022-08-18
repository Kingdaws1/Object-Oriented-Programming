
public class EmployeeBob extends Employees{

	String name = "Bob";
	double payPerDay = 120;
	int daysPerWeekWorked = 3;
	double addsToMultiplier = 0.0;
	
	public void addWorkDays() {
		this.workDays.add("Friday");
		this.workDays.add("Saturday");
		this.workDays.add("Sunday");
	}
	
	public String getWorkDays() {
		String workDaysString = "";
		for (int i = 0; i < workDays.size(); i ++) {
			workDaysString += workDays.get(i);
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
		System.out.println("Bob: \n"
				+ "A good worker with no experience in the restaurant industry. \n"
				+ "Pay per day: " + this.getPayPerDay() + " \n"
				+ "Works days: " + this.getWorkDays());
	}

}
