//Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
//Hint => 
//Define an integer array of 5 elements and get user input to store in the array.
//Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
//If the number is negative, print negative. Else if the number is zero, print zero. 
//Finally compare the first and last element of the array and display if they equal, greater or less


package arrays;


import java.util.*;
public class CheckNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the 5 numbers : ");
		int number[]=new int[5];
		
		for(int i=0; i<5;i++)
			number[i]=input.nextInt(); //Take numbers as input for the array
		
		//evaluates and prints the result
		for(int i=0; i<5;i++) {
			System.out.print("The number "+number[i]);
			
			if(number[i]>0) {
				
				System.out.print(" Positive");
				if(number[i]%2==0) System.out.println(" and Even");
				else System.out.println(" and Odd");
			}
			else if(number[i]<0)
				System.out.println(" Negative");
			else
				System.out.println("Zero");
		}
			System.out.println("");
			
		if(number[0]==number[4])
			System.out.println("First and last are Equal");
		if(number[0]>number[4])
			System.out.println("First is greater than last");
		if(number[0]<number[4])
			System.out.println("First is lesser than last");
		
		

	}

}
