//4️⃣ Extract All Email Addresses from a Text
//🔹 Example Text:
//"Contact us at support@example.com and info@company.org"
//🔹 Expected Output:
//support@example.com
//info@company.org


package regex;

import java.util.regex.*;
public class EmailExtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex= "^[a-zA-Z0-9_+-\\.]+@[a-zA-Z0-9-]+\\.[a-zA-Z\\.]{2,}$";
		
		Pattern pattern= Pattern.compile(regex);
		
		String input = "Contact us at support@example.com and info@company.org and abc@gmail.co sshivam.mpi0123@gmai.com shivam.singh_cs.csf22@gla.ac anc@gmal.co.onin";
		
		String[] words= input.split("\\s+");
		
		for(String word : words) {
			
			Matcher matcher = pattern.matcher(word);
			
			if(matcher.matches()) {
				System.out.println("Email: "+ word);
				
			}

		}
		
		System.out.println("Ends");

	}

}
