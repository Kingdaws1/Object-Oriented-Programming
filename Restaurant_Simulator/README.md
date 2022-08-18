# Restaurant Simulator

## Summary
This project is a simple game that takes input from users and lets them create a restaurant with personalized food items and prices. It also lets the user pick locations and avertising option. The simulator will add or subtract how many customers the restaurant recieves based on the choices the user makes. The goal is to net one-million dollars.

## Motivation
This seemed like the type of simulator that I could base future projects on, and would be a good teaching tool for school kids interested in business.

## How to Run
This is a text based game where you are asked to input Strings and doubles.

## Code Example
Here is an example of the typical type of code involved in the project.
```
	public void setUserDayOfWeek(DayOfWeek newUserDay) {
		this.userDay = newUserDay;
	}
	
	public void setAdvertisingWeek(int newAdvertisingWeek) {
		this.advertisingWeek = newAdvertisingWeek;
	}
	
	public void setAdvertisingMultiplier() {
		System.out.println("Enter an option for advertising for the week: \n"
				+ "1. No advertising (0$) \n"
				+ "2. Billboard ad (500$) \n"
				+ "3. Radio ad (250$) \n"
				+ "4. TV ad (750$)");
		Scanner input = new Scanner(System.in);
		int advertisingOption = input.nextInt();
		double newAdvertisingMultiplier = 0.0;
		if (advertisingOption == 1) {
			newAdvertisingMultiplier = 0.0;
			this.totalMoney += 0;
		}
		else if (advertisingOption == 2) {
			newAdvertisingMultiplier = 0.5;
			this.totalMoney += -500;
		}
		else if (advertisingOption == 3) {
			newAdvertisingMultiplier = 0.25;
			this.totalMoney += -250;
		}
		else {
			newAdvertisingMultiplier = 0.75;
			this.totalMoney += -750;
		}
		this.advertisingMultiplier = newAdvertisingMultiplier;
	}
```
