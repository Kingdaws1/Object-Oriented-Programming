
public class CheckingAccount extends Account{
	
	double overdraftLimit = -150;
	
	CheckingAccount(){}
	
	CheckingAccount(int newId, double newBalance){
		balance = newBalance;
		id = newId;
	}

	public void withdraw(double withdrawAmount) {
		if (balance - withdrawAmount > overdraftLimit) {
			balance = balance - withdrawAmount;
		}
		else {
			System.out.println("Error! Cannot withraw past overdraft limit!");
		}
	}

}
