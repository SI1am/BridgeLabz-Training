package exceptions;

import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        System.out.println("=== File Reading Program ===");

        try {
            FileReader fileReader = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fileReader);

            String line;
            System.out.println("File contents:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
