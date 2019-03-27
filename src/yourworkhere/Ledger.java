package yourworkhere;

import java.util.HashMap;
import java.util.Map;

public class Ledger {
	Map<String, Account> accounts = new HashMap<String, Account>();
	// accounts: Map<String, Account>
	// The field accounts is a Map<String, Account> which you’ll 
	// use in the methods to add an Account, retrieve an Account 
	// and other such operations.
	
	private static final Ledger instance = new Ledger();
	// instance: Ledger(static)
	// The field instance is a static reference to the class itself. 
	// This will help us to make sure we only ever create one instance 
	// of the Ledger class so that we do not have duplicate instances 
	// of the accounts that we’re keeping tracking of.
	
	protected Ledger(){}
	
	public boolean store(){
		// store() - adds a new Account to the accounts Map. 
		// The key is the account’s ID. 
		// This method should return a Boolean object that is 
		// "true" when the Account added to the ledger is being 
		// added for the first time, "false" if it is being updated. 
		// Check the documentation for the Map.put() method for reference.
		// store(Account): Boolean
		
		
		System.out.println("store method in Ledger.java");
		return true;
	}
	
	public Account retrive() {
		//retrieve() - returns a single Account with the specified 
		// accountID from the accounts Map. If none is found, return null.
		//retrieve(String): Account
		return null;
	}
	
	public Account createAccount(String type, String firstName, String accountID) {
		// createAccount() - this method creates and returns a new 
		// Account object with the specified parameters (type, 
		// firstName, lastName). Calling this method should store 
		// the new account within the accounts Map. Please note 
		// the first parameter passed into this method determines 
		// which account type (CheckingAccount vs. SavingsAccount) 
		// to create. The values should either be “checking” or “savings”.
		// createAccount(String, String, String): Account
		System.out.println("TYPE: " + type);
		System.out.println("firstname: " + firstName);
		System.out.println("lasname: " + accountID);
		
		if (type == "checking") {
			System.out.println("createAccount checking method in Ledger Class");
			
			Account checkingAccount = new CheckingAccount(accountID, firstName, type);
			accounts.put(type, checkingAccount);
			
			return checkingAccount;
			
		} else if (type == "savings"){
			System.out.println("createAccount savings method in Ledger Class");
			
			Account savingsAccount = new SavingsAccount();
			accounts.put(type, savingsAccount);
			
			return savingsAccount;
			
		} else {
			return null;
		}
	}
	
	public int getNextAccountID() {
		System.out.println("getNextAccountID method in Ledger.java");
		//getNextAccountID() - this is a helper method that can be 
		// used to find out what the next accountID will be based 
		// on the number of Accounts within the accounts Map. 
		// It should return the size of the accounts Map plus one.
		//getNextAccountID(): String
		return 0;
	}
	
	public void getAllAccounts() {
		System.out.println("getAllAccounts method in Ledger.java");
		//getAllAccounts() - this method returns a List of 
		// all of the Accounts within the accounts Map.
		//getAllAcounts(): List<Account>
	}
	
	public static Ledger getInstance() {
		System.out.println("getInstance method in Ledger.java");
		System.out.println("instance: " + instance);
		//getInstance() - used to return the single static instance of Ledger. 
		// Please see below for how to implement this method.
		//getInstance(): Ledger (static)
		return instance;
	}
	
}
