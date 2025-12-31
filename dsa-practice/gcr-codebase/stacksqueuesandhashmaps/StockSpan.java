// // 
// Stock Span Problem
// Problem: For each day in a stock price array, calculate the span (number of consecutive days the price was less than or equal to the current day's price).
// Hint: Use a stack to keep track of indices of prices in descending order.

package stacksqueuesandhashmaps;

import java.util.*;

public class StockSpan {

    public static void calculateSpan(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] span = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }

        System.out.println("Stock spans:");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter stock prices:");

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        calculateSpan(prices);
        
    }
}
