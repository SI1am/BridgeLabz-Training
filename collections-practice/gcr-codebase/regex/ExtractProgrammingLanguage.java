//1️⃣2️⃣ Extract Programming Language Names from a Text
//🔹 Example Text:
//"I love Java, Python, and JavaScript, but I haven't tried Go yet."
//🔹 Expected Output:
//Java, Python, JavaScript, Go


package regex;


import java.util.regex.*;
public class ExtractProgrammingLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String regex= "\\b(python|java|javascript|go|c|cpp|c\\+\\+|c#|rust|kotlin|swift|php|ruby|typescript)\\b";
		Pattern pattern= Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		
		String input ="I love Java, Python, and JavaScript, but I haven't tried Go yet.";
		
		Matcher matcher = pattern.matcher(input);
		
		while (matcher.find()) {
            System.out.println("Found language: " + matcher.group());
        }

				

	}

}
