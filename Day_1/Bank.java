
class BankAccount {

    public int accountNumber;

    protected String accountHolder;

    private double balance;

    // Constructor to initialize bank account details
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    // Public method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass representing a Savings Account
class SavingsAccount extends BankAccount {
    private double interestRate; // Interest rate for the savings account

    // Constructor to initialize savings account details
    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance); // Call to the superclass constructor
        this.interestRate = interestRate;
    }

    // Method to calculate interest earned
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    // Method to display savings account details
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails(); // Call to the superclass method
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class to demonstrate the Bank Account Management System
public class Bank {
    public static void main(String[] args) {
        // Create an instance of BankAccount class
        BankAccount account = new BankAccount(101, "Alice Johnson", 5000.00);

        // Display account details
        System.out.println("--- Bank Account Details ---");
        account.displayAccountDetails();

        // Perform deposit and withdrawal operations
        account.deposit(1000.00);
        account.withdraw(1500.00);
        System.out.println("\nUpdated Account Details:");
        account.displayAccountDetails();

        // Create an instance of SavingsAccount class
        SavingsAccount savingsAccount = new SavingsAccount(102, "Bob Smith", 8000.00, 3.5);

        // Display savings account details
        System.out.println("\n--- Savings Account Details ---");
        savingsAccount.displayAccountDetails();

        // Calculate and display interest earned
        double interest = savingsAccount.calculateInterest();
        System.out.println("Interest Earned: $" + interest);
    }
}
