

import java.util.Scanner;
public class RocketCountdownUsingForLoop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Countdown starting: ");//Takes Counters Starting as input
		int counter=input.nextInt();
		
		//iterates and prints countdown
		for(int i=0;i<counter;i++){
			
			System.out.println(counter-i);
//			counter--;
		}

	}
}
