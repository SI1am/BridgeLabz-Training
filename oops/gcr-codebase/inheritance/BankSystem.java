package inheritance;

import java.util.*;
class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }
    
    public void displayAccountType() {
    	System.out.println("This is Bank Account");
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int acc, double bal, double rate) {
        super(acc, bal);
        interestRate = rate;
    }

    public void displayAccountType() {
    	
        System.out.println("Savings Account");
        
        
    }
}


class CheckingAccount extends BankAccount {
    int withdrawalLimit;

    CheckingAccount(int acc, double bal, int limit) {
        super(acc, bal);
        withdrawalLimit = limit;
    }

    public void displayAccountType() {
        System.out.println("Checking Account");
    }
}


class FixedDepositAccount extends BankAccount {
    int years;

    FixedDepositAccount(int acc, double bal, int years) {
        super(acc, bal);
        this.years = years;
    }

    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}


public class BankSystem{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Account number: \n");
		int accountNumber=sc.nextInt();
		
		System.out.print("Enter Balance: \n");
		double balance=sc.nextDouble();
		
		BankAccount account;
		System.out.print("Choose your action: \n1.Saving Account: \n2.Checking Account: \n3.Fixed Deposit: ");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.print("Enter Rate: \n");
			double rate=sc.nextDouble();
			account=new SavingsAccount(accountNumber,balance,rate);			
			
		}
		else if(choice==2) {
			System.out.print("Enter Withdraw Limit: \n");
			int limit =sc.nextInt();
			account=new CheckingAccount(accountNumber,balance,limit);			
			
		}
		else if(choice==3) {
			System.out.print("Enter \n");
			int years=sc.nextInt();
		    account=new FixedDepositAccount(accountNumber,balance,years);			
			
		}else {
			account= new BankAccount(accountNumber,balance);
		}
		account.displayAccountType();
		
		
	}
}
