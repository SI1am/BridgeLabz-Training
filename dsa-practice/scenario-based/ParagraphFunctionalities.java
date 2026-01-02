import java.util.*;
public class ParagraphFunctionalities {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a text: \n");
		String text = sc.nextLine();
		
		int numberOfWords=countWords(text);
		System.out.println("The String have "+numberOfWords+ " words.");
		
		if(numberOfWords==0) {
			System.out.print("Empty String");
			return;
		}
		
		
		String longestWord = findLongestWord(text);
	    System.out.println("The longest word is: " + longestWord);
		
	    System.out.print("Enter word to replace: ");
        String oldWord = sc.nextLine();

        System.out.print("Enter replacement word: ");
        String newWord = sc.nextLine();

        String replacedText = replaceWord(text, oldWord, newWord);
        System.out.println("Updated paragraph:");
        System.out.println(replacedText);

		
		
	}
	
	public static int countWords(String text) {
        String trimmed = text.trim();
        if (trimmed.isEmpty()) return 0;
        return trimmed.split("\\s+").length;
    }
	
	public static String findLongestWord(String text) {
        String[] words = text.trim().split("\\s+");
        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
	
	 public static String replaceWord(String text, String oldWord, String newWord) {
		 
	        return text.replaceAll("(?i)\\b" + oldWord + "\\b", newWord);
	 }
}
