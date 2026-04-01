//Create a program to take input marks of students in 3 subjects: physics, chemistry, and maths. Compute the total, average, and the percentage score 
//
//Hint => 
//Take input for the number of students
//Write a method to generate random 2-digit scores for Physics, Chemistry, and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
//Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using the Math.round() method. 
//Finally, write a Method to display the scorecard of all students with their scores, total, average, and percentage in a tabular format using "\t". 

package methods;

import java.util.*;

public class StudentScoreCard {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of students: ");
		int students = sc.nextInt();
		
		int[][] scores = generateScores(students);
		
		double[][] result = calculateResults(scores);
		
		display(scores, result);
	}
	
	
	public static int[][] generateScores(int students) {
		
		Random rand = new Random();
		
		int[][] scores = new int[students][3];
		
		for (int i = 0; i < students; i++) {
			scores[i][0] = rand.nextInt(90) + 10; // Physics
			scores[i][1] = rand.nextInt(90) + 10; // Chemistry
			scores[i][2] = rand.nextInt(90) + 10; // Maths
		}
		
		return scores;
	}
	
	public static double[][] calculateResults(int[][] scores) {
		
		double[][] result = new double[scores.length][3];
		
		for(int i = 0; i < scores.length; i++) {
			
			int total =scores[i][0] + scores[i][1] + scores[i][2];
			double average =total / 3.0;
			double percentage =(total /300.0)*100;
			
			result[i][0] = total;
			result[i][1] = Math.round(average * 100.0) / 100.0;
			result[i][2] = Math.round(percentage * 100.0) / 100.0;
		}
		return result;
	}
	
	
	public static void display(int[][] scores, double[][] result) {
		System.out.println("\nID\tPhysics\tChem\tMaths\tTotal\tAvg\tPercent");
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" +	scores[i][2] + "\t" + result[i][0] + "\t" +	result[i][1] + "\t" + result[i][2]);
		}
	}
	
	
}
