package extras;

import java.util.*;

public class AnagramCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        if(isAnagram(s1, s2))
            System.out.println("Strings are Anagrams");
        else
            System.out.println("Strings are NOT Anagrams");
    }

    public static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        int[] count=new int[256];
        
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] != 0)
                return false;
        }
        return true;
    }
}
