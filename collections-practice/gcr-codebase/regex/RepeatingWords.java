//1️⃣4️⃣ Find Repeating Words in a Sentence
//🔹 Example Input:
//"This is is a repeated repeated word test."
//🔹 Expected Output:
//is, repeated

package regex;

import java.util.regex.*;
public class RepeatingWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String regex = "(?i)\\b(\\w+)\\s+\\1\\b";
		
		Pattern pattern= Pattern.compile(regex);
		
		String text = "This This is is a A repeated repeated word Word test TEST So so be BE WiTH wIth Me mE.";
		
		Matcher matcher = pattern.matcher(text);
		
		
		while(matcher.find()) {
			System.out.println("Repeated words : "+ matcher.group(1));
		}

	}

}
