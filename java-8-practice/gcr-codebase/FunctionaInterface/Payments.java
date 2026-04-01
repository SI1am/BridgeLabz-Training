package implementingInterface;

interface PaymentProcessor {

    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Refunded ₹" + amount);
    }
}

class UpiPayment implements PaymentProcessor {

    public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}


public class Payments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	        PaymentProcessor payment = new UpiPayment();
	        int amount = 1000;
	        payment.processPayment(amount);
	        payment.refund(amount);

	}

}
