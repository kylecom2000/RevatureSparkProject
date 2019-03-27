package yourworkhere;

public class SavingsAccountManager implements IAccountManager {
	SavingsAccount savingsAccount;
	double balance = savingsAccount.getBalance();
	double minBalance = savingsAccount.getMinBalance();
	int currentWithdrawals = savingsAccount.getCurrentMonthlyWithdrawals();
	int maxMonthlyWithdrawals = savingsAccount.getMaxMonthlyWithdrawals();
	
	public SavingsAccountManager() {}
	
	public SavingsAccountManager(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
		
	}
	
	public boolean deposit(double amount) {
		if (amount <= 0) {
			return false;
		} else {
			savingsAccount.setBalance(balance + amount);
			return true;
		}
	}
	
	public boolean withdrawal(double amount) {
		if ( currentWithdrawals >= maxMonthlyWithdrawals) {
			return false;
		} else if (balance < minBalance) {
				return false;
		} else {
			savingsAccount.setBalance(balance - amount);
			savingsAccount.setCurrentMonthlyWithdrawals(currentWithdrawals + 1);
			return true;
		}
	}
}
