
// package classesandobjects;

import java.util.*;
public class Employee {
	
	String name;	
	int id;
	double salary;
	
	public Employee(String name, int id, double salary) {
		this.name =  name;
		this.id = id;		
		this.salary = salary    
				;
	}
	
	public void displayDetails() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee ID: " + id);		
		System.out.println("Salary: " + salary);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner ( System.in);
		
		System.out.println("Enter employee name: ");		
		String name = sc. nextLine();		
		
		System.out.println("Enter employee ID: ");		
		int id = sc.nextInt();
		
		System.out.println("Enter salary: ");
		double salary = sc.nextDouble();
		
		Employee emp = new Employee(name, id, salary);		
		emp.displayDetails();
		
	}
	
	
}