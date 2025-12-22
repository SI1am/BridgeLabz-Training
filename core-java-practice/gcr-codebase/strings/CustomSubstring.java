//Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
//Hint => 
//Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
//Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
//Write a method to compare two strings using the charAt() method and return a boolean result
//Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result


package strings;

import java.util.*;
public class CustomSubstring {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String inputString=sc.next();
		
		System.out.print("Enter starting index for substring: ");
		int start=sc.nextInt();
		
		System.out.print("Enter the ending index: ");
		int end=sc.nextInt();
		
		String customSubstring=custom(inputString,start,end);
		String builtInSubstring=inputString.substring(start,end);
		
		boolean result=StringComparison(customSubstring,builtInSubstring);
		
		System.out.println("Custom Substring: " + customSubstring);
        System.out.println("Built-in Substring: " + builtInSubstring);
        System.out.println("Are both equal: " + result);
		
	}
	//compares if two strings are equal or not
	private static boolean StringComparison(String str1,String str2) {
		if(str1.length()!=str2.length()) return false;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i)) return false;
		}
		return true;
	}
	
	//creates custom Substrings
	public static String custom(String str, int start, int end) {
		String result="";
		
		for(int i=start; i<end;i++) {
			result+=str.charAt(i);
		}
		return result;
		
	}

	
}
