package review;

import java.util.*;
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of tickets: ");
		int n= sc.nextInt();
		
		int[] prices= new int[n];
		
		System.out.println("Enter ticket prices:");
		for(int i=0; i< n; i++) 
			prices[i]=sc.nextInt();
		
		Sort(prices , 0, n-1);
		
		System.out.println("Sorted ticket prices:");
		
		for (int price : prices) 
            System.out.print(price + " ");
		
		sc.close();
		
	}
	public static void Sort(int[] arr ,int low, int high) {
		if(low<high) {
			 
			int pivot = partition(arr, low , high);
			Sort(arr, low, pivot-1);
			Sort(arr,pivot+1,high);
		}
	}
	
	public static int partition(int[] arr , int low, int high) {
		
		int pivot= arr[high];
		int i=low-1;
		
		for(int j=low; j<high;j++) {
			if(arr[j]<pivot) {
				int temp = arr[++i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		

		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
		
	}

}
