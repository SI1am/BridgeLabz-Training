// Rewrite the above program to find the power of a number using a while loop.
// Hint => 
// Get integer input for two variables named number and power.
// Create a result variable with an initial value of 1.
// Create a temp variable counter and initialize to zero. Use the while loop till _**counter == power**_.
// In each iteration of the loop, multiply the result by the number and assign the value to the result. Also, increment the counter.
// Finally, print the result


import java.util.*;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();// takes a number  as input

        System.out.print("Enter the power: ");
        int power = sc.nextInt();//takes power for the number as input

        if (power < 0) {//checks  if the power is positive or not
            System.out.println("Please enter a non-negative power.");

            return;
        }

        int result = 1;
        int counter = 0;

        while (counter < power) {//iterates and calculates the result
            result *= number;
            counter++;
        }
        System.out.println(number + "^" + power + " = " + result);
    }
}
