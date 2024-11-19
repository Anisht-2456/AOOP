package module3_9b;

public class BankAccount {
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized method for deposit
    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited: " + amount);
            System.out.println("Current balance after deposit: " + getBalance());
        }
    }

    // Synchronized method for withdrawal
    public synchronized void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount);
            System.out.println("Current balance after withdrawal: " + getBalance());
        } else {
            System.out.println(Thread.currentThread().getName() + " attempted to withdraw: " + amount + " (Insufficient funds)");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}
