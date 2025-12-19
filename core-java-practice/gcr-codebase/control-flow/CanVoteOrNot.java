// package controlFlow;

import java.util.*;
public class CanVoteOrNot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the age: ");//take age of the person as input
		int age=input.nextInt();
		
		if(age>=18)//evaluate if he can vote or not
		System.out.println("The person's age is "+age+ " and can vote");
		else
		System.out.println("The person's age is "+age+ " and cannot vote");
		
	}

}

