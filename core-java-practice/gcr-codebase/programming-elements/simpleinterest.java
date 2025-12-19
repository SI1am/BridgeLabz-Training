// package core-java-practice.gcr-codebase.programming-elements;
import java.util.*;

public class SimpleInterest {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Principal : ");
        int principal=sc.nextInt();
        System.out.println("Enter the Rate of Interest: ");
        int rate=sc.nextInt();
        System.out.println("Enter the Time: ");
        int time=sc.nextInt();
        System.out.println("The Simple interest is : " +(principal*rate*time)/100);
        sc.close();
    }
    
}