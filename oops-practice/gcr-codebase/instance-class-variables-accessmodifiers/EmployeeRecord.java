package instancesAccessModifiers;
import java.util.Scanner;

class EmployeeRecord {
	
    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
        
    }

    public double getSalary() {
    	
        return salary;
    }
}

class Manager extends EmployeeRecord {
	
    void display() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Manager manager = new Manager();

        System.out.print("Enter employee ID: ");
        manager.employeeID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter department: ");
        manager.department = sc.nextLine();

        System.out.print("Enter salary: ");
        manager.setSalary(sc.nextDouble());

        manager.display();
        sc.close();
    }
}
