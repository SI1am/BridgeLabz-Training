// package keywords;
public class BankAccount {

    // Static variables shared by all bank accounts
    private static String bankName = "State bank of India";
    private static int totalAccounts = 0;

    // account number should not change once assigned
    private final String accountNumber;

    private String accountHolderName;
    private double balance;

    // Constructor (using 'this' to avoid confusion with variables)
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++; // Increase count when a new account is created
    }

    // Static method to show total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Getter and setter methods
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
    	
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
        
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
    	
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.err.println("Insufficient balance or invalid amount.");
        }
        
    }

    // Main method to test the program
    public static void main(String[] args) {

    	// Creating bank accounts
    	BankAccount account1 = new BankAccount("Lynda Princy", "ACC12345", 1000.00);
    	BankAccount account2 = new BankAccount("Prince Danish", "ACC67890", 500.00);
    	BankAccount account3 = new BankAccount("Amit Sharma", "ACC24680", 1500.00);
    	BankAccount account4 = new BankAccount("Sneha Iyer", "ACC13579", 2000.00);

    	// Displaying account details
    	System.out.println("\nAccount 1 Details:");
    	account1.displayAccountDetails();

    	System.out.println("\nAccount 2 Details:");
    	account2.displayAccountDetails();

    	System.out.println("\nAccount 3 Details:");
    	account3.displayAccountDetails();

    	System.out.println("\nAccount 4 Details:");
    	account4.displayAccountDetails();

    	// Display total number of accounts
    	BankAccount.getTotalAccounts();

    	// Performing some transactions
    	System.out.println("\nPerforming transactions on Account 1:");
    	account1.deposit(200);
    	account1.withdraw(150);
    	account1.displayAccountDetails();

    	System.out.println("\nPerforming transactions on Account 2:");
    	account2.deposit(100);
    	account2.withdraw(800);

    	System.out.println("\nPerforming transactions on Account 3:");
    	account3.deposit(500);
    	account3.withdraw(1000);
    	account3.displayAccountDetails();

    	System.out.println("\nPerforming transactions on Account 4:");
    	account4.deposit(300);
    	account4.withdraw(2500); // This may show insufficient balance
    	account4.displayAccountDetails();

    }
}
