package keywords;

public class Company {

	   // Static variable shared by all employees
	   private static String companyName;
	   private static int totalEmployees = 0;
	   

	   // Instance variables
	   private String name;
	   private final int id; // Employee ID cannot be modified
	   private String designation;

	   // Constructor
	   public Company(String name, int id, String designation) {
	       this.name = name;
	       this.id = id;
	       this.designation = designation;
	       totalEmployees++;
	   }

	   // Static method to set the company name
	   public static void setCompanyName(String name) {
	       companyName = name;
	   }

	   // Static method to display total employees
	   public static void displayTotalEmployees() {
	       System.out.println("Total Employees: " + totalEmployees);
	   }

	   // Method to display employee details
	   public void displayEmployeeDetails() {
	       if (this instanceof Company) {
	           System.out.println("Company Name: " + companyName);
	           System.out.println("Employee ID: " + id);
	           System.out.println("Name: " + name);
	           System.out.println("Designation: " + designation);
	           System.out.println("---------------------------");
	       }
	   }

	   // Getters
	   public String getName() {
	       return name;
	   }

	   public int getId() {
	       return id;
	   }

	   public String getDesignation() {
	       return designation;
	   }

	   public static void main(String[] args) {

	       // Set the company name
	       Company.setCompanyName("BridgeLabz India Pvt Ltd");

	       // Create employee instances (Indian names)
	       Company emp1 = new Company("Amit Sharma", 101, "Software Engineer");
	       Company emp2 = new Company("Priya Verma", 102, "Project Manager");
	       Company emp3 = new Company("Rahul Singh", 103, "QA Engineer");
	       Company emp4 = new Company("Sneha Iyer", 104, "Business Analyst");

	       // Display total number of employees
	       Company.displayTotalEmployees();

	       // Display employee details
	       emp1.displayEmployeeDetails();
	       emp2.displayEmployeeDetails();
	       emp3.displayEmployeeDetails();
	       emp4.displayEmployeeDetails();
	   }
	}
