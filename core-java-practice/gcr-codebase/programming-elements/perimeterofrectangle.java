// package core-java-practice.gcr-codebase.programming-elements;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int length=sc.nextInt();
        System.out.println("Enter the breath : ");
        int width=sc.nextInt();
        System.out.println("Perimeter for the Rectangle is :" + 2*(length+width));
    }
}
