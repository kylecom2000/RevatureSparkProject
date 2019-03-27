package yourworkhere;

public abstract class Account {
	protected String accountID;
	protected double balance = 0;
	protected String accountType;
	protected String firstName = "";
	protected String lastName = "";
	
	public abstract IAccountManager getAccountManager();
	
	public Account() {}
	
	public Account(String accountID, String firstName, String lastName) {
		// instantiate account here? (using 'new' keyword) if not here, where?
		System.out.println("Account.Java accountID: " + accountID);
		System.out.println("Account.Java firstName: " + firstName);
		System.out.println("Account.Java lastName: " + lastName);
		this.accountID = accountID;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// GETTER AND SETTER for accountID
	public String getAccountID(){ return this.accountID; }
	public void setAccountID(String accountID){ this.accountID = accountID; }
	
	// GETTER AND SETTER for balance
	public double getBalance(){ return this.balance; }
	public void setBalance(double balance){ this.balance = balance; }
	
	// GETTER AND SETTER for accountType
	public String getAccountType(){ return this.accountType; }		
	public void setAccountType(String accountType){ this.accountType = accountType; }
	
	// GETTER AND SETTER for firstName
	public String getFirstName(){ return this.firstName; }
	public void setFirstName(String firstName){ this.firstName = firstName; }
	
	// GETTER AND SETTER for lastName
	public String getLastName(){ return this.lastName; }	
	public void setLastName(String lastName){ this.lastName = lastName; }
	
	@Override
	public String toString() {
		return "AccountID: " + accountID + ", Balance: " + balance;
	}
}
