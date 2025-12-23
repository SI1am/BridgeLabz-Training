package extras;
import java.util.*;
public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter first text: ");
		String str1=sc.next();
		
		System.out.print("Enter second text: ");
		String str2=sc.next();
		
		String result[] = compare(str1,str2);
		System.out.println(result[0]+" comes before "+ result[1]+" in lexicographical order ");
				
		
	}
	
	public static String[] compare(String str1, String str2) {
	    String[] result = new String[2];

	    int len1 = str1.length();
	    int len2 = str2.length();
	    int minLen = len1 < len2 ? len1 : len2;

	    for (int i = 0; i < minLen; i++) {
	        if (str1.charAt(i) < str2.charAt(i)) {
	            result[0] = str1;
	            result[1] = str2;
	            return result;
	        } 
	        else if (str1.charAt(i) > str2.charAt(i)) {
	            result[0] = str2;
	            result[1] = str1;
	            return result;
	        }
	    }

	    // If all characters matched so far
	    if (len1 <= len2) {
	        result[0] = str1;
	        result[1] = str2;
	    } else {
	        result[0] = str2;
	        result[1] = str1;
	    }

	    return result;
	}


}
