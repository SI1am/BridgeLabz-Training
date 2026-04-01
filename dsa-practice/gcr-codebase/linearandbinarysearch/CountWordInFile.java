import java.io.*;
import java.util.Scanner;

public class CountWordInFile {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word to search: ");
        String target = sc.next();

        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line;
        int count = 0;


        while ((line = br.readLine()) != null) {

            String[] words = line.split("\\s+");

            for (String word : words) {
                if (word.equalsIgnoreCase(target)) {
                    count++;
                }
            }
        }
        

        System.out.println("Word count: " + count);
    }
}
