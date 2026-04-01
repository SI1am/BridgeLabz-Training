import java.util.*;

public class StringBufferConcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            buffer.append(sc.nextLine());
        }

        System.out.println("Concatenated String: " + buffer.toString());
    }
}
