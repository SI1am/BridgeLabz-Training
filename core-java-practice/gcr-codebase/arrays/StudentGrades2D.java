//Rewrite the above program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade
//Hint => 
//All the steps are the same as the problem 8 except the marks are stored in a 2D array
//Use the 2D array to calculate the percentages, and grades of the students


package arrays;

import java.util.Scanner;

public class StudentGrades2D{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for(int i = 0; i < n; i++){
            System.out.print("Physics: ");
            marks[i][0] = sc.nextDouble();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextDouble();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextDouble();

            if(marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0){
                System.out.println("Invalid marks. Enter again.");
                i--;
                continue;
                
            }

            percentage[i] =(marks[i][0]+marks[i][1]+marks[i][2])/3;

            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 75)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else
                grade[i] = 'D';
        }

        for(int i = 0; i < n; i++){
            System.out.println(percentage[i]+"% Grade: " +grade[i]);
        }
    }
}
