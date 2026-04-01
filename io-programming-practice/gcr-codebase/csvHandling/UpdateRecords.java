package csvHandling;
import java.io.*;

public class UpdateRecords {
	public static void main (String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("E:/flutter/csvHandling/src/csvhandling/csvFiles/employee.csv"))){
			FileWriter fw = new FileWriter("E:/flutter/csvHandling/src/csvhandling/csvFiles/employees.csv");
			
			fw.write(br.readLine() + "\n");
			String line;
			while((line=br.readLine())!=null) {
				String [] s = line.split(",");
				
				if(s[2].equalsIgnoreCase("IT")) {
					double salary =Double.parseDouble(s[3]);
					s[3] = String.valueOf(salary * 1.10);
				}
				fw.write(String.join(",", s)+"\n");
 			}
			
			fw.close();
		}catch(Exception e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
}
