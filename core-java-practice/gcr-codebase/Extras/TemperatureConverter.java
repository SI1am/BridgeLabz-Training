package Extras;

import java.util.*;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter Temperature in Celsius: ");
            double c = sc.nextDouble();
            
            System.out.println("Fahrenheit: " + celciusToFahrenheit(c));
        } else {
            System.out.print("Enter Temperature in Fahrenheit: ");
            double f = sc.nextDouble();
            
            System.out.println("Celsius: " +  fahrenheitToCelcius(f));
        }
    }

    public static double celciusToFahrenheit(double c) {
        return (c*9 / 5)+32;
    }

    public static double fahrenheitToCelcius(double f) {
        return (f - 32)*5/9;
    }
}
