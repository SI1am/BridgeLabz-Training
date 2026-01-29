package implementingInterface;

interface Vehical{
	void rentVehical();
	void returnVehical();
}

class Bus implements Vehical {
	
	@Override
	public void rentVehical() {
		// TODO Auto-generated method stub
		System.out.println("Bus Rented at 5000 perday");
		
	}

	@Override
	public void returnVehical() {
		// TODO Auto-generated method stub
		System.out.println("Bus Returned");
		
	}
	
}

class Car implements Vehical {
	
	@Override
	public void rentVehical() {
		// TODO Auto-generated method stub
		System.out.println("Car Rented at 3000 perday");
		
	}
	
	@Override
	public void returnVehical() {
		// TODO Auto-generated method stub
		System.out.println("Car Returned");
		
	}
	
}

class Bike implements Vehical {
	
	@Override
	public void rentVehical() {
		// TODO Auto-generated method stub
		System.out.println("Bike Rented at 2000 perday");
		
	}
	
	@Override
	public void returnVehical() {
		// TODO Auto-generated method stub
		System.out.println("Bike Returned");
		
	}
	
}

public class VehicalRental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehical car = new Car();
		Vehical bus = new Bus();
		Vehical bike = new Bike();
		
		System.out.println("**********************");
		car.rentVehical();
		car.returnVehical();
		
		System.out.println("**********************");
		bus.rentVehical();
		bus.returnVehical();
		
		System.out.println("**********************");
		bike.rentVehical();
		bike.returnVehical();
		

	}

}
