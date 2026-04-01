//Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
//Hint => 
//Simple Interest = Principal * Rate * Time / 100
//Take user input for principal, rate, time
//Write a method to calculate the simple interest given principle, rate and time as parameters
//Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”


package methods;

import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the Principal : ");
	        int principal=sc.nextInt();
	        System.out.println("Enter the Rate of Interest: ");
	        int rate=sc.nextInt();
	        System.out.println("Enter the Time: ");
	        int time=sc.nextInt();
	        
	        interestCalculator(principal,rate,time);
	        
	}
	public static void interestCalculator(int principal, int rate, int time) {
		System.out.print("The Simple interest is  " +(principal*rate*time)/100);
		System.out.print(" for Principal "+principal+" Rate of interest is "+rate+ " and time is "+time );
	}
}
