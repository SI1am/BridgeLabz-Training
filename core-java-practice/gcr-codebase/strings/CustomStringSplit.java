//Write a program to split the text into words, compare the result with the split() method and display the result 
//Hint => 
//Take user input using the Scanner nextLine() method 
//CreatCreate a e a Method to find the length of the String without using the built-in length() method. 
//Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
//Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
//Then Create an array to store the words and use the indexes to extract the words
//Create a method to compare the two String arrays and return a boolean
//The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result


package strings;
import java.util.*;
public class CustomStringSplit {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str=sc.nextLine();
		System.out.println("");
		
		
		String[] answer=customSplit(str);
		String [] builtIn=str.split("");
		
		System.out.print(customStringArrayComparison(answer,builtIn));
		
		
	}
	
	//Splits the String into Word Array
	public static String[] customSplit(String str) {
		
		
		int length=FindStringLength.customLength(str);//using previously created method
		String[] result =new String[length];
		for(int i=0; i<length;i++) {
			char ch=str.charAt(i);
			result[i]=ch+"";
			
		}
		System.out.print("[ ");
		for(int i=0; i<length;i++) {
			char ch=str.charAt(i);
			if(i!=length-1) 
				System.out.print(ch+",");
			else
				System.out.print(ch);
			
		}
		System.out.print(" ]");
		System.out.println("");
		return result;
		
	}
	public static boolean customStringArrayComparison(String[] str1, String[] str2) {
		
		if(str1.length!=str2.length) return false;
		
		for( int i=0; i<str1.length;i++) {
			if(str1[i].charAt(0)!=str2[i].charAt(0)) return false;
		}
		
		return true;
		
		
	}
 
}
