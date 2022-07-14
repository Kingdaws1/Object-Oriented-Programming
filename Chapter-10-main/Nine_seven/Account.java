import java.util.Date;

class Account {

	int id = 0;
	double balance = 0;
	double annualInterestRate = 0;
	Date dateCreated = new Date();
	
	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	
	public int getId() {
		return(id);
	}
	
	public int setId(int newId) {
		id = newId;
		return(id);
	}
	
	public double getBalance() {
		return(balance);
	}
	
	public double setBalance(double newBalance) {
		balance = newBalance;
		return(balance);
	}
	
	public double getAnnualInterestRate() {
		return(annualInterestRate);
	}
	
	public double setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
		return(annualInterestRate);
	}
	
	public Date getDateCreated() {
		return(dateCreated);
	}
	
	public double getMonthlyInterestRate() {
		return(annualInterestRate / 12);
	}
	
	public double getMonthlyInterest() {
		return(balance * (getMonthlyInterestRate() / 100));
	}
	
	public void withdraw(double withdrawAmount) {
		balance = balance - withdrawAmount;
	}
	
	public void deposit(double depositAmount) {
		balance = balance + depositAmount;
	}
	
}
