package yourworkhere;

public class CheckingAccount extends Account {
	private double overdraftFee = 5.50d;
	
	public CheckingAccount() {
		System.out.println("In the NO ARG CheckingAccount Constructor");
	}
	
	public CheckingAccount(String accountID, String firstName, String lastName) {
		super( accountID, firstName, lastName );
		this.accountType = "checking";
		System.out.println("In the 3 ARG CheckingAccount Constructor");
		System.out.println("accountID: " + accountID);
	}
	
	//getter and setter for overdraft fee
	public double getOverdraftFee() { return this.overdraftFee; }
	public void setOverdraftFee(double overdraftFee) { this.overdraftFee = overdraftFee; }
	
	
	@Override
	public String toString() {
		return "CheckingAccountID: " + accountID + "\n" +
				"Name: " + firstName + " " + lastName +
				"Balance: " + balance +
				"Overdraft Fee:" + overdraftFee;
	}

	@Override
	public IAccountManager getAccountManager() {
		return (IAccountManager) new CheckingAccountManager(this);
	}
	// Within the subclasses, SavingsAccount and CheckingAccount, 
	// the implementations should return their respective manager. 
	// For example, the CheckingAccount should return a 
	// CheckingAccountManager within its implementation. 
	// When invoking these constructors, pass in a "this" reference, 
	// to ensure that the created AccountManager services the 
	// specific account that created it.

}
