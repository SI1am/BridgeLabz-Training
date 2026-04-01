package csvHandling;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Rowcount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String line;
		int rowCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("E:/flutter/csvHandling/src/csvhandling/csvFiles/students.csv"))) {
            while((line=br.readLine())!= null) {
                rowCount++;
            }
            System.out.println("Total number of rows: " + (rowCount - 1));
        }catch(IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
	}

}
