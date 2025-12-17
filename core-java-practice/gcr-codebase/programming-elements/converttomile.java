// package core-java-practice.gcr-codebase.programming-elements;

import java.util.Scanner;

public class converttomile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the distance in Kilometers: ");
        int dis=sc.nextInt();
        System.out.println("The distance in Miles: "+ (0.621371*dis));
        sc.close();
    }
    
}
