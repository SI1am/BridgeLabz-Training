//Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
//Hint => 
//Get an integer value from user for the numberOfchocolates and numberOfChildren.
//Write the method to find the number of chocolates each child gets and number of remaining chocolates
//public static int[] findRemainderAndQuotient(int number, int divisor) 


package methods;
import java.util.*;
public class ChoclateDistribution {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of chocolates :");
		int choclates=sc.nextInt();
		System.out.println("Enter the number of students :");
		int students=sc.nextInt();
		find(choclates, students);
		}
		
	public static void find(int num, int div) {
			System.out.println("Each childer will get: "+ num/div);
			System.out.println("Remaining chocolates :"+num%div);
		}
}
