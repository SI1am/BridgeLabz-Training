//Write a program calculate the wind chill temperature given the temperature and wind speed
//Hint => 
//Write a method to calculate the wind chill temperature using the formula 
//windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16 
//public double calculateWindChill(double temperature, double windSpeed)

package methods;
import java.util.*;
public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the Tempeature: \n");
		double temprature=sc.nextDouble();
		
		System.out.print("Enter the wind speed: \n");
		double windSpeed=sc.nextDouble();
		
		double ans=calculateWindChill(temprature,windSpeed);
		System.out.print("\nThe Wind Chill Temperature is: "+ ans);

	}
	public  static double calculateWindChill(double temperature, double windSpeed) {
		double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) *Math.pow(windSpeed,0.16); 
		return windChill;
	}

}
