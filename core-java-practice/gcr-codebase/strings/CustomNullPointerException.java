//Write a program to demonstrate NullPointerException. 
//Hint => 
//Write a Method to generate the Exception. Here define the variable text and initialize it to null. Then call one of the String Method to generate the exception
//Write the Method to demonstrate NullPointerException. Here define the variable text and initialize it to null. Then write try catch block for handling the Exception while accessing one of the String method
//From the main Firstly call the method to generate the Exception then refactor the code to call the method to handle the RuntimeException
//

package strings;
import java.util.*;

public class CustomNullPointerException {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Null Pointer Exception Demonstration \n");
		String str=null;
		
		callError(str);
		
		
	}
	private static void callError(String str) {
		
		try{
			
			System.out.println("Calling length function for the null ");
			str.length();
		}catch( NullPointerException e){
			System.out.println("This is a null pointer exception : "+ e.getMessage());
			
		}
	}

}
