// Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 

// Hint => 
// Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks


import java.util.*;

public class SubjectGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //takes marks for different subjects as entry. 
        System.out.print("Enter marks for Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter marks for Maths: ");
        int maths = sc.nextInt();

        int total = physics + chemistry + maths;//saves total of all subjects

        double percentage = total / 3.0;

        String  remarks;

        //checks for the result and update the remark here
        if(percentage >= 80) {

            remarks = "Level 4, above agency-normalized standards";

        }else if (percentage >= 70) {
           
            remarks = "Level 3, at agency-normalized standards";
        }else if (percentage >= 60) {
            
            remarks = "Level 2, below, but approaching agency-normalized standards";
        }else if (percentage >= 50) {
            
            remarks = "Level 1, well below agency-normalized standards";
        }else if (percentage >= 40) {
            
            remarks = "Level 1-, too below agency-normalized standards";

        }else {
            
            remarks = "Remedial standards";

        }

        System.out.printf("Average Mark: %.2f\n",percentage);
        
        System.out.println("Remarks: " +remarks);
    }
}
