package timeandspacecomplexity;

import java.util.*;
public class FibonacciComparison {

    public static int fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public static int fibIterative(int n) {
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter  number to see fibonacci: ");
        int number= sc.nextInt();

        long start = System.nanoTime();
        fibIterative(number);
        long end = System.nanoTime();
        System.out.println("Iterative Time: " +(end-start)/1_000_000.0+" ms");

        start = System.nanoTime();
        fibRecursive(number);
        end = System.nanoTime();
        System.out.println("Recursive Time: " +(end-start)/1_000_000.0+" ms");
    }
}
