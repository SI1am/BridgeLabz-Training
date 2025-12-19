// package controlFlow;

import java.util.Scanner;
public class EmployeBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of year: ");//Takes numberof years as input
		int years=input.nextInt();
		System.out.println("Enter the Salary of Employee : ");//Takes the salary as input
		int salary=input.nextInt();
		
		double bonus;
		if(years>=5) {
			bonus=(.05*salary);
			System.out.println("Employe has completed "+years+" years and his bonus amount is  "+bonus);
		}else {
			System.out.println("No bonus");
			
		}
		

	}



}
