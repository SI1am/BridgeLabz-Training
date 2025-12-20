// Create a program to find the power of a number.
// Hint => 
// Get integer input for two variables - number and power and check for positive integer
// Create a result variable with an initial value of 1.
// Run a for loop from i = 1 to i <= power. In each iteration of the loop, multiply the result by the number and assign the value to the result. Finally, print the result

import java.util.*;

public class PowerFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();//take a number as input

        System.out.print("Enter the power: ");
        int power = sc.nextInt();//take the power for above number as input

        if (power < 0) {//if power is less than zero print the message  and return 
            System.out.println("Please enter a non-negative power.");
            return;

        }

        int result = 1;

        for (int i = 1; i <= power; i++) {//iterates and find the result 
            result *= number;

        }
        
        System.out.println(number + "^" + power + " = " + result);
    }
}
