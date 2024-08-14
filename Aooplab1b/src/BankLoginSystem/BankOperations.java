package BankLoginSystem;


public class BankOperations {
   
   // Method to view balance
   public void viewBalance() {
       if (UserSession.getInstance().isLoggedIn()) {
           System.out.println("Displaying balance.");
       } 
       else {
           System.out.println("Please log in to view balance.");
       }
   }

   // Method to deposit money
   public void deposit(double amount) {
       if (UserSession.getInstance().isLoggedIn()) {
          System.out.println("Depositing " + amount + " to your account.");
       }
       else {
          System.out.println("Please log in to deposit money.");
       }
   }

   // Method to withdraw money
   public void withdraw(double amount) {
       if (UserSession.getInstance().isLoggedIn()) {
           System.out.println("Withdrawing " + amount + " from your account.");
       }
       else {
           System.out.println("Please log in to withdraw money.");
       }
   }
}
