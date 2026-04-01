// package controlFlow;


import java.util.Scanner;
public class FactorialWithWhile {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter A number: ");//Takes number to begin 
		int number=input.nextInt();
		int factorial=1;
		int temp=number; //saves the copy of number
		
		//iterates
		while(number>0) {
			if(number==0) break;
			factorial*=number;
			number--;
		}
		System.out.println("The Factorial of "+temp+" is : "+ factorial);//Shows output for factorial
		
		

	}



}
