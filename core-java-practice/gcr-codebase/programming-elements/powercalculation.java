// package core-java-practice.gcr-codebase.programming-elements;

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the base number :");
        int number= s.nextInt();
        System.out.println("Enter the exponent :");
        
        int exponent= s.nextInt();
        System.out.println("The result is: "+ Math.pow(number,exponent));
        s.close();
    }
    
}
