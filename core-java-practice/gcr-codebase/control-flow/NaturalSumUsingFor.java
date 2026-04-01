// package controlFlow;

import java.util.Scanner;

public class NaturalSumUsingFor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter A number to begin ");//Takes number to check for the natural sum
		int number=input.nextInt();
		int naturalSum=((number)*(number+1))/2;
		int naturalSum2=0;
		
		//iterates and adds the number value to naturalsum2 and reduces value of number by 1
		for(int i=0; i<number;i++) {
//			if(number==0) break;
			naturalSum2+=number-i;
			
		}
		System.out.println(naturalSum==naturalSum2);//print the result
		
	}	
	

}

