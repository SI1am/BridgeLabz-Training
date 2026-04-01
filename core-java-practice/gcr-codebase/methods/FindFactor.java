//Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results
//Hint => 
//Take the input for a number
//Write a static Method to find the factors of the number and save them in an array and return the array. 
//To find factors and save to array will have two loops. The first loop to find the count and initialize the array with the count. And the second loop save the factors into the array
//Write a method to find the sum of the factors using factors array
//Write a method to find the product of the factors using factors array
//Write a method to find the sum of square of the factors using Math.pow() method


package methods;
import java.util.*;
public class FindFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a  number \n");
		int number = sc.nextInt();
		int factors[] =findFactors(number);
		int factorSum=findSum(factors);
		int squareFactors[]=findSquare(factors);
		int squareFactorSum=findSum(squareFactors);
		int product=findProduct(factors);
		
		System.out.println("Factors: "+Arrays.toString(factors));
		System.out.println("Factor Sum :"+factorSum);
//		System.out.println("Square Factors"Arrays.toString(squareFactors));
		System.out.println("Square Factors Sum:"+squareFactorSum);
		System.out.println("Square Factors products: "+product );
				
				

	}
	public static int[] findFactors(int num) {
		int count=0;
		for(int i=1; i<=num;i++) {
			if(num%i==0) count++;
			
		}
		int ans[]=new int[count];
		count=0;
		for(int i=1; i<=num;i++) {
			if(num%i==0) {
				ans[count++]=i;
			}
			
		}
		return ans;
	}
	
	public static int[] findSquare(int [] num) {
		
		int ans[]=new int[num.length];
		int count=0;
		for(int i=0; i<num.length;i++) {
			ans[i]=num[i]*num[i];
			
		}
		return ans;
	}
	
	public static int findSum(int[] nums) {
		int ans=0;
		for(int i=0; i<nums.length;i++) {
			ans+=nums[i];
			
		}
		return ans;
	}
	
	public static int findProduct(int[] nums) {
		int ans=1;
		for(int i=0; i<nums.length;i++) {
			ans*=nums[i];
			
		}
		return ans;
	}
	

}
