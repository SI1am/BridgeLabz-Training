package csvHandling;
import java.io.*;
public class WriteCSV {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("E:/flutter/csvHandling/src/csvhandling/csvFiles/employee.csv");
        
        fw.write("ID,Name,Department,Salary\n");

        fw.write("1,Amit,IT,60000\n");
        fw.write("2,Shivam,HR,50000\n");
        fw.write("3,Rohan,Finance,70000\n");
        fw.write("4,Tanuj,IT,80000\n");
        fw.write("5,Dilip,Sales,55000\n");

        fw.close();
        System.out.println("CSV file written successfully");
    }
}
