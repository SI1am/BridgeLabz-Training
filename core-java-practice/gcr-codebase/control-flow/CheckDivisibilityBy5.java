// package controlFlow;

import java.util.*;

public class CheckDivisibilityBy5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//Take number as input from the user
		System.out.println("Enter a number : ");
		int num=input.nextInt();
		
		System.out.print("Is the number " +num+ " divisible by 5 " +(num%5==0));
	}
}
