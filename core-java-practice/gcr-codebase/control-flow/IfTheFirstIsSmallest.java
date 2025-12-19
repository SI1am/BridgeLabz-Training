// package controlFlow;

import java.util.*;
public class IfTheFirstIsSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int number1=input.nextInt();
		System.out.println("Enter the second number: ");
		int number2=input.nextInt();
		System.out.println("Enter the third number: ");
		int number3=input.nextInt();
		
		System.out.println("Is the first number the smallest "+ ((number1<number2)&&(number1<number3)));

	}

}
