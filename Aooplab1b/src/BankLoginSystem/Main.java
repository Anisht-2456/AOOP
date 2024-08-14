package BankLoginSystem;

public class Main {
	 public static void main(String[] args) {
	     // Get the UserSession instance and log in
	     UserSession session = UserSession.getInstance();
	     session.login();

	     // Perform bank operations
	     BankOperations bankOperations = new BankOperations();
	     bankOperations.viewBalance();
	     bankOperations.deposit(1000.0);
	     bankOperations.withdraw(500.0);

	     // Attempt to log in again (should indicate already logged in)
	     session.login();

	     // Log out the user
	     session.logout();

	     // Try to perform an operation after logout (should prompt login)
	     bankOperations.viewBalance();
	 }
}