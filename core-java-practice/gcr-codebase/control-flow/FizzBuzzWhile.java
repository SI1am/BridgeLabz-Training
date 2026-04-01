// Write a program FizzBuzz, take a number as user input, and check for a positive integer. If positive integer, loop and print the number, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".
// Hint => 
// Take the user input number, check for a positive integer, and use While loop to display

import java.util.*;

public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");//take a number as input

        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("Please enter a positive integer.");//checks if its positive or not and if not prints this meassage and returns the code
            return;

        }
        int i = 1;
        while (i <= number) {
            if(i % 3 == 0 && i % 5 == 0) {//checks the divisibility with 15
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0) {
                System.out.println("Fizz");//check divisibility with 3
            }else if (i % 5 == 0) {
                System.out.println("Buzz");//checks divisibility with 5
            }else {
                System.out.println(i);//else prints the number as output
            }
            i++;
        }
    }
}
