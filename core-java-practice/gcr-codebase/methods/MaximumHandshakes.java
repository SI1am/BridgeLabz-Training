//Create a program to find the maximum number of handshakes among students.
//Hint => 
//Get integer input for the numberOfStudents variable.
//Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
//Write a method to use the combination formulae to calculate the number of handshakes
//Display the number of possible handshakes.


package methods;

import java.util.*;
public class MaximumHandshakes {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        handshakes(numberOfStudents);
        
    }
	public static void handshakes(int n){
		int handShakes= (n * (n - 1)) / 2;
		System.out.println("The number of possible handshakes is: " + handShakes);
		
	}
}
