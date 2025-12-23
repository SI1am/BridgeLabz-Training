package Extras;

import java.util.*;

public class PalindromeChecker {

    public static void main(String[] args) {
        String input = takeInput();
        
        if (isPalindrome(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }

    public static String takeInput() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        
        return sc.nextLine();
    }

    public static boolean isPalindrome(String s) {
    	
        s = s.replaceAll(" ", "").toLowerCase();//this will ensure that no unecessary spaces make the issue in evaluation by normalizing it to lowercase and removing spaces
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
