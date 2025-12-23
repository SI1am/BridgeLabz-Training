package Extras;

import java.util.*;

public class FactorialRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        
        System.out.println("Factorial: " + factorial(number));
    }

    public static int factorial(int num) {
    	
        if (num == 0) return 1;
        return num * factorial(num - 1);
    }
}
