package encapsulation;
import java.util.*;


interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}


abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}


class Truck extends Vehicle implements Insurable {
    private String policyNumber;

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 1000; // trucks have a loading surcharge
    }

    @Override
    public double calculateInsurance() {
        return 8000.0;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + maskPolicyNumber();
    }

    private String maskPolicyNumber() {
        return "****" + policyNumber.substring(policyNumber.length() - 4);
    }
}


class Car extends Vehicle implements Insurable {
    private String policyNumber;

    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 5000.0; // fixed insurance cost for car
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + maskPolicyNumber();
    }

    private String maskPolicyNumber() {
        return "****" + policyNumber.substring(policyNumber.length() - 4);
    }
}


class Bike extends Vehicle implements Insurable {
    private String policyNumber;

    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 1500.0;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + maskPolicyNumber();
    }

    private String maskPolicyNumber() {
        return "****" + policyNumber.substring(policyNumber.length() - 4);
    }
}



public class VehicleRental {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Vehicle> vehicles = new ArrayList<>();
		
		System.out.println("Enter the number of vehicles you want to add: ");
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("*********Vehicle #"+(i+1)+"**********");

			System.out.print("Enter Vehicle type \n1.Truck:  \n2.Car: \n3.Bike: ");
			int type = sc.nextInt();
			sc.nextLine(); 

			System.out.print("Enter Vehicle number: ");
			String vehiclenumber = sc.nextLine();

			System.out.print("Enter Vehicle Rental rate: ");
			double rent = sc.nextDouble();
			sc.nextLine();

			System.out.print("Enter Vehicle Policy Number: ");
			String policy = sc.nextLine();

			
			switch(type) {
				case 1:
					vehicles.add(new Truck(vehiclenumber, rent,policy));
					break;
				case 2:
					vehicles.add(new Car(vehiclenumber, rent,policy));
					break;
				case 3:
					vehicles.add(new Bike(vehiclenumber, rent,policy));
					break;
				default:
                    System.out.println("Invalid type. Try again.");
                    i--; // redo this iteration
			}
			
            
			
		}
		System.out.println();
        vehicles.add(new Car("MH12AB1234", 1500, "C1234567890"));
        vehicles.add(new Bike("UP32XY9876", 500, "B0987654321"));
        vehicles.add(new Truck("DL5CTR5678", 2500, "T5678901234"));

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle Type: " + v.getType());
            System.out.println("Vehicle No.: " + v.getVehicleNumber());
            System.out.println("Rental Cost for 5 days: ₹" + v.calculateRentalCost(5));

            if (v instanceof Insurable) {
                Insurable i = (Insurable) v;
                System.out.println(i.getInsuranceDetails());
                System.out.println("Insurance Cost: ₹" + i.calculateInsurance());
            }

            System.out.println("--------");
        }
    }

}
