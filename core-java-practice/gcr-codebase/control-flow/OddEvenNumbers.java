// Create a program to print odd and even numbers between 1 to the number entered by the user.
// Hint => 
// Get an integer input from the user, assign to a variable number and check for Natural Number
// Using a for loop, iterate from 1 to the number
// In each iteration of the loop, print the number is odd or even number

import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //takes input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if (number < 1) {//checks if the number is natural or not
            System.out.println("Please enter a natural number greater than 0.");
            return;
        }
        for (int i = 1; i <= number; i++) {//iterates and prints output
            if (i % 2 == 0) {
                System.out.println(i + " is even number");
            }else {
                System.out.println(i + " is odd number");
            }
        }
    }
}
