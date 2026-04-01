package Level1;
import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The number of possible handshakes is: " + handshakes);
        
    }
}
