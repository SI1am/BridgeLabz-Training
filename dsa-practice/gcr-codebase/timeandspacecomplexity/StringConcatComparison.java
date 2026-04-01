package timeandspacecomplexity;


import java.util.*;
public class StringConcatComparison {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	System.out.print("Enter the number of concatinations : \n");
        int num= sc.nextInt();
        long start, end;


        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i< num; i++) sb.append("Hello");
        end = System.nanoTime();
        System.out.println("StringBuilder Time: "+(end-start)/1_000_000.0 +" ms");
        

        start = System.nanoTime();
        StringBuffer sB = new StringBuffer();
        for (int i = 0;i< num; i++) sB.append("Hello");
        end = System.nanoTime();
        System.out.println("StringBuffer Time: "+(end-start)/1_000_000.0+" ms");
        
        
        start = System.nanoTime();
        String s = "";
        for (int i = 0;i< num; i++)  s+="Hello";
        end = System.nanoTime();
        System.out.println("String Time: "+(end-start)/1_000_000.0 +" ms");
    }
}
