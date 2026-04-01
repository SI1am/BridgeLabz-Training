package Level1;
import java.util.Scanner;

public class PerimeterToSides {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the perimeter of the square: ");
		int perimeter=input.nextInt();
		System.out.println("The length of the side is "+ perimeter/4 + " whose perimeter is "+perimeter);
		
	}
}
