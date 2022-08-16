import java.util.ArrayList;

public class EmployeeMary extends Employees{

	String name = "Mary";
	double payPerDay = 150;
	int daysPerWeekWorked = 3;
	double addsToMultiplier = 0.2;
	
	ArrayList<String> workDays = new ArrayList<>();
	
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
		System.out.println("John: \n"
				+ "A freindly woman who has experience working in the restaurant feild. \n"
				+ "Pay per day: " + this.getPayPerDay() + " \n"
				+ "Works days: " + this.getWorkDays());
	}

}
