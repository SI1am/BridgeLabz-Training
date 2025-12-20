// Create a program to check if a number is armstrong or not. Use the hints to show the steps clearly in the code
// Hint => 
// Armstrong Number is a number whose Sum of cubes of each digit results in the original number as in for e.g. 153 = 1^3 + 5^3 + 3^3
// Get an integer input and store it in the number variable and define sum variable, initialize it to zero and originalNumber variable and assign it to input number variable
// Use the while loop till the originalNumber is not equal to zero
// In the while loop find each digit which is the reminder of the modulus operation number % 10. Find the cube of the number and add it to the sum variable
// Again in while loop find the quotient of the number using the division operation number/10 and assign it to the original number. This removes the last digit of the original number.
// Finally check if the number and the sum are the same, if same its an Armstrong number else not. So display accordingly


import java.util.*;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        //takes a number as input
        int number = sc.nextInt();
        //saves a copy and take a sum variable
        int sum =0, originalNumber =number;

        while(originalNumber != 0) {
            //calculates for the Armstrong number
            int digit = originalNumber % 10;

            sum += Math.pow(digit, 3);

            originalNumber /= 10;
        }
        //checks if the number is armstrong or not

        if(sum==number) {
            System.out.println(number + " is an Armstrong Number.");

        }else{
            System.out.println(number + " is not an Armstrong Number.");
            
        }
    }
}
