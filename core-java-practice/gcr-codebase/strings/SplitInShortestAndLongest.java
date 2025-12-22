
//Write a program to split the text into words and find the shortest and longest strings in a given text
//Hint => 
//Take user input using the Scanner nextLine() method 
//Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
//Create a method to find and return a string's length without using the length() method. 
//Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
//Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array. 
//The main function calls the user-defined methods and displays the result. 


package strings;

import java.util.Scanner;
public class SplitInShortestAndLongest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Take user input
		System.out.print("Enter a sentence: ");
		String text = sc.nextLine().trim();
		
		// Split words
		String[] words = WordLength2D.wordSplit(text);
		
		// Convert to 2D array with lengths
		String[][] data = wordWithLength(words);
		
		// Display word-length table
		System.out.println("\nWord\tLength");
		System.out.println("----------------");
		for (String[] row : data) {
			System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
		}
		
		// Find shortest and longest lengths
		int[] result = findMinMax(data);
		
		System.out.println("\nShortest Word Length: " + result[0]);
		System.out.println("Longest Word Length : " + result[1]);
	}
	
	
	// to convert word array into 2D array [word, length]
	public static String[][] wordWithLength(String[] words) {
		String[][] data = new String[words.length][2];
		
		for (int i = 0; i < words.length; i++) {
			data[i][0] = words[i];
			data[i][1] = String.valueOf(WordLength2D.getLength(words[i]));
		}
		return data;
	}
	
	//to find shortest and longest word lengths
	public static int[] findMinMax(String[][] data) {
		
		int min = Integer.parseInt(data[0][1]);
		int max = min;
		
		for (String[] row : data) {
			int len = Integer.parseInt(row[1]);
			if (len < min) min = len;
			if (len > max) max = len;
		}
		return new int[]{min, max};
	}
	
	
}