package module3_9b;

public class TransactionTask implements Runnable {
    private BankAccount account;
    private boolean deposit; // true for deposit, false for withdraw
    private double amount;

    // Constructor to define the account and transaction type
    public TransactionTask(BankAccount account, boolean deposit, double amount) {
        this.account = account;
        this.deposit = deposit;
        this.amount = amount;
    }

    // Run method for thread execution
    @Override
    public void run() {
        if (deposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}
