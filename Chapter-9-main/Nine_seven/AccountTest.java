
public class AccountTest {

	public static void main(String[] args) {
		Account user1122 = new Account(1122, 20000);
		user1122.setAnnualInterestRate(4.5);
		user1122.withdraw(2500);
		user1122.deposit(3000);
		System.out.println("Balance: " + user1122.getBalance()
		+ "\nMonthly Interest: " + user1122.getMonthlyInterest()
		+ "\nDate of Account Creation: " + user1122.getDateCreated());

	}

}
