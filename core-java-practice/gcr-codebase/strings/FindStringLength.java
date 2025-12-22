//Write a program to find and return the length of a string without using the length() method 
//Hint => 
//Take user input using the Scanner next() method 
//Create a method to find and return a string's length without using the built-in length() method. The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
//The main function calls the user-defined method as well as the built-in length() method and displays the result

package strings;
import java.util.*;
public class FindStringLength {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str= sc.nextLine();
		
		System.out.print("The Length for your provided string is : ");
		System.out.println(customLength(str));
	}
	public static int customLength(String str) {
		int length=0;
		while(true) {
			try {
				str.charAt(length);
				length++;
				
			}catch(Exception E) {
				break;
				
			}
		}
		return length;
	}
}
