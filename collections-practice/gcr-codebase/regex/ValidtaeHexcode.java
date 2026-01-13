//3️⃣ Validate a Hex Color Code
//A valid hex color:
//Starts with a #
//Followed by 6 hexadecimal characters (0-9, A-F, a-f).
//🔹 Example Inputs & Outputs
//✅ "#FFA500" → Valid
//✅ "#ff4500" → Valid
//❌ "#123" → Invalid (too short)


package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidtaeHexcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String regex= "^#[a-fA-F0-9]{6}$";
		
		Pattern pattern= Pattern.compile(regex);
		
		String input = "AB1234 Ae1234 1234AE #ff6782 #111234 ##rtYU3 #Abcdej #FF0912";
		
		String[] hexcodes= input.split("\\s+");
		
		for(String hexcode : hexcodes) {
			
			Matcher matcher = pattern.matcher(hexcode);
			
			if(matcher.matches()) {
				System.out.println("Valid hexcode: "+ hexcode);
				
			}
			else {
				System.out.println("Invalid hexcode: "+ hexcode);
				
			}
		}
		
		System.out.println("Ends");

	}

}
