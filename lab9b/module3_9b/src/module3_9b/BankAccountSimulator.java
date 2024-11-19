package module3_9b;

public class BankAccountSimulator {

    public static void main(String[] args) {
        // Create a shared bank account
        BankAccount sharedAccount = new BankAccount(1000); // Initial balance of 1000

        // Create multiple threads simulating users performing transactions
        Thread user1 = new Thread(new TransactionTask(sharedAccount, true, 500), "User1"); // deposit 500
        Thread user2 = new Thread(new TransactionTask(sharedAccount, false, 300), "User2"); // withdraw 300
        Thread user3 = new Thread(new TransactionTask(sharedAccount, true, 200), "User3"); // deposit 200
        Thread user4 = new Thread(new TransactionTask(sharedAccount, false, 1500), "User4"); // withdraw 1500 (should fail)

        // Start the threads
        user1.start();
        user2.start();
        user3.start();
        user4.start();

        // Join the threads to ensure they complete before the main thread ends
        try {
            user1.join();
            user2.join();
            user3.join();
            user4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final balance
        System.out.println("Final balance: " + sharedAccount.getBalance());
    }
}
