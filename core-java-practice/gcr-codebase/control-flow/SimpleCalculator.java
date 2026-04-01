// Write a program to create a calculator using switch...case.
// Hint => 
// Create two double variables named first and second and a String variable named op.
// Get input values for all variables.
// The input for the operator can only be one of the four values: "+", "-", "*" or "/".
// Run a for loop from i = 1 to i < number.
// Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
// If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
// If op is neither of those 4 values, print Invalid Operator.


import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take numbers as input
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter second number: ");
        double second = sc.nextDouble();
        //take operator as input
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        double result;

        //based on operator op perform the operation and print the result
        switch(op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/":
                if(second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                }else {
                    System.out.println("Division by zero error.");
                }
                break;
            default:
                
                System.out.println("Invalid Operator");
        }
    }
}
