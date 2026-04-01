//Employee Management System
//Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
//Tasks:
//Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
//Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager and programmingLanguage for Developer.
//Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.



package inheritance;
import java.util.Scanner;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
    	
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();//calls displayDetails of parent class 
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
	
    String language;

    Developer(String name, int id, double salary, String language) {
    	
        super(name, id, salary);
        this.language = language;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + language);
    }
}

class Intern extends Employee {
	
    int duration;

    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration + " months");
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1-Manager 2-Developer 3-Intern");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        
        System.out.println("Enter salary: ");
        double salary = sc.nextDouble();

        Employee emp;
        if (choice == 1) {
            System.out.print("Team size: ");
            int teamSize=sc.nextInt();
            emp = new Manager(name, id, salary, teamSize);
            
        }else if (choice == 2) {
            sc.nextLine();
            System.out.print("Language: ");
            String language=sc.next();
            emp = new Developer(name, id, salary, language);
            
        }else {
            System.out.print("Duration: ");
            int duration=sc.nextInt();
            emp = new Intern(name, id, salary, duration);
        }

        emp.displayDetails();
    }
}
