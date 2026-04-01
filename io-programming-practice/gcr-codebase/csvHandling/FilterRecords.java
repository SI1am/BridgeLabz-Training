//Filter Records from CSV
//Read a CSV file and filter students who have scored more than 80 marks.
//Print only the qualifying records.


package csvHandling;
import java.io.*;
import java.util.Arrays;
public class FilterRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        try (BufferedReader br = new BufferedReader(new FileReader("E:/flutter/csvHandling/src/csvhandling/csvFiles/students.csv"))) {
        	String line;
        	br.readLine();
            while ((line = br.readLine()) != null) {
                String[] s= line.split("\\t");
                if (Integer.parseInt(s[3]) > 50) {
                    System.out.println("Name: "+s[1]+", Marks: "+s[3]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
