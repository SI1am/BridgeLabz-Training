package implementingInterface;

interface VehicleDashboard {

    void displaySpeed();
    default void displayBattery() {
        System.out.println("Battery information not available");
    }
}

class PetrolCar implements VehicleDashboard {
	@Override
    public void displaySpeed() {
        System.out.println("Speed: 72 km/h");
    }
}

class ElectricCar implements VehicleDashboard {

	@Override
    public void displaySpeed() {
        System.out.println("Speed: 84 km/h");
    }

    @Override
    public void displayBattery() {
        System.out.println("Battery: 69%");
    }
}


public class Vehicals {
	public static void main(String[] args) {
		
		VehicleDashboard petrolCar = new PetrolCar();
		VehicleDashboard electricCar = new ElectricCar();
		
		petrolCar.displaySpeed();
		petrolCar.displayBattery();
		
		electricCar.displaySpeed();
		electricCar.displayBattery();
	}

}
