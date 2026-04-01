package BankSystem;


import java.time.LocalDateTime;

public class BankAccount {

    private int balance = 10000;

    public synchronized boolean withdraw(String customerName, int amount) {

        System.out.println("[" + customerName + "] Processing withdrawal of " + amount);

        if (amount <= balance) {
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            balance -= amount;

            System.out.println("Transaction successful: " + customerName +", Amount: " + amount +", Balance: " + balance +", Time: " + LocalDateTime.now());

            return true;
        } else {
            System.out.println("Transaction failed: " + customerName +", Amount: " + amount +", Balance: " + balance +", Time: " + LocalDateTime.now());
            return false;
        }
    }

    public int getBalance() {
        return balance;
    }
}
