
public class DayOfWeek {

	int day = 1;
	int week = 0;
	String stringDay = "Monday";
	
	public DayOfWeek() {
		int day = 1;
		int week = 0;
	}
	
	public int getDayOfWeek() {
		return(day);
	}
	
	public void setDayOfWeek(int newDay) {
		this.day = newDay;
	}
	
	public void startOfNewDay() {
		this.day += 1;
	}
	
	public String getStringDay() {
		if (day % 7 == 1) {
			stringDay = "Monday";
		}
		if (day % 7 == 2) {
			stringDay = "Tuesday";
		}
		if (day % 7 == 3) {
			stringDay = "Wednesday";
		}
		if (day % 7 == 4) {
			stringDay = "Thursday";
		}
		if (day % 7 == 5) {
			stringDay = "Friday";
		}
		if (day % 7 == 6) {
			stringDay = "Saturday";
		}
		if (day % 7 == 0) {
			stringDay = "Sunday";
		}
		return(stringDay);
	}
	
	public int getWeek() {
		week = day / 7;
		return(week);
	}

}
