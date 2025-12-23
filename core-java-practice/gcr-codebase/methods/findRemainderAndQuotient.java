//Write a program to take 2 numbers and print their quotient and reminder
//Hint => 
//Take user input as integer
//Use division operator (/) for quotient and moduli operator (%) for reminder
//Write Method to find the reminder and the quotient of a number 


package methods;
import java.util.*;

public class findRemainderAndQuotient {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the two numbers: \n");
		
		System.out.print("Enter the number");
		int number=sc.nextInt();
		System.out.print("Enter the divisor");
		int divisor=sc.nextInt();
		
		find(number, divisor);
	}
	public static void find(int num, int div) {
		System.out.println("Quotient :"+ num/div);
		System.out.println("Remainder :"+num%div);
	}

}
