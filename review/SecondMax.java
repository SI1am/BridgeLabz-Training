package review;
import java.util.*;
public class SecondMax {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the array size: ");
		int n= sc.nextInt();
		
		int[] prices= new int[n];
		
		System.out.println("Enter array element:");
		for(int i=0; i< n; i++) 
			prices[i]=sc.nextInt();
		
//		int f=0;
//		int s=0;
//		for(int i=0; i<n; i++) {
//			if(prices[i]>f){
//				f=prices[i];
//				
//			}
//			if(prices[i]>s && s!=f) {
//				s=prices[i];
//			}
//		}
//		
		PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->b-a);
		
		for(int i=0; i<n; i++){
			pq.offer(prices[i]);
		}
		
		pq.poll();
//		
		System.out.println("the second largest element is: " +pq.poll());
	}

}
