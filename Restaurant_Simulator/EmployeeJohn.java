import java.util.ArrayList;

public class EmployeeJohn extends Employees{

	String name = "John";
	double payPerDay = 150;
	int daysPerWeekWorked = 4;
	double addsToMultiplier = 0.2;
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
				+ "A freindly guy who has experience working in the restaurant feild. \n"
				+ "Pay per day: " + this.getPayPerDay() + " \n"
				+ "Works days: " + this.getWorkDays());
	}

}
