//Problem 3: Vehicle Registration
//Create a Vehicle class to manage the details of vehicles:
//Instance Variables: ownerName, vehicleType.
//Class Variable: registrationFee (fixed for all vehicles).
//Methods:
//An instance method displayVehicleDetails() to display owner and vehicle details.
//A class method updateRegistrationFee() to change the registration fee.


package instancesAccessModifiers;

import java.util.Scanner;

class Vehicle {
	
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000;
    

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
    	
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter new registration fee: ");
        double fees=sc.nextDouble();
        updateRegistrationFee(fees);
        sc.nextLine();


        System.out.print("Enter owner name: ");
        String owner = sc.nextLine();
        System.out.print("Enter vehicle type: ");
        String type = sc.nextLine();

        Vehicle vehicle = new Vehicle(owner, type);
        vehicle.displayVehicleDetails();
    }
}
