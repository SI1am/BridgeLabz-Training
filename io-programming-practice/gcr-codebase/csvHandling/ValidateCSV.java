package csvHandling;
import java.io.*;
import java.util.regex.Pattern;

public class ValidateCSV {
	public static void main (String[] args) {
		
		Pattern email = Pattern.compile("^[a-zA-Z0-9._+-]+@[a-zA-Z0-9-]+\\\\.[a-zA-Z.]{2,}$");
		Pattern number = Pattern.compile("[0-9]{10}");
		
		try(BufferedReader br = new BufferedReader(new FileReader("E:/flutter/csvHandling/src/csvhandling/csvFiles/user.csv"))){
			br.readLine();
			String line;
			
			while((line=br.readLine())!=null) {
				String [] s= line.split("\\t");
				if(!email.matcher(s[2]).matches()) {
					System.out.println("Email: "+s[2]+" doesn't match");
					
				}else {
					System.out.println("Email: "+s[2]+" is good");
					
				}
				if(!number.matcher(s[3]).matches()) {
					System.out.println("Number: "+s[3]+" doesn't match");
									
				}
				else {
					System.out.println("Number: "+s[3]+" is good");
					
				}
				
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
		
	}
}
