//Write a program to trim the leading and trailing spaces from a string using the charAt() method 
//Hint => 
//Create a method to trim the leading and trailing spaces from a string using the charAt() method. Inside the method run a couple of loops to trim leading and trailing spaces and determine the starting and ending points with no spaces. Return the start point and end point in an array
//Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
//Write a method to compare two strings using the charAt() method and return a boolean result
//The main function calls the user-defined trim and substring methods to get the text after trimming the leading and trailing spaces. Post that use the String built-in method trim() to trim spaces and compare the two strings. And finally display the result



package strings;
import java.util.*;
public class CustomTrim {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string : ");
		
		String text = sc.nextLine();
		int[] bounds = trimBounds(text);
		
		
		String customTrim = substring(text, bounds[0], bounds[1]);
		String builtInTrim = text.trim();
		
		System.out.println("Custom : "+customTrim +"\nBuiltIn : "+builtInTrim );
		
		
		System.out.println("Comparison Result: " + compare(customTrim, builtInTrim));
		
	}
	
	
    // Find start and end indexes without spaces
    static int[] trimBounds(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (s.charAt(start) == ' ') start++;
        while (s.charAt(end) == ' ') end--;

        return new int[]{start, end};
        
    }

    // Create substring using charAt()
    static String substring(String s, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += s.charAt(i);
        }
        return result;
    }
    

    // Compare strings using charAt()
    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

}
