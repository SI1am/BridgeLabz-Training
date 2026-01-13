package regex;

import java.util.regex.*;
import java.util.Scanner;


public class ExtractDate {
	public static void main(String[] args) {
		
		  Scanner sc= new Scanner(System.in);
		
//		  System.out.println("Enter a string: ");
//	      String text = sc.nextLine();
		  
		  String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
	      
	      Pattern pattern = Pattern.compile("[0-3][0-9]/[0-1][0-9]/[0-9]{4}");
	      Matcher matcher = pattern.matcher(text);
	      
	      while (matcher.find()) {
	          System.out.println("Dates: "+ matcher.group());
	      }
	}

}





