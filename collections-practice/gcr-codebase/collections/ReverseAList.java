package collections;

import java.util.Scanner;

public class ReverseAList {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        
        int[] arr= new int[n];
        System.out.println("Enter array elements: ");
        for( int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int [] rev= reverse(arr,n);
        
        for( int i=0; i<n; i++){
            
        System.out.println(rev[i]);
        }



    }
    public static int[] reverse(int[] arr,int n){
        int i=0, size=n-1;
        while(i<size){
            int temp=arr[i];
            arr[i]=arr[size];
            arr[size]=temp;
            i++;
            size--;
        }
        return arr;
    }
    
}
