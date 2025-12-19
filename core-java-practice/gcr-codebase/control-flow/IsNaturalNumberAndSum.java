// package controlFlow;

import java.util.*;
public class IsNaturalNumberAndSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number1=input.nextInt();
		if(number1>0)
		System.out.println("The sum of "+number1 +" natual number is "+ (number1*(number1+1))/2);
		else {
			System.out.println("The number "+number1 +" is not a natual number");
			
		}

	}

}
