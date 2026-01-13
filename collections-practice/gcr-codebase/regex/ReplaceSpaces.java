package regex;
import java.util.*;
import java.util.regex.*;

public class ReplaceSpaces {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Default String: This    is  an     example   with  multiple spaces ");
        String text = "This    is  an     example   with  multiple spaces.";
        String replacedText = text.replaceAll("\\s+", " ");
        System.out.println("Make user input here: ");
        String input= sc.nextLine();

        System.out.println("Original: " + text);
        System.out.println("Formatted: " + replacedText);
        
        String replacedInput = input.replaceAll("\\s+", " ");
        System.out.println("User original: "+ input);
        System.out.println("Formatted: "+ replacedInput);
    }
}
