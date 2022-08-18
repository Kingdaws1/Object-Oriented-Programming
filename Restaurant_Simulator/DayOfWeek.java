
public class DayOfWeek {

	int day = 0;
	int week = 0;
	String stringDay = "Monday";
	
	public DayOfWeek() {
		int day = 1;
		int week = 1;
	}
	
	public int getDayOfWeek() {
		return(this.day);
	}
	
	public void setDayOfWeek(int newDay) {
		this.day = newDay;
	}
	
	public void startOfNewDay() {
		this.day += 1;
	}
	
	public String getStringDay() {
		if (this.day % 7 == 1) {
			this.stringDay = "Monday";
		}
		if (this.day % 7 == 2) {
			this.stringDay = "Tuesday";
		}
		if (this.day % 7 == 3) {
			this.stringDay = "Wednesday";
		}
		if (this.day % 7 == 4) {
			this.stringDay = "Thursday";
		}
		if (this.day % 7 == 5) {
			this.stringDay = "Friday";
		}
		if (this.day % 7 == 6) {
			this.stringDay = "Saturday";
		}
		if (this.day % 7 == 0) {
			this.stringDay = "Sunday";
		}
		return(this.stringDay);
	}
	
	public int getWeek() {
		this.week = (this.day / 7) + 1;
		return(week);
	}
	
	public void nextDay() {
		this.day += 1;
	}
	
	public double getDayOfWeekMultiplier() {
		double dayOfWeekMultiplier = 0.0;
		if (this.getStringDay() == "Monday") {
			dayOfWeekMultiplier = -0.3;
		}
		if (this.getStringDay() == "Tuesday") {
			dayOfWeekMultiplier = -0.3;
		}
		if (this.getStringDay() == "Wednesday") {
			dayOfWeekMultiplier = -0.3;
		}
		if (this.getStringDay() == "Thursday") {
			dayOfWeekMultiplier = -0.3;
		}
		if (this.getStringDay() == "Friday") {
			dayOfWeekMultiplier = 0.0;
		}
		if (this.getStringDay() == "Saturday") {
			dayOfWeekMultiplier = 0.0;
		}
		if (this.getStringDay() == "Sunday") {
			dayOfWeekMultiplier = 0.0;
		}
		return(dayOfWeekMultiplier);
	}

}
