//Validate a Username
//A valid username:
//Can only contain letters (a-z, A-Z), numbers (0-9), and underscores (_)
//Must start with a letter
//Must be between 5 to 15 characters long

package regex;

import java.util.regex.*;
public class ValidateUserName {
	public static void main (String args[]) {
		
		String regex="^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
		Pattern pattern = Pattern.compile(regex);
		String input ="user123 wser_1232 123user 123_user us_1";
		
		
//		Matcher matcher =pattern.matcher(input);
//		
//		while(matcher.find()) {
//			System.out.println("Matched: " + matcher.group(input));
//		}
		
		String[] usernames = input.split(" ");

        for (String username : usernames) {
            Matcher matcher = pattern.matcher(username);
            if (matcher.matches()) {
                System.out.println("Valid: " + username);
            } else {
                System.out.println("Invalid: " + username);
            }
        }
		System.out.println("regex End");
	}

}
