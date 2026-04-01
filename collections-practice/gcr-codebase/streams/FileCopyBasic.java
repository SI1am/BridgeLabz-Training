import java.io.*;

public class FileCopyBasic {
    public static void main(String[] args) {
        //here we are taking input from a file named input.txt and we will save our copied file in output.txt
        File sourceFile = new File("input.txt");
        File destFile = new File("output.txt");

        //checks availability of file  here we already have a file
        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        

        try {
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destFile);
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully.");
            fis.close();
            fos.close();

        } catch (IOException e) {
            System.out.println("Error while copying file: " + e.getMessage());
        }
       

        
    }
}
