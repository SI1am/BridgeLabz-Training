//Level 1 Practice Programs
//Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
//Hint => 
//Define an array of 10 integer elements and take user input for the student's age. 
//Loop through the array using the length property and for the element of the array check If the age is a negative number print an invalid age and if 18 or above, print The student with the age ___ can vote. Otherwise, print The student with the age ___ cannot vote. 


package arrays;


import java.util.*;
public class CanVoteOrNotArrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the age of students : ");
		int[] age= new int[10];
		//take ages of students a input
		for(int i=0; i<10;i++)
			age[i]=input.nextInt();
		
		
			
		for(int i=0; i<10;i++) {
			if(age[i]<0) 
				System.out.println("Invalid Age ");
			else if(age[i]>=18)//evaluate if he can vote or not
				System.out.println("The  student with the "+age[i]+ " can vote.");
			else
				System.out.println("The student with the "+age[i]+ " cannot vote.");
				
		}
		
	}

}

