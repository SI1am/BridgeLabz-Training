package Level1;
import java.util.Scanner;
public class AreaOfTriangle {
	public static void main (String args[]) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the height of the Triangle :");
		int height=input.nextInt();
		System.out.println("Enter the base of the Triangle :");
		int base=input.nextInt();
		System.out.println("Your Area of Tiangle is: " + (base*height*0.5));
		
	}

}
