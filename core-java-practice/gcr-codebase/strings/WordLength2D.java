//Write a program to split the text into words and return the words along with their lengths in a 2D array
//Hint => 
//Take user input using the Scanner nextLine() method 
//Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
//Create a method to find and return a string's length without using the length() method. 
//Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
//The main function calls the user-defined method and displays the result in a tabular format. During display make sure to convert the length value from String to Integer and then display

package strings;
import java.util.*;
public class WordLength2D {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter Text here: ");
	   String text=sc.nextLine().trim();
        String[] words = wordSplit(text);
        
        String[][] data = wordWithLength(words);

        System.out.println("Word\tLength");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
   public static String[] wordSplit(String text) {

	    int length = getLength(text);
	    int spaces = 0;

	    // Count spaces to know number of words
	    for (int i = 0; i < length; i++) {
	        if (text.charAt(i) == ' ') {
	            spaces++;
	        }
	    }

	    String[] words = new String[spaces + 1];
	    String temp = "";
	    int index = 0;

	    // Traverse entire string
	    for (int i = 0; i < length; i++) {
	        char ch = text.charAt(i);

	        if (ch == ' ') {
	            // Store word when space is found
	            words[index++] = temp;
	            temp = "";
	        } else {
	            temp += ch;
	        }
	    }

	    // Store last word
	    words[index] = temp;

	    return words;
	}

   public static int getLength(String s) {
	    int i = 0;
	    try {
	        while (true) {
	            s.charAt(i);
	            i++;
	        }
	    } catch (Exception e) {
	        return i;
	    }
	}


   public static String[][] wordWithLength(String[] words) {
       String[][] result = new String[words.length][2];

       for (int i = 0; i < words.length; i++) {
           result[i][0] = words[i];
           result[i][1] = String.valueOf(getLength(words[i]));
       }
       return result;
   }
}
