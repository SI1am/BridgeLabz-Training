import java.util.*;
public class LexicalTwist {
	
	private static boolean isVowel(char ch) {
		return "AEIOUaeiou".indexOf(ch)!=-1;
	}
	
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the first word: ");
		String first=sc.nextLine().trim();
		if(first.contains(" ")) {
			System.out.println(first+ " is Invalid ");
			
		}
		
		
		System.out.println("Enter the second word: ");
		String second=sc.nextLine().trim();
		if(second.contains(" ")) {
			System.out.println(second+ " is Invalid ");
			
		}
		
		String reversedFirst = new StringBuilder(first).reverse().toString();	
		
		if(reversedFirst.equalsIgnoreCase(second)) {
			String changed = reversedFirst.toLowerCase();
			
			StringBuilder sb = new StringBuilder();
			for(char ch : changed.toCharArray()) {
				if(isVowel(ch)) {
					sb.append('@');
				}else {
					sb.append(ch);
				}
				
			}
			System.out.println(sb.toString());
			
		}else {
			String combined  = (first+second).toUpperCase();
			int vowel =0, consonant=0;
			
			for(char ch : combined.toCharArray()) {
				if (ch >= 'A' && ch <= 'Z') {
                    if (isVowel(ch)) {
                        vowel++;
                    } else {
                        consonant++;
                    }
                }
            }

            if (vowel > consonant) {
                // Print first 2 unique vowels
                Set<Character> seen = new LinkedHashSet<>();
                for (char ch : combined.toCharArray()) {
                    if (isVowel(ch)) {
                        seen.add(ch);
                        if (seen.size() == 2) break;
                    }
                }
                for (char c : seen) {
                    System.out.print(c);
                }

            } else if (consonant>vowel) {
                Set<Character> seen = new LinkedHashSet<>();
                for (char ch : combined.toCharArray()) {
                    if (ch >= 'A' && ch <= 'Z' && !isVowel(ch)) {
                        seen.add(ch);
                        if (seen.size() == 2) break;
                    }
                }
                for (char c : seen) {
                    System.out.print(c);
                }

            } else {
                System.out.println("Vowels and consonants are equal");
            }
        }

    }
}