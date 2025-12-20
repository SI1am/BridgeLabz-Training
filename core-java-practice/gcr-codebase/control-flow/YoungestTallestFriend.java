// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
// Hint => 
// Take user input for the age and height of the 3 friends and store it in a variable
// Find the smallest of the 3 ages to find the youngest friend and display it
// Find the largest of the 3 heights to find the tallest friend and display it

import java.util.*;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];// array to save the ages
        double[] heights = new double[3];//creates array for saving the heights

        String[] names = {"Amar", "Akbar", "Anthony"};//saved the names of the friends in names array

        for (int i = 0; i < 3; i++) {

            System.out.print("Enter age of " +names[i]+ ": ");//takes ages as input
            ages[i] = sc.nextInt();
            System.out.print("Enter height (in cm) of " +names[i]+ ": ");
            heights[i] = sc.nextDouble();//takes height in input
        }
        int youngestIdx = 0;
        double tallestHeight = heights[0];
        int tallestIdx = 0;
        for (int i = 1; i < 3; i++) {//iterates over arrays 
            if(ages[i] < ages[youngestIdx]) youngestIdx = i;//checks for youngest
            if(heights[i] > tallestHeight) {//checks for tallest
                tallestHeight = heights[i];
                tallestIdx = i;
            }
        }
        System.out.println("Youngest: " +names[youngestIdx]);
        System.out.println("Tallest: " +names[tallestIdx]);
    }
}
