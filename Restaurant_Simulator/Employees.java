import java.util.ArrayList;

public class Employees {

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
	
	public void addWeekDays() {
		this.workDays.add("Monday");
		this.workDays.add("Tuesday");
		this.workDays.add("Wednesday");
		this.workDays.add("Thursday");
	}
	
	public void addWeekendDays() {
		this.workDays.add("Friday");
		this.workDays.add("Saturday");
		this.workDays.add("Sunday");
	}
	
	public void setName(String employeeName) {
		this.name = employeeName;
	}
	
	public void setPayPerDay(double employeePay) {
		this.payPerDay = employeePay;
	}
	
	public void setDaysPerWeekWorked(int employeeDays) {
		this.daysPerWeekWorked = employeeDays;
	}
	
	public void setAddsToMultiplier(double employeeMultiplier) {
		this.addsToMultiplier = employeeMultiplier;
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
	
	public String getWorkDays() {
		String workDaysString = "";
		for (int i = 0; i < workDays.size(); i ++) {
			workDaysString += workDays.get(i);
			workDaysString += " ";
		}
		return(workDaysString);
	}
	
	public void descriptionBob() {
		System.out.println("Bob: \n"
				+ "A good worker with no experience in the restaurant industry. \n"
				+ "Pay per day: " + this.getPayPerDay() + " \n"
				+ "Works days: " + this.getWorkDays());
	}
	
	public void descriptionJane() {
		System.out.println("Jane: \n"
				+ "A good worker with no experience in the restaurant industry. \n"
				+ "Pay per day: " + this.getPayPerDay() + " \n"
				+ "Works days: " + this.getWorkDays());
	}
	
	public void descriptionJohn() {
		System.out.println("John: \n"
				+ "A freindly guy who has experience working in the restaurant feild. \n"
				+ "Pay per day: " + this.getPayPerDay() + " \n"
				+ "Works days: " + this.getWorkDays());
	}
	
	public void descriptionMary() {
		System.out.println("Mary: \n"
				+ "A freindly woman who has experience working in the restaurant feild. \n"
				+ "Pay per day: " + this.getPayPerDay() + " \n"
				+ "Works days: " + this.getWorkDays());
	}

}
