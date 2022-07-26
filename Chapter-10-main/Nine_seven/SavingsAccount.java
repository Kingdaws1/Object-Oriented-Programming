
public class SavingsAccount extends Account{

	double overdraftLimit = 0;
	
	SavingsAccount(){}
	
	SavingsAccount(int newId, double newBalance){
		balance = newBalance;
		id = newId;
	}

	public void withdraw(double withdrawAmount) {
		if (balance - withdrawAmount > overdraftLimit) {
			balance = balance - withdrawAmount;
		}
		else {
			System.out.println("Error! This account cannot be overdrawn!");
		}
	}

}
