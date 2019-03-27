package yourworkhere;

public class CheckingAccountManager implements IAccountManager {
	CheckingAccount checkingAccount;
	double balance = checkingAccount.getBalance();
	double fee = checkingAccount.getOverdraftFee();
	
	public CheckingAccountManager() {}
	
	public CheckingAccountManager(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}
	
	public boolean deposit(double amount) {
		if (amount <= 0) {
			return false;
		} else {
			checkingAccount.setBalance(balance + amount);
			return true;
		}
	}
	
	public boolean withdrawal(double amount) {
		if (amount > balance) {
			checkingAccount.setBalance(balance - amount);
			checkingAccount.setBalance(balance - fee);
			return false;
		} else {
			checkingAccount.setBalance(balance - amount);
			return true;
		}
	}
}
