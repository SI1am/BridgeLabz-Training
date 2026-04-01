//Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
//Hint => 
//Take the input for a number
//Find the count of digits in the number
//Find the digits in the number and save them in an array
//Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
//Display the frequency of each digit in the number


package arrays;

import java.util.Scanner;

public class DigitFrequency{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        while(temp != 0){
            count++;
            
            temp /= 10;
        }

        int[] digits = new int[count];
        int[] frequency = new int[10];

        for(int i = 0;i < count;i++){
            digits[i] = number % 10;
            number /= 10;
            
            frequency[digits[i]]++;
            
        }

        System.out.println("Digit Frequencies:");
        for(int i = 0; i < 10; i++){
            if(frequency[i] > 0){
            	
                System.out.println(i + " occurs " + frequency[i] + " times");
            }
        }
    }
}
