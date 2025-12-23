package Extras;
import java.util.*;

public class MostFrequentCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        char result = mostFrequentChar(str);
        System.out.println("Most Frequent Character: '" + result + "'");
    }

    public static char mostFrequentChar(String str) {
        int[] freq = new int[256];
        int max = 0;
        char res = ' ';

        for (int i = 0; i < str.length(); i++) {
        	
            char ch = str.charAt(i);
            
            freq[ch]++;
            
            if (freq[ch] > max) {
                max = freq[ch];
                res = ch;
                
            }
        }
        
        return res;
    }
}
