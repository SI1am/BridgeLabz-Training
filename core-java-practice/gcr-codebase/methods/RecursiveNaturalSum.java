//Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct. 
//Hint => 
//Take the user input number and check whether it's a Natural number
//Write a Method to find the sum of n natural numbers using recursion
//Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2 
//Compare the two results and print the result



package methods;
import java.util.*;

public class RecursiveNaturalSum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int formulaSum=(number*(number+1))/2;
		int recSum=recurSum(number);
		
		System.out.println("Sum using Formula : " +formulaSum);
		System.out.println("Sum using Recursion : " +recSum);
		System.out.println("Recursion is equals to formula : " +(formulaSum==recSum));
		
	}
	public static int recurSum(int num) {
		
		if(num==1 || num==0) return num;
		int sum=num+recurSum(num-1);
		
		return sum;
	}

}
