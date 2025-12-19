
import java.util.Scanner;

public class SumTillZero {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter A number to begin ");//Takes number to begin the sum
		double number=input.nextDouble();
		double sum=number;
		
		//iterates and prints sum utill it receives 0
		while(true) {
			if(number==0) break;
			System.out.println("The Current Sum is : "+ sum);//Shows output for sum
			System.out.println("Enter the next value to be added : ");//Takes new values as input and adds it to sum
			number=input.nextDouble();
			sum+=number;
		}
		
	}

}

