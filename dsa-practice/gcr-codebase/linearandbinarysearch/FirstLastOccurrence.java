// Binary Search Problem 4: Find the First and Last Occurrence of an Element in a Sorted Array
// Problem:
// Given a sorted array and a target element, write a program that uses Binary Search to find the first and last occurrence of the target element in the array. If the element is not found, return -1.
// Approach:
// Use binary search to find the first occurrence:
// Perform a regular binary search, but if the target is found, continue searching on the left side (right = mid - 1) to find the first occurrence.
// Use binary search to find the last occurrence:
// Similar to finding the first occurrence, but once the target is found, continue searching on the right side (left = mid + 1) to find the last occurrence.
// Return the indices of the first and last occurrence. If not found, return -1.


import java.util.*;

public class FirstLastOccurrence {
    static int find(int[] arr, int target, boolean first) {
        int left = 0, right = arr.length - 1, ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (first) right = mid - 1;
                else left = mid + 1;
            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int target = sc.nextInt();

        System.out.println("First: " + find(arr, target, true));
        System.out.println("Last: " + find(arr, target, false));
    }
}
