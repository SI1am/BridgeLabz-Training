//Convert a Java object (Car) into JSON format.

package Json.JSON;

import org.json.JSONObject;

//import java.util.Scanner;
class Car{
	String carName;
	String carNumber;
	String fuelType;
	
	public Car(String carName, String carNumber, String fuelType) {
		this.carName=carName;
		this.carNumber=carNumber;
		this.fuelType = fuelType;
		
	}
}
public class CarJsonData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);
		Car car= new Car("Honda Civic","T123H","Diesel");
		JSONObject json = new JSONObject();
		json.put("Car Name: ", car.carName);
		json.put("Car Number: ", car.carNumber);
		json.put("Fuel Type", car.fuelType);

		System.out.println(json.toString(1));
		
		
		
	}

}
