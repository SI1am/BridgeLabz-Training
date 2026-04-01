package implementingInterface;

interface Payment{
	void pay(double amount);
}

class UPI implements Payment{

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid "+amount+ " using UPI");
		
	}
	
}

class CreditCard implements Payment{
	
	@Override
	public void pay (double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid "+amount+ " using Credit Card.");
		
	}
	
}

class Wallet implements Payment{
	
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid "+amount+ " using Wallet");
		
	}
	
}

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p1= new UPI();
		Payment p2= new CreditCard();
		Payment p3= new Wallet();
		
		p1.pay(8090);
		p2.pay(832);
		p3.pay(564.8);
		

	}

}
