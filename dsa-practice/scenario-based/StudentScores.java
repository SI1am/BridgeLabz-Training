import java.util.*;

public class StudentScores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;


        while (true) {
            System.out.print("Enter number of students: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) break;
                else System.out.println("Number of students must be positive.");
            } else {
                System.out.println("Invalid input. Enter a number.");
                sc.next(); 
            }
        }

        int[] scores = new int[n];


        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter score for student " + (i + 1) + ": ");
                if (sc.hasNextInt()) {
                    int score = sc.nextInt();
                    if (score >= 0) {
                        scores[i] = score;
                        break;
                    } else {
                        System.out.println("Score cannot be negative.");
                    }
                } else {
                    System.out.println("Invalid input. Enter a numeric value.");
                    sc.next();
                }
            }
        }


        double sum = 0;
        int highest = scores[0];
        int lowest = scores[0];

        for (int score : scores) {
            sum += score;
            if (score > highest) highest = score;
            if (score < lowest) lowest = score;
        }

        double average = sum / n;


        System.out.println("\nAverage Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);

        System.out.println("Scores above average:");
        boolean found = false;
        for (int score : scores) {
            if (score > average) {
                System.out.print(score + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        }


    }
}
