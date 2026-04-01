package extras;
import java.util.*;
public class ToggleCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a text: ");
		String text=sc.nextLine();
		
		String toggled=toggledString(text);
		System.out.println("Entered Text : "+text);
		System.out.println("Toggled Text : "+toggled);

		
	}
	public static String toggledString(String str) {
		String ans="";
		for(int i=0; i<str.length();i++) {
			char ch= str.charAt(i);
			
			if(ch>='A' && ch<='Z') {
				ch=(char)(ch+32);
			}
			
			if(ch>='a' && ch<='z') {
				ch=(char)(ch-32);
			}
			
			ans+=ch;
			
		}
		
		return ans;
	}

}
