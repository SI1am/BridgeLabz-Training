// StringBuilder Problem 2: Remove Duplicates from a String Using StringBuilder
// Problem:
// Write a program that uses StringBuilder to remove all duplicate characters from a given string while maintaining the original order.
// Approach:
// Initialize an empty StringBuilder and a HashSet to keep track of characters.
// Iterate over each character in the string:
// If the character is not in the HashSet, append it to the StringBuilder and add it to the HashSet.
// Return the StringBuilder as a string without duplicates.
import java.util.*;

public class RemoveDuplicatesSB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (!set.contains(c)) {
                sb.append(c);
                set.add(c);
            }
        }

        System.out.println("After removing duplicates: " + sb.toString());
    }
}
