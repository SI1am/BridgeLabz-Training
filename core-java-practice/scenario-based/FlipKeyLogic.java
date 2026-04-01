
import java.util.*;
public class FlipKeyLogic {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a word: ");
		String input = sc.nextLine().trim();
		
		String result = CleanseAndInvert(input);
		
		if(result.length()==0) {
			System.out.println("Invalid Input");
		}else {
			
			System.out.println("The Generated Key is : "+result);
		}
		
		
	}
	
	public static String CleanseAndInvert(String input) {
		if (input == null || input.length() < 6) {
            return "";
        }
		for (char ch : input.toCharArray()) {
            if (!Character.isLetter(ch)) {
                return "";
            }
        }
		input = input.toLowerCase();

        StringBuilder text = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (ch % 2 != 0) {   
                text.append(ch);
            }
        }
        text.reverse();
        
        for(int i = 0; i<text.length();i++){
            if(i %2== 0){
                text.setCharAt(i,Character.toUpperCase(text.charAt(i)));
            }
        }
		return text.toString();
		
	}
}