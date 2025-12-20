//Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
//Hint => 
//Take user input for a number. 
//Find the count of digits in the number. 
//Find the digits in the number and save them in an array
//Create an array to store the elements of the digits array in reverse order
//Finally, display the elements of the array in reverse order  


package arrays;

import java.util.Scanner;

public class ReverseNumber{
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
        int[] reverse = new int[count];

        for(int i = 0;i < count;i++){
            digits[i] = number % 10;
            
            number /= 10;
        }

        for(int i = 0;i<count;i++){
            reverse[i] = digits[count - 1 - i];
            
        }

        System.out.print("Reversed Number: ");
        for(int i = 0;i< count;i++){
            System.out.print(reverse[i]);
            
        }
    }
}
