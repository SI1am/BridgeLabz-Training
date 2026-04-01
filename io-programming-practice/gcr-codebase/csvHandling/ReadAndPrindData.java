package csvHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
public class ReadAndPrindData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (BufferedReader br= new BufferedReader (new FileReader("E:/flutter/csvHandling/src/csvhandling/csvFiles/students.csv"))){
			String line;
	        br.readLine();

	        while ((line = br.readLine()) != null) {
	            String[] s = line.split("\\t");
	            System.out.println("Id" + s[0]+ "\nName: "+s[1]+ "\nAge: "+s[2]+ "\nMarks: "+s[3]+"\n**************\n");
	            
	        }
			
		}catch(Exception e){
			
			System.out.println("File Reading Error");
			System.out.println(e.getMessage());
			
		}

	}

}
