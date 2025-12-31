package encapsulation;

import java.util.*;
interface Department {
	void assignDepartment(String deptName);
	String getDepartmentDetails();
}

// Abstract Employee Class
abstract class Employee implements Department {
	
	private int employeeId;
	private String name;
	private double baseSalary;
	private String department;
	
	// Constructor
	public Employee(int employeeId, String name, double baseSalary) {
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	// Encapsulated Getters & Setters
	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	// Abstract Method
	public abstract double calculateSalary();
	
	// Concrete Method
	public void displayDetails() {
		System.out.println("ID: " + employeeId + ", Name: " + name + ", Department: " + department + ", Salary: " + calculateSalary());
	}
	
	// Department Interface Methods
	public void assignDepartment(String deptName) {
		this.department = deptName;
	}
	
	public String getDepartmentDetails() {
		return department;
	}
}

class FullTimeEmployee extends Employee {
	private double bonus;
	
	public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
		super(employeeId, name, baseSalary);
		this.bonus = bonus;
	}
	
	@Override
	public double calculateSalary() {
		return getBaseSalary() + bonus;
	}
}

class PartTimeEmployee extends Employee {
	private int hoursWorked;
	private double hourlyRate;
	
	public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
		super(employeeId, name, 0); // Base salary not used for part-time
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public double calculateSalary() {
		return hoursWorked * hourlyRate;
	}
}



public class EmployeeManagement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("Enter number of employees to add: ");
		int n = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= n; i++) {
			System.out.println("\n--- Employee #" + i + " ---");
			System.out.print("Enter Employee Type (fulltime/parttime): ");
			String type = sc.nextLine().trim().toLowerCase();
			
			System.out.print("Employee ID: ");
			int id = Integer.parseInt(sc.nextLine());
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			if (type.equals("fulltime")) {
				System.out.print("Base Salary: ");
				double baseSalary = Double.parseDouble(sc.nextLine());
				
				System.out.print("Bonus: ");
				double bonus = Double.parseDouble(sc.nextLine());
				
				FullTimeEmployee ft = new FullTimeEmployee(id, name, baseSalary, bonus);
				
				System.out.print("Assign Department: ");
				String dept = sc.nextLine();
				ft.assignDepartment(dept);
				
				employees.add(ft);
				
			} else if (type.equals("parttime")) {
				System.out.print("Hourly Rate: ");
				double rate = Double.parseDouble(sc.nextLine());
				
				System.out.print("Hours Worked: ");
				int hours = Integer.parseInt(sc.nextLine());
				
				PartTimeEmployee pt = new PartTimeEmployee(id, name, rate, hours);
				
				System.out.print("Assign Department: ");
				String dept = sc.nextLine();
				pt.assignDepartment(dept);
				
				employees.add(pt);
			} else {
				System.out.println("Invalid employee type. Please try again.");
				i--; // repeat this iteration
			}
		}
		
		// Display employee details using polymorphism
		System.out.println("\n========= Employee Summary =========");
		for (Employee e : employees) {
			e.displayDetails();
		}
		
		sc.close();
		
	}
}