package yourworkhere;

public class OverdraftException extends RuntimeException{
	//At times you may wish to define a custom exception 
	// for your application. In our case, we need a new 
	// exception called OverdraftException.


	// Re-factor the CheckingAccountManager to throw an 
	// OverdraftException in the case when the withdraw 
	// method is attempting to reduce an Account’s balance 
	// by more than it’s current balance.

}
