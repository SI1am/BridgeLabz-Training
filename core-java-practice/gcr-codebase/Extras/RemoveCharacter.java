package extras;
import java.util.*;

public class RemoveCharacter {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter string: ");
        String str =sc.nextLine();

        System.out.print("Enter character to remove: ");
        char remove =sc.next().charAt(0);

        String result =removeChar(str, remove);
        System.out.println("Entered String: " + str);
        System.out.println("Modified String: " + result);
    }

    static String removeChar(String str, char ch) {
        String ans ="";
        
        for(int i = 0; i < str.length(); i++) {
        	
            if(str.charAt(i) != ch) {
                ans += str.charAt(i);
            }
            
        }
        return ans;
        
    }
}
