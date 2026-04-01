// package controlFlow;

import java.util.*;
public class CheckNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=input.nextInt(); //Take number as input
		
		if(number>0)
		System.out.println("positive");
		else if(number<0)
		System.out.println("negative");
		else
		System.out.println("zero");

	}

}
