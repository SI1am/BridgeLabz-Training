// Validate a License Plate Number
//License plate format: Starts with two uppercase letters, followed by four digits.
//Example: "AB1234" is valid, but "A12345" is invalid.


package regex;

import java.util.regex.*;

public class ValidateLicencePlate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex= "^[A-Z]{2}[0-9]{4}$";
		
		Pattern pattern= Pattern.compile(regex);
		
		String input = "AB1234 Ae1234 1234AE ankjdfn 636363 TI89062 TO9876";
		
		String[] numberPlates= input.split("\\s+");
		
		for(String numbers : numberPlates) {
			
			Matcher matcher = pattern.matcher(numbers);
			
			if(matcher.matches()) {
				System.out.println("Valid number plate: "+ numbers);
				
			}
			else {
				System.out.println("Invalid number plate: "+ numbers);
				
			}
		}
		
		System.out.println("Ends");
		

	}

}
