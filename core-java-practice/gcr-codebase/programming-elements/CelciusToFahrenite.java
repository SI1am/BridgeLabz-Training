// package core-java-practice.gcr-codebase.programming-elements;

import java.util.Scanner;

public class CelciusToFahrenite {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temprature in Celcius:");
        int temprature=sc.nextInt();
        System.out.println("The temprature in Fahrenite is :" + ((temprature*9/5)+32));
        sc.close();
    }
}
