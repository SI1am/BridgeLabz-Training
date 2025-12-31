//Vehicle and Transport System
//Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are subclasses with unique attributes.
//Tasks:
//Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
//Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
//Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
//Goal: Understand how inheritance helps in organizing shared and unique features across subclasses and use polymorphism for dynamic method calls.


package inheritance;
import java.util.*;

class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " \nFuel: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int speed, String fuel, int seats) {
        super(speed, fuel);
        this.seatCapacity = seats;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int load;

    Truck(int speed, String fuel, int load) {
        super(speed, fuel);
        this.load = load;
    }

    @Override    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + load);
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(int speed, String fuel) {
        super(speed, fuel);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Motorcycle");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Vehicle Details");
    	
    	System.out.println("Enter Vehicle type: \n1.Car:  \n2.Truck:  \n3.Motor Cycle: ");
    	int choice=sc.nextInt();
    	
    	Vehicle vehicle;
    	
    	if(choice==1) {
    		System.out.println("Enter Max speed for the Car:");
    		int speed=sc.nextInt();
    		System.out.println("Enter Fuel Type for the Car:");
    		String fuel=sc.next();
    		System.out.println("Enter number of seats for the Car:");
    		int seats=sc.nextInt();
    		vehicle=new Car(speed, fuel,seats);
    		
    	}
    	else if(choice==3) {
    		System.out.println("Enter Max speed for Bike:");
    		int speed=sc.nextInt();
    		System.out.println("Enter Fuel Type for Bike :");
    		String fuel=sc.next();
    		vehicle=new Motorcycle(speed, fuel);
    		
    	}
    	else if(choice==2) {
    		System.out.println("Enter Max speed: ");
    		int speed=sc.nextInt();
    		System.out.println("Enter Fuel Type: ");
    		String fuel=sc.next();
    		System.out.println("Enter Load");
    		int load=sc.nextInt();
    		vehicle=new Truck(speed, fuel,load );
    		
    	}
    	else {
    		vehicle=new Vehicle(100,"Petrol");
    	}
    	vehicle.displayInfo();
    	
    	System.out.println();
    	System.out.println("**********Default Details***********");
        Vehicle[] vehicles = {
            new Car(180, "Petrol", 5),
            new Truck(120, "Diesel", 2000),
            new Motorcycle(150, "Petrol")
        };
        
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println();
        }
    }
}
