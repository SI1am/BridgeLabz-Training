// Create a program to find the factors of a number taken as user input.
// Hint => 
// Get the input value for a variable named number and check if it is a positive integer.
// Run a for loop from i = 1 to i < number. In each iteration of the loop, check if the number is perfectly divisible by i. If true, print the value of i.

import java.util.*;

public class FactorsFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");//takes number as input
        int number = sc.nextInt();

        if(number < 1) {
            System.out.println("Please enter a positive integer.");//checks if the number is positive or not
            return;

        }
        System.out.print("Factors: ");
        for(int i = 1; i < number; i++) {//iterates from 1-number and look if the current number is factor or not
            if(number % i == 0) {

                System.out.print(i+" ");

            }
        }
        
    }
}
