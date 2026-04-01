package csvHandling;

import java.io.*;
public class EmployeeSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line;
		
		try(BufferedReader br = new BufferedReader (new FileReader("E:/flutter/csvHandling/src/csvhandling/csvFiles/employee.csv"))){
			
			br.readLine();
			while((line=br.readLine())!=null) {
				String[] s = line.split(",");
				if(s[1].equals("Amit")) {
					System.out.println("Department: "+s[2]+ ", Salary: "+s[3]);
				}
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
