//An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
//Hint => 
//Take user input for 3 sides of a triangle 
//The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
//Write a Method to compute the number of rounds user needs to do to complete 5km run

package methods;
import java.util.*;
public class AthleteRun {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Sides of the Triangle \n");
		
		
		System.out.print("Enter the first Side \n");
		int side1=sc.nextInt();
		System.out.print("Enter the second Side\n");
		int side2=sc.nextInt();
		System.out.print("Enter the third Side\n");
		int side3=sc.nextInt();
		
		Rounds(side1, side2 , side3);
		
		
	}
	public static void Rounds(int side1, int side2 , int side3) {
		System.out.print("No. of Rounds to complete 5KM run is :"+ 5.0/(side1+side2+side3));
		
		
	}
}
