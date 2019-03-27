package yourworkhere;

public class SavingsAccount extends Account {
	private double minBalance = 100.00;
	private int currentMonthlyWithdrawals = 0;
	private int maxMonthlyWithdrawals = 5;
	
	public SavingsAccount() {}
	
	public SavingsAccount(String accountID, String firstName, String lastName ) {
		super(accountID, firstName, lastName);
		this.accountType = "Savings";
	}
	
	// getters and setters
	public double getMinBalance() { return this.minBalance; }
	public void setMinBalance(double minBalance) { this.minBalance = minBalance; }
	
	public int getCurrentMonthlyWithdrawals() { return this.currentMonthlyWithdrawals; }
	public void setCurrentMonthlyWithdrawals(int currentMonthlyWithdrawals) { this.currentMonthlyWithdrawals = currentMonthlyWithdrawals; }
	
	public int getMaxMonthlyWithdrawals() { return this.maxMonthlyWithdrawals; }
	public void setMaxMonthlyWithdrawals(int maxMonthlyWithdrawals) { this.maxMonthlyWithdrawals = maxMonthlyWithdrawals; }
	
	@Override
	public String toString() {
		return "SavingsAccountID: " + accountID + "\n" +
				"Name: " + firstName + " " + lastName + "\n" +
				"Balance: " + balance +
				"Max Monthly Withdrawals:" + maxMonthlyWithdrawals + "\n" +
				"currentMonthlyWithdrawals:" + currentMonthlyWithdrawals + "\n" +
				"minBalance:" + minBalance ;
	}

	@Override
	public IAccountManager getAccountManager() {
		return (IAccountManager) new SavingsAccountManager(this);
	}
	// Within the subclasses, SavingsAccount and CheckingAccount, 
	// the implementations should return their respective manager. 
	// For example, the CheckingAccount should return a 
	// CheckingAccountManager within its implementation. 
	// When invoking these constructors, pass in a "this" reference, 
	// to ensure that the created AccountManager services the 
	// specific account that created it.
	
}
