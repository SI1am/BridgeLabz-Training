//Write a program to find the sum of n natural numbers using loop
//Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop 


package methods;
import java.util.*;

public class NaturalSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter A number to begin ");//Takes number to check for the natural sum
		int number=input.nextInt();
		findSum(number);
		
		
	}	
	public static void findSum(int number) {
		int naturalSum=((number)*(number+1))/2;
		System.out.println(naturalSum);//print the result
		
	}
	

}
