//Problem 2: Online Course Management
//Design a Course class with:
//Instance Variables: courseName, duration, fee.
//Class Variable: instituteName (common for all courses).
//Methods:
//An instance method displayCourseDetails() to display the course details.
//A class method updateInstituteName() to modify the institute name for all courses.

package instancesAccessModifiers;

import java.util.Scanner;

class Course {
	
    String courseName;
    int duration;
    double fee;
    static String instituteName = "BridgeLabz";
    

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    

    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
    }

    
    public static void updateInstituteName(String newName) {
    	
        instituteName = newName;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Institue name \n");
        String newName=sc.nextLine();
        updateInstituteName(newName);
        

        System.out.print("Enter course name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter duration (months): ");
        int duration = sc.nextInt();
        
        System.out.print("Enter fees: ");
        double fee = sc.nextDouble();

        Course course = new Course(name, duration, fee);
        course.displayCourseDetails();
    }
}
