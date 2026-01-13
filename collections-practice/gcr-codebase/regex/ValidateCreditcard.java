//Validate a Credit Card Number (Visa, MasterCard, etc.)
//A Visa card number starts with 4 and has 16 digits.
//A MasterCard starts with 5 and has 16 digits.


package regex;


import java.util.regex.*;
public class ValidateCreditcard {


	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
		
//		System.out.println("Enter a string: ");
//		String text = sc.nextLine();
		String text="4871920234123893 5098765432109876 4987135897198374718734 5717348183413413 4njbijbkkjbkj 5kubhhkjbkjbkjb ";
		Pattern pattern = Pattern.compile("[4-5][0-9]{15}");
		
		Matcher matcher = pattern.matcher(text);
		
		while (matcher.find()) {
		    String card = matcher.group();

		    if (card.startsWith("4")) {
		        System.out.println("Visa card: " + card);
		    } else if (card.startsWith("5")) {
		        System.out.println("Master card: " + card);
		    }
		}

	}
}
