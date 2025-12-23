//Write a program to calculate various trigonometric functions using Math class given an angle in degrees
//Hint => 
//Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
//public double[] calculateTrigonometricFunctions(double angle)


package methods;
import java.util.*;

public class CalculateTrignometricFunctions {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter  the angle : \n");
		
		double angle= sc.nextDouble();
		double[] results = calculateTrigonometricFunctions(angle);
		
		System.out.println("Angle: " + angle + " degrees");
		System.out.println("Sine: " + results[0]);
		System.out.println("Cosine: " + results[1]);
		System.out.println("Tangent: " + results[2]);

		
		
		
	}
	 public static double[] calculateTrigonometricFunctions(double angle) {
	        // Convert degrees to radians
	        double radians = Math.toRadians(angle);

	        // Calculate trigonometric values
	        double sine = Math.sin(radians);
	        double cosine = Math.cos(radians);
	        double tangent = Math.tan(radians);

	        // Store results in an array
	        return new double[]{sine, cosine, tangent};
	    }
}
