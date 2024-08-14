package BankLoginSystem;

public class UserSession {
	
    // Static variable to hold the single instance of UserSession
    private static UserSession instance;

    // Variable to store the current user's login state
    private boolean isLoggedIn = false;

    // Private constructor to prevent instantiation
    private UserSession() {}

    // Public method to get the single instance of UserSession
    public static UserSession getInstance() {
    	if (instance == null) {
    		instance = new UserSession();
        }
        return instance;
    }

     // Method to log in the user
     public void login() {
     	 if (!isLoggedIn) {
     		 isLoggedIn = true;
              System.out.println("User logged in successfully.");
         } 
     	 else {
             System.out.println("User is already logged in.");
         }
     }

     // Method to log out the user
     public void logout() {
         if (isLoggedIn) {
        	 isLoggedIn = false;
        	 System.out.println("User logged out successfully.");
         } 
         else {
             System.out.println("User is already logged out.");
         }
     }

     // Method to check if the user is logged in
     public boolean isLoggedIn() {
         return isLoggedIn;
     }
}


