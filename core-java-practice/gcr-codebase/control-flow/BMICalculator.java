// Create a program to find the BMI of a person
// Hint => 
// Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding variable.
// Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
// Use the table to determine the weight status of the person

import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");//takes weight as input
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");//takes height as input
        double heightCm = sc.nextDouble();

        double heightM = heightCm / 100.0;//calculates height in meters
        
        double bmi = weight/(heightM * heightM);//calculates the bmi

        System.out.printf("BMI: %.2f\n", bmi);
        String status;

        //evalutes status and updates it
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";
        
        //prints result
        System.out.println("Weight Status: " +status);
    }
}
