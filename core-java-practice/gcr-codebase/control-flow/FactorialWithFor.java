// package controlFlow;

import java.util.Scanner;
public class FactorialWithFor{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter A number: ");//Takes number to begin 
		int number=input.nextInt();
		int factorial=1;
		
		//iterates 
		for(int i=1; i<=number;i++) {
			
			factorial*=i;
			
		}
		System.out.println("The Factorial of "+number+" is : "+factorial);//Shows output for factorial
		
		

	}



}