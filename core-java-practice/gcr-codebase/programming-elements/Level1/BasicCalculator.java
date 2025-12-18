package Level1;
import java.util.Scanner;
public class BasicCalculator{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number :");
        float num1=input.nextFloat();
        System.out.println("Enter the second number :");
        float num2=input.nextFloat();
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+num1+ " and "+ num2 +" is "+(num1+num2)+ ", "+Math.abs(num1-num2)+", "+(num1*num2)+ " and " +(num1/num2) );

    }
}