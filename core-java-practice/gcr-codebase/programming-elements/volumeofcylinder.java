// package core-java-practice.gcr-codebase.programming-elements;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the redius for cylinder : ");
        int radiusOfCylinder=sc.nextInt();
        System.out.println("Enter the height for cylinder : ");
        int height=sc.nextInt();
        System.out.println("The Volume of cylinder is : "+ (3.14*radiusOfCylinder*radiusOfCylinder)*height);
        sc.close();
    }
    
}
