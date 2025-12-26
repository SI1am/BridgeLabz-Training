package encapsulation;

import java.util.*;
interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}
public abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public abstract double calculateInterest();
}

class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest on current accounts
    }

    @Override
    public boolean applyForLoan(double amount) {
        return amount <= calculateLoanEligibility();
    }

    @Override
    public double calculateLoanEligibility() {
        return balance + overdraftLimit; // Loan eligibility includes overdraft
    }
}
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    @Override
    public boolean applyForLoan(double amount) {
        return amount <= calculateLoanEligibility();
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 2; // Loan eligibility is 2x balance for savings
    }
}


class Bank {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();

        System.out.print("Enter number of accounts to create: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println("\n--- Account #" + i + " ---");
            System.out.print("Enter Account Type \n1.Savings: \n2.Current:  ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("Account Number: ");
            String accNum = sc.nextLine();

            System.out.print("Account Holder Name: ");
            String holder = sc.nextLine();

            System.out.print("Initial Balance: ");
            double balance = Double.parseDouble(sc.nextLine());

            if (type==1) {
                System.out.print("Enter Interest Rate (%): ");
                double rate = Double.parseDouble(sc.nextLine());
                accounts.add(new SavingsAccount(accNum, holder, balance, rate));
            } else if (type==2) {
                System.out.print("Enter Overdraft Limit: ");
                double limit = Double.parseDouble(sc.nextLine());
                accounts.add(new CurrentAccount(accNum, holder, balance, limit));
            } else {
                System.out.println("Invalid account type. Try again.");
                i--; // repeat this iteration
            }
        }

        // Display account summary
        System.out.println("\n========= Account Summary =========");
        for (BankAccount acc : accounts) {
            System.out.println("Account: " + acc.getAccountNumber());
            System.out.println("Holder: " + acc.getHolderName());
            System.out.println("Balance: ₹" + acc.getBalance());
            System.out.println("Interest: ₹" + acc.calculateInterest());

            if (acc instanceof Loanable) {
                Loanable loanable = (Loanable) acc;
                System.out.println("Eligible Loan: ₹" + loanable.calculateLoanEligibility());

                System.out.print("Do you want to apply for a loan (yes/no)? ");
                String choice = sc.nextLine().trim().toLowerCase();
                if (choice.equals("yes")) {
                    System.out.print("Enter loan amount to apply: ₹");
                    double loanAmount = Double.parseDouble(sc.nextLine());
                    boolean approved = loanable.applyForLoan(loanAmount);
                    System.out.println("Loan Application (₹" + loanAmount + "): " + (approved ? "Approved" : "Rejected"));
                }
            }

            System.out.println("-------------");
        }

        sc.close();
    }

}
