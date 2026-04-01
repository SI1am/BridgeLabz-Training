// Binary Search Problem 2: Find the Peak Element in an Array
// Problem:
// A peak element is an element that is greater than its neighbors. Write a program that performs Binary Search to find a peak element in an array. If there are multiple peak elements, return any one of them.
// Approach:
// Initialize left as 0 and right as n - 1.
// Perform a binary search:
// Find the middle element mid = (left + right) / 2.
// If arr[mid] > arr[mid - 1] and arr[mid] > arr[mid + 1], arr[mid] is a peak element.
// If arr[mid] < arr[mid - 1], then search the left half, updating right = mid - 1.
// If arr[mid] < arr[mid + 1], then search the right half, updating left = mid + 1.
// Continue until a peak element is found.


import java.util.*;

public class PeakElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0;i<n; i++)
            arr[i] = sc.nextInt();

        int left = 0, right = n-1;

        while (left <= right) {
            int mid = (left + right) / 2;

            boolean leftOk = mid == 0 || arr[mid] > arr[mid - 1];
            boolean rightOk = mid == n - 1 || arr[mid] > arr[mid + 1];

            if (leftOk && rightOk) {
                System.out.println("Peak element: " + arr[mid]);
                return;
            }

            if (mid > 0 && arr[mid] < arr[mid - 1])
                right = mid - 1;
            else
                left = mid + 1;
        }
    }
}
