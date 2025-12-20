// Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 
// Hint => 
// The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. So ensure to check for the same. 
// Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400. E.g. 1800 is not a Leap Year and 2000 is a Leap Year.
// Write code having multiple if else statements based on conditions provided above and a second part having only one if statement and multiple logical 

// Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators

import java.util.*;

public class LeapYearUsingSingleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();//takes year as input


        if(year >=1582 && ((year%4==0 && year%100 != 0) || (year%400== 0))) {//checks for leap year and prints it
            System.out.println(year + " is a Leap Year.");

        }else if(year < 1582) {//checks if the year lies in the stated timeline 

            System.out.println("Year must be 1582 or later  (Gregorian calendar). ");
            
        }else{//else its not a leap year
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
