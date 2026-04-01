package implementingInterface;

interface SensitiveData {}

class BankAccount implements SensitiveData {
	
    String accountNumber;

    BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}


public class SecurityCheck {
	public static void main(String[] args) {
		
		Object obj = new BankAccount("1234567890");
		
		if (obj instanceof SensitiveData) {
			System.out.println("Encrypt this data before saving!!!!!!!!!!! or else you'll be hacked");
		}else {
			System.out.println("Not so sensitive data");
		}
	}

}
