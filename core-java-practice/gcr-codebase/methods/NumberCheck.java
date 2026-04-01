//Write a program to check whether a number is positive, negative, or zero.
//Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero


package methods;
import java.util.*;

public class NumberCheck {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int number= sc.nextInt();
//		System.out.println("Enter a number :");
		Find(number);
	}

	public static void Find(int number) {
		if(number>0)
			System.out.println(1);
		if(number<0)
			System.out.println(-1);
		if(number==0)
			System.out.println(0);
	}
}
