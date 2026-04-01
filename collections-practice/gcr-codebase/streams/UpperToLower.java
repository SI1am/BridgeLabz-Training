import java.io.*;

public class UpperToLower {
    public static void main(String[] args) {

        try  {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("lowercase_output.txt"));
            
            int ch;
            while ((ch = br.read()) != -1) {
                bw.write(Character.toLowerCase((char) ch));
            }

            System.out.println("Conversion completed.");

            br.close();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
