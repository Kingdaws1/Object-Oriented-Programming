import java.util.Scanner;
public class AccountTest {
	
	static int accountNumber = 0;
	
	public static int userIdInput(Account[] accountsArray) {
		Scanner input = new Scanner(System.in);
		int accountNumber = 0;
		System.out.print("Enter an id: ");
		int id = input.nextInt();
		boolean validId = false;
		while (validId == false) {
			for (int i = 0; i < accountsArray.length; i++) {
				int accountIdNumber = accountsArray[i].getId();
				if (id == accountIdNumber) {
					validId = true;
					accountNumber = i;
				}
			}
			if (validId == false) {
				System.out.print("That is not a valid id, enter an id:");
				id = input.nextInt();
			}
		}
		System.out.println(accountNumber);
		return(accountNumber);
	}
	
	public static void userOptions(Account[] accountsArray, int accountNumber) {
		Scanner input = new Scanner(System.in);
		int userInput = 0;
		while (userInput != 4) {
			System.out.print("Main Menu\n"
					+ "1: Check Balance\n"
					+ "2: Withdraw\n"
					+ "3: Deposit\n"
					+ "4: Exit\n"
					+ "Enter a number option: ");
			userInput = input.nextInt();
			if (userInput == 1) {
				System.out.println(accountsArray[accountNumber].getBalance());
			}
			else if (userInput == 2) {
				System.out.print("Enter an amount to withdraw: ");
				double withdrawAmount = input.nextDouble();
				accountsArray[accountNumber].withdraw(withdrawAmount);
			}
			else if (userInput == 3) {
				System.out.print("Enter an amount to deposit: ");
				double depositAmount = input.nextDouble();
				accountsArray[accountNumber].deposit(depositAmount);
			}
		}
	}
	
	public static void main(String[] args) {
		Account[] accountsArray = new Account[10];
		for (int i = 0; i < 10; i++) {
			accountsArray[i] = new Account(i, 100);
		}
		while(true) {
			accountNumber = userIdInput(accountsArray);
			userOptions(accountsArray, accountNumber);
		}
	}

}
