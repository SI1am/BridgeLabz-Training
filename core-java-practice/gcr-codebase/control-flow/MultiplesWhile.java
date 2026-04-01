// Rewrite the program to find all the multiples of a number below 100 using while loop.
// Hint => 
// Get the input value for a variable named number. Check the number is a positive integer and less than 100.
// Create a counter variable and assign counter = number - 1; Use a while till the counter is > 1
// Inside the loop, check if the counter perfectly divides the number. If true, print the number and continue the loop.

import java.util.*;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();//takes a positive number as input

        if(number < 1 || number >= 100) {//checks if the number is between 1-100 or not
            System.out.println("Please enter a positive integer less than 100.");
            return;

        }
        int counter = 100;
        System.out.print("Multiples: ");

        while(counter >= 1) {
            if(counter%number == 0) {//iterates and prints the ans
                System.out.print(counter+ " ");
            }

            counter--;
        }
        
    }
}
