// 2. Insertion Sort - Sort Employee IDs
// Problem Statement:
// A company stores employee IDs in an unsorted array. Implement Insertion Sort to sort the employee IDs in ascending order.
// Hint:
// Divide the array into sorted and unsorted parts.
// Pick an element from the unsorted part and insert it into its correct position in the sorted part.
// Repeat for all elements.

import java.util.*;

class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] ids = new int[n];
        System.out.println("Enter employee IDs:");
        for (int i = 0; i < n; i++) {
            ids[i] = sc.nextInt();
        }

        // Insertion Sort
        for(int i = 1; i < n; i++){
            
            int key = ids[i];
            int j = i - 1;

            while(j >= 0 && ids[j] > key){

                ids[j + 1] = ids[j];
                j--;
            }
            ids[j + 1] = key;
        }

        System.out.println("Sorted Employee IDs:");

        for (int id : ids) {
            System.out.print(id + " ");
        }
    }
}
