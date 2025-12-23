package extras;

import java.util.*;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        
        System.out.println("Enter first numbers: ");
        double a = sc.nextDouble();
        System.out.println("Enter second numbers: ");
        double b = sc.nextDouble();

        System.out.println("Choose operation: + - * /");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println(add(a, b)); break;
            
            case '-': System.out.println(subtract(a, b)); break;
            
            case '*': System.out.println(multiply(a, b)); break;
            
            case '/': System.out.println(divide(a, b)); break;
            
            default: System.out.println("Invalid operation");
        }
    }

    public static double add(double a, double b) {
    	return a + b; 
    }
    
    public static double subtract(double a, double b) {
    	return a - b;
    }
    
    public static double multiply(double a, double b) {
    	return a * b;
    }
    
    public static double divide(double a, double b) { 
    	return b != 0 ? a / b : 0; 
    }
    
}

