//Write a program to convert the complete text to uppercase and compare the results
//Hint => 
//Take user input using the  Scanner nextLine() method to take the complete text into a String variable
//Write a method using the String built-in charAt() method to convert each character if it is lowercase to the uppercase. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
//Write a method to compare two strings using the charAt() method and return a boolean result
//In the main() use the String built-in method toUpperCase() to get the uppercase text and compare the two strings using the user-defined method. And finally display the result

package strings;
import java.util.*;

public class ChangeToUpperCase {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter a String: ");
		String str= sc.nextLine();
		String result=customUpper(str);
		String builtIn=str.toUpperCase();
		
		System.out.println(customCompare(result,builtIn));
		
		
	}
	private static String customUpper(String str) {
		
		String result="";
		for(int i=0; i<str.length();i++) {
			char ch= str.charAt(i);
			
			if(ch>='a' && ch<='z') {
				ch=(char)(ch-32);
			}
			
			result+=ch;
			
		}
		return result;
	}
	private static boolean customCompare(String str1, String str2) {
		if(str1.length()!=str2.length()) return false;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i)) return false;
		}
		return true;
	}

}
