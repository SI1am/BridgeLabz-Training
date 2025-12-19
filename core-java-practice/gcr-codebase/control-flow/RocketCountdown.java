// package controlFlow;

import java.util.*;

public class RocketCountdown {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Countdown starting: ");//Takes Counters Starting as input
		int counter=input.nextInt();
		
		//iterates and prints countdown
		while(counter>=1) {
			
			System.out.println(counter);
			counter--;
		}

	}
}
