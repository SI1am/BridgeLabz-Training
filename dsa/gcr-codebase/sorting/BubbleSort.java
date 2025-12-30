// 1. Bubble Sort - Sort Student Marks
// Problem Statement:
// A school maintains student marks in an array. Implement Bubble Sort to sort the student marks in ascending order.
// Hint:
// Traverse through the array multiple times.
// Compare adjacent elements and swap if needed.
// Repeat the process until no swaps are required.


import java.util.*;

class BubbleSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        System.out.println("Enter student marks:");

        for (int i = 0; i < n; i++) {
            
            marks[i] = sc.nextInt();

        }

        
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1 - i; j++) {

                if(marks[j] > marks[j + 1]) {

                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Marks (Ascending):");
        
        for (int m : marks) {
            System.out.print(m + " ");
        }
    }
}
