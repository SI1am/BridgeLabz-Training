package Extras;

import java.util.*;

public class GcdLcm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers\n");
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        
        int a=number1;
        int b=number2;
        
        int gcd = findGCD(a, b);
        int lcm = findLCM(a, b, gcd);

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }

    public static int findGCD(int a, int b) {
    	
        if (b == 0) return a;
        return findGCD(b, a % b);
    }

    public static int findLCM(int a, int b, int gcd) {
    	
        return (a * b) / gcd;
    }
}
