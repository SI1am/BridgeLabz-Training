//Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
//Hint => 
//Take user input using the  Scanner next() method for 2 String variables
//Write a method to compare two strings using the charAt() method and return a boolean result
//Use the String Built-In method to check if the results are the same and display the result 


package strings;
import java.util.Scanner;

public class StringComparison {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two strings below");
		
		System.out.print("Enter the first string: ");
		String firstString=sc.next();		
		System.out.println();
		
		System.out.print("Enter the second string: ");		
		String secondString=sc.next();
		System.out.println();
		
//		System.out.println("Are these two strings equal");
		
		if(firstString.length()!=secondString.length()) 
			System.out.println(false);		
		
		//iterates over both the strings and compare each character if the
		for(int i=0; i<firstString.length();i++) {
			if(firstString.charAt(i)!=secondString.charAt(i)) {
				System.out.print(false);
				return;
				
			}
		}
		System.out.println(true);		
		
	}
}
