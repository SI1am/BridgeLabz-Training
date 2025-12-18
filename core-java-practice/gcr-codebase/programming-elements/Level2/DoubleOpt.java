package Level2;


import java.util.Scanner;
public class DoubleOpt {
public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double a=sc.nextDouble();
		System.out.println("Enter the second number: ");
		double b=sc.nextDouble();
		System.out.println("Enter the third number: ");
		double c=sc.nextDouble();
		double ans1=a+b*c;
		double ans2=a*b+c;
		double ans3=c+a/b;
		double ans4=a%b+c;
		
		System.out.println("The results of IntOperations are " +ans1+", "+ ans2+", "+ ans3+" and " +ans4);
		
	}
}