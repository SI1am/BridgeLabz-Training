
import java.util.Scanner;

public class WhichLargest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int number1=input.nextInt();
		System.out.println("Enter the second number: ");
		int number2=input.nextInt();
		System.out.println("Enter the third number: ");
		int number3=input.nextInt();
		
		System.out.println("Is the first number the largest "+ ((number1>=number2)&&(number1>=number3)));
		System.out.println("Is the second number the largest "+ ((number1<=number2)&&(number3<=number2)));
		System.out.println("Is the third number the largest "+ ((number3>=number2)&&(number1<number3)));

	}

}
