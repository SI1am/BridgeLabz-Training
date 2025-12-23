//Write a program to find the smallest and the largest of the 3 numbers.
//Hint => 
//Take user input for 3 numbers
//Write a single method to find the smallest and largest of the three numbers


package methods;
import java.util.*;
public class FindSmallestAndLargest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int number1=input.nextInt();
		System.out.println("Enter the second number: ");
		int number2=input.nextInt();
		System.out.println("Enter the third number: ");
		int number3=input.nextInt();
		
		findLargest(number1,number2,number3);
		findSmallest(number1,number2,number3);
		
	}
	public static void findLargest(int num1, int num2, int num3) {
//		System.out.println("Enter the third number: ");
		System.out.println("The Largest number is:");
		if(num1>num2 && num1>num3) System.out.println(num1);
		if(num3>num2 && num3>num1) System.out.println(num3);
		if(num2>num1 && num2>num3) System.out.println(num2);
		
	}
	public static void findSmallest(int num1, int num2, int num3) {
		System.out.println("The Smallest number is : ");
		if(num1<num2 && num1<num3) System.out.println(num1);
		if(num3<num2 && num3<num1) System.out.println(num3);
		if(num2<num1 && num2<num3) System.out.println(num2);
		
		
	}
	
}
