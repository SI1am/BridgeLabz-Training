// package core-java-practice.gcr-codebase.programming-elements;
import java.util.Scanner;
public class AddTwoNums {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 =sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 =sc.nextInt();

        System.out.println("The Sum of both the numbers is: "+ (num1+num2));
        sc.close();
    }

    
}
