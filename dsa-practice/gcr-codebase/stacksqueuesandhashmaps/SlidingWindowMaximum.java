// Sliding Window Maximum
// Problem: Given an array and a window size k, find the maximum element in each sliding window of size k.
// Hint: Use a deque (double-ended queue) to maintain indices of useful elements in each window.


package stacksqueuesandhashmaps;

import java.util.*;

public class SlidingWindowMaximum {

    public static void findMax(int[] arr, int k) {
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            
            if (i >= k - 1) {
                System.out.print(arr[dq.peekFirst()] + " ");
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter window size k: ");
        int k = sc.nextInt();

        System.out.println("Sliding window maximums:");
        findMax(arr, k);

        
    }
}
