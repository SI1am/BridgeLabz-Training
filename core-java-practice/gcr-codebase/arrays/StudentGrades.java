//Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade  as per the following guidelines 
//
//Hint => 
//Take input for the number of students
//Create arrays to store marks, percentages, and grades of the students
//Take input for marks of students in physics, chemistry, and maths. If the marks are negative, ask the user to enter positive values and decrement the index
//Calculate the percentage and grade of the students based on the percentage
//Display the marks, percentages, and grades of each student


package arrays;


import java.util.Scanner;

public class StudentGrades{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] percentage = new double[n];
        char[] grade = new char[n];

        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];

        for(int i = 0;i < n;i++){
            System.out.print("Physics: ");
            physics[i] = sc.nextDouble();

            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextDouble();

            System.out.print("Maths: ");
            maths[i] = sc.nextDouble();

            if(physics[i]< 0 || chemistry[i]<0 || maths[i]<0){
                System.out.println("Invalid marks. Enter again.");
                
                i--;
                continue;
            }

            percentage[i] = (physics[i]+chemistry[i]+maths[i])/3;

            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 75)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else
                grade[i] = 'D';
        }

        for(int i = 0;i < n;i++){
        	
            System.out.println(percentage[i] + "% Grade: " + grade[i]);
        }
    }
}
