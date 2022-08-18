import java.util.ArrayList;

public class EmployeeJane extends Employees{

	String name = "Jane";
	double payPerDay = 120;
	int daysPerWeekWorked = 4;
	double addsToMultiplier = 0.0;
ArrayList<String> workDays = new ArrayList<>();
	
	public void addWorkDays() {
		this.workDays.add("Monday");
		this.workDays.add("Tuesday");
		this.workDays.add("Wednesday");
		this.workDays.add("Thursday");
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
		System.out.println("John: \n"
				+ "A good worker with no experience in the restaurant industry. \n"
				+ "Pay per day: " + this.getPayPerDay() + " \n"
				+ "Works days: " + this.getWorkDays());
	}

}
