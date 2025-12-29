// Two Sum Problem
// Problem: Given an array and a target sum, find two indices such that their values add up to the target.
// Hint: Use a hash map to store the index of each element as you iterate. Check if target - current_element exists in the map.


package stacksqueuesandhashmaps;
import java.util.*;

public class TwoSumProblem {

    public static int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];

            
            if (map.containsKey(remaining)) {
                return new int[] { map.get(remaining), i };
            }

            
            map.put(nums[i], i);
        }

        
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        
        int[] result = twoSum(nums, target);

        
        if (result[0] != -1) {
            System.out.println("Indices found: " + result[0] + " and " + result[1]);
            System.out.println("Values are: " + nums[result[0]] + " + " + nums[result[1]]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }
    }
}
