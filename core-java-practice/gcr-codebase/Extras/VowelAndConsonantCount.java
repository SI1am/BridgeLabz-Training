
package Extras;
import java.util.*;
public class VowelAndConsonantCount {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string : ");
		String text=sc.next();
		
		int[] result = countVC(text);
		
		System.out.println("Vowels     : " + result[0]);
		
		System.out.println("Consonants : " + result[1]);
	}
	
	
	
	public static String checkCharacter(char ch) {
		
		// Convert uppercase to lowercase
		if (ch >= 'A' && ch <= 'Z') {
			ch = (char)(ch + 32);
		}
		
		if (ch >= 'a' && ch <= 'z') {
			
			if ("aeiou".indexOf(ch) != -1)
				return "Vowel";
			else
				return "Consonant";
		}
		
		return "Not a Letter";
	}
	
	public static int[] countVC(String text) {
		
		int v = 0, c = 0;
		
		for(int i = 0; ; i++) {
			try {
				
				String type = checkCharacter(text.charAt(i));
				
				if (type.equals("Vowel")) v++;
				
				if (type.equals("Consonant")) c++;
				
			} catch (Exception e) {
				
				break;
			}
		}
		
		return new int[]{v, c};
	}
	
}