package yourworkhere;

import java.awt.List;

public class Reporter {
	private Ledger ledger = new Ledger();
	//ledger: Ledger
	
	public int getNumAccounts() {
		System.out.println("getNumAccounts method in Reporter.java");
		// getNumAccounts(): int - returns the current total number of 
		// accounts within the ledger
		return 0;
	}
	
	public List getAccountsWithMinimum(double minBalAll){
		System.out.println("getAccountsWithMinimum method in Reporter.java");
		System.out.println(minBalAll);
		// getAccountsWithMinimum(double): List<Account> - 
		// returns an List of Accounts that have at least the 
		// specified balance (you should not use the minBalance 
		// field for SavingsAccounts)
		return null;
	}

	

	public void printAllAccounts() {
		System.out.println("printAllAccounts method in Reporter.java");
		
		// printAllAccounts(): void - loops through all accounts within 
		// the Ledger and prints the details of each account. 
		// It is useful if you’ve already overridden the toString() 
		// method for both CheckingAccount and SavingsAccount
	}

	

	public int getNumAccountsByType(String num) {
		System.out.println("getNumAccountsByType method in Reporter.java");
		// getNumAccountsByType(String): int - returns the number 
		// of accounts 
		// according to the specified type. The valid types are 
		// “checking” and “savings”.
		return 0;
	}
}
