// package core-java-practice.gcr-codebase.programming-elements;

import java.util.Scanner;

public class powercalculation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the base number :");
        int num= s.nextInt();
        System.out.println("Enter the exponent :");
        
        int expo= s.nextInt();
        System.out.println("The result is: "+ Math.pow(num,expo));
        s.close();
    }
    
}
