package timeandspacecomplexity;
import java.util.*;

public class SearchComparison {
    public static int binarySearchMethod(int[] arr, int target) {
    int left = 0;
    int right = arr.length-1;

    while(left<=right){
        int mid = left + (right - left)/2; //avoids overflow

        if (arr[mid] == target) {
            return mid;
            
        } 
        else if (arr[mid] < target) {
            left = mid + 1; 
            
        } 
        else {
            right = mid - 1; 
        }
    }
    return -1; 
}

    public static void linearSearch(int[] arr, int target) {

        long start = System.nanoTime();

        for(int x : arr){
            if(x == target) break;

        }
        long end = System.nanoTime();//this line of code will help us get time

        System.out.println("Linear Search Time: " + (end - start) / 1_000_000.0 + " ms");
    }

    public static void binarySearch(int[] arr, int target) {
        Arrays.sort(arr); //sorts array before searching 
        
        long start = System.nanoTime();
        int ans=binarySearchMethod(arr, target);

        long end = System.nanoTime();

        System.out.println("Binary Search Time: "+(end - start)/1_000_000.0 +" ms");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dataset size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0;i<n;i++) arr[i] = i;//this line of code automatically fill data for the arrays

        int target = n - 1;

        linearSearch(arr, target);
        binarySearch(arr, target);
    }
}
