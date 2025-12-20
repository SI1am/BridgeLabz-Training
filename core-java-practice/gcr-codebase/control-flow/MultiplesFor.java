// Create a program to find all the multiples of a number taken as user input below 100.
// Hint => 
// Get the input value for a variable named number. Check the number is a positive integer and less than 100.
// Run a for loop backward: from i = 100 to i = 1.
// Inside the loop, check if i perfectly divide the number. If true, print the number and continue the loop.


import java.util.*;

public class MultiplesFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();//takes  positive number as input  which is less than 100

        if(number < 1 || number >= 100) { // if the number is not between 1-100 than print below message
            System.out.println("Please enter a positive integer less than 100.");
            return;


        }

        System.out.print("Multiples: ");
        for(int i = 100; i >= 1; i--) {
            //iterates and prints the divisible number
            if(i % number == 0) {
                System.out.print(i + " ");
            }

        }
        
    }
}
