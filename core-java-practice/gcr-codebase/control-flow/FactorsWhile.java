// Rewrite the above program 7 to find the factors of a number using the while loop
// Hint => 
// Get the input value for a variable named number and check if it is a positive integer.
// Create a counter variable and run the _**while**_ loop till the counter is less than the user input number. In each iteration of the loop, check if the number is perfectly divisible by the counter. If true, print the value of the counter.

import java.util.*;

public class FactorsWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");//takes number as input

        int number = sc.nextInt();
        if (number < 1) {
            System.out.println("Please enter a positive integer.");//check if the number is postive or not
            return;
        }
        int i = 1;
        System.out.print("Factors: ");

        while(i < number) {//iterates and check if the i is factor for number or not and prints if it is factor
            if(number % i == 0) {
                
                System.out.print(i+" ");
            }
            i++;
        }

    }
}
