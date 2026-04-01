package implementingInterface;

import java.util.function.Predicate;

public class TempratureAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Double> temprature = p-> p>40;
		
		System.out.println(temprature.test(48.5)); 
		if (temprature.test(48.5)) {
		    System.out.println("Temperature Alert!");
		}
		System.out.println(temprature.test(35.5)); 
		System.out.println(temprature.test(4.9)); 
		System.out.println(temprature.test(30.8)); 
	}

}
