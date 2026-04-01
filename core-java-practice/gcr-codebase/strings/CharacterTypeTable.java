//Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter
//Hint => 
//Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
//Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
//Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
//Create a Method to find vowels and consonants in a string using charAt() method and return the character and vowel or consonant in a 2D array
//Create a Method to display the 2D Array of Strings in a Tabular Format
//Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 


package strings;

import java.util.Scanner;

public class CharacterTypeTable {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Taking user input
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		
		// Analyze the text
		String[][] result = analyzeText(input);
		
		// Display the result
		displayTable(result);
	}
	
	
	//to analyze each character and its type
	public static String[][] analyzeText(String text) {
		
		// Create 2D array: [character][type]
		String[][] table = new String[text.length()][2];
		
		for (int i = 0; i < text.length(); i++) {
			
			// Store character as String
			table[i][0] = String.valueOf(text.charAt(i));
			
			
			// check whether character is Vowel, Consonant or Not a Letter
			table[i][1] = VowelConsonantsCounter.checkCharacter(text.charAt(i));
			
		}
		return table;
	}
	
	// display the 2D array in tabular format
	
	public static void displayTable(String[][] table) {
		System.out.println("Char	Type");

		
		for (String[] row : table) {
			System.out.println(row[0] + "	" + row[1]);
		}
	}
	
}