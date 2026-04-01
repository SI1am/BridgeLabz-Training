//Create a program to print a multiplication table of a number.
//Hint => 
//Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 1
//Run a loop from 1 to 10 and store the results in the multiplication table array
//Finally, display the result from the array in the format number * i = ___

package arrays;

import java.util.*;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number= sc.nextInt();//take a number as input
		
		int[] table= new int[10];
		System.out.println("The Table for number "+number);
		for(int i=1;i<=10;i++ ) {
			table[i-1]=number*i;
			System.out.println(number  +" * "+ i+" = "+ table[i-1]);
		}
		
		
		
	}

}
