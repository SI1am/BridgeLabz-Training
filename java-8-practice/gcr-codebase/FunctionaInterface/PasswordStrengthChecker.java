package implementingInterface;

interface SecurityUtils {
	static boolean isStrongPassword(String password) {
        if (password==null) return false;

        boolean hasUpperCase = password.matches(".*[A-Z].*");
        boolean hasDigit = password.matches(".*[0-9].*");
        boolean hasSpecial = password.matches(".*[!@#$%^&*].*");
        boolean length = password.length()>=8;

        return (length && hasUpperCase &&hasDigit &&hasSpecial);
    }
}


public class PasswordStrengthChecker {
	
	public static void main(String[] args) {
		
		String password = "Secure@123";
		
		if(SecurityUtils.isStrongPassword(password)) {
			System.out.println("Strong password accepted");
		}else {
			System.out.println("Weak password rejected");
		}
		
		
		String password1 = "notsostrongpasswordq";
		
		if(SecurityUtils.isStrongPassword(password1)) {
			System.out.println("Strong password accepted");
		}else {
			System.out.println("Weak password rejected");
		}
	}

	
}
