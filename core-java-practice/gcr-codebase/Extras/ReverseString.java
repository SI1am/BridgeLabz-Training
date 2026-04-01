package extras;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Text : ");
		String text=sc.next();
		String revText=reverse(text);
		System.out.println("Entered Text: "+text);
		System.out.println("Reversed Text : "+revText);
		
	}
	
	public static String reverse(String text) {
		String ans="";
		for(int i=text.length()-1;i>=0;i--) {
			
			ans=ans+text.charAt(i);
		}
		return ans;
		
		
	}
}
