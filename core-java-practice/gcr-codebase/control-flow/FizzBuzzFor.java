// Write a program FizzBuzz, take a number as user input, and check for a positive integer. If positive integer, loop and print the number, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".
// Hint => 
// Take the user input number, check for a positive integer, and use for loop to display


import java.util.*;

public class FizzBuzzFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");//takes positive number as input
        int number = sc.nextInt();
        if (number < 1) {
            System.out.println("Please enter a positive integer.");//checks if the user input is positive or not
            return;

        }
        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0) {//checks if  the numebr is divisible by 15 
                System.out.println("FizzBuzz");

            }else if (i % 3 == 0) {//checks if the number is divisible by 3 only
                System.out.println("Fizz");
                
            }else if (i % 5 == 0) {//checks if the  number is divisible by 5 only
                System.out.println("Buzz");

            }else {
                System.out.println(i);//else just prints the number
                
            }
        }
    }
}
