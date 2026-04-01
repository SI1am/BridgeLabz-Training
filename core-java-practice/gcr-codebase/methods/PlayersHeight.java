//Create a program to find the shortest, tallest, and mean height of players present in a football team.
//Hint => 
//The formula to calculate the mean is: mean = sum of all elements/number of elements
//Create an int array named heights of size 11 and get 3 digits random height in cms for each player in the range 150 cms to 250 cms
//Write the method to Find the sum of all the elements present in the array.
//Write the method to find the mean height of the players on the football team
//Write the method to find the shortest height of the players on the football team 
//Write the method to find the tallest height of the players on the football team
//Finally display the results


package methods;
import java.util.*;
public class PlayersHeight {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] heights=new int[11];
		System.out.println("Enter the heights of 11 players between 150cm to 250cm "); 
		for(int i=0; i<11;i++) {
			
			System.out.println("Enter the height of player "+(i+1)); 
			heights[i]=sc.nextInt();
		}
		int heightSum=FindFactor.findSum(heights);
		double meanHeight= heightSum/11.0;
		int shortest=findShortest(heights);
		int tallest=findTallest(heights);
		System.out.println("Sum of heights : " +heightSum);
		System.out.println("Mean of heights: "+meanHeight);
		System.out.println("Shortest : "+shortest);
		System.out.println("Tallest : " + tallest);
		
		
	}
	public static int findTallest(int[] heights) {
		int max=0;
		for(int i=0; i<heights.length;i++) {
			if(max<heights[i]) max=heights[i];
		}
		return max;
	}
	
	public static int findShortest(int[] heights) {
		int min=0;
		for(int i=0; i<heights.length;i++) {
			if(min>heights[i]) min=heights[i];
		}
		return min;
	}

}
