//5️⃣ Extract All Capitalized Words from a Sentence
//🔹 Example Text:
//"The Eiffel Tower is in Paris and the Statue of Liberty is in New York."
//🔹 Expected Output:
//Eiffel, Tower, Paris, Statue, Liberty, New, York


package regex;

import java.util.regex.*;
import java.util.Scanner;

public class Capitalize {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a string: ");
        String text = sc.nextLine();
        
        Pattern pattern = Pattern.compile("\\b[A-Z][a-z]*\\b");
        Matcher matcher = pattern.matcher(text);
        
        while (matcher.find()) {
            System.out.println("Capitalized words: "+ matcher.group());
        }
    }

}
