// package javafeatures;

import java.util.*;

//Coustum exception for our flights if invalid fligths mentionned 
class InvalidFlightException extends Exception {
	public InvalidFlightException(String message) {
		super(message);
	}
	
}

class FlightUtility{
	public boolean validateFlightNumber(String flightnumber) throws InvalidFlightException{
		
		if(!flightnumber.matches("FL-[1-9][0-9]{3}$")){
			
			throw new InvalidFlightException("The flight number " + flightnumber + " is invalid");
		}
		return true;
		
	}
	
	public boolean validateFlightName(String flightName) throws InvalidFlightException {

        if (!(flightName.equals("SpiceJet") ||flightName.equals("Vistara") ||flightName.equals("IndiGo") ||flightName.equals("Air Arabia"))) {

            throw new InvalidFlightException("The flight name " + flightName + " is invalid");
        }
        return true;
    }
	
	 public boolean validatePassengerCount(int passengerCount,String flightName) throws InvalidFlightException {

	        int maxCapacity;

	        switch (flightName) {
	            case "SpiceJet":
	                maxCapacity = 396;
	                break;
	            case "Vistara":
	                maxCapacity = 615;
	                break;
	            case "IndiGo":
	                maxCapacity = 230;
	                break;
	            case "Air Arabia":
	                maxCapacity = 130;
	                break;
	            default:
	                throw new InvalidFlightException("The flight name "+ flightName +" is invalid");
	        }

	        if (passengerCount <= 0 || passengerCount > maxCapacity) {
	            throw new InvalidFlightException("The passenger count " + passengerCount +" is invalid for " + flightName);
	        }

	        return true;
	    }

	    public double calculateFuelToFillTank(String flightName,double currentFuelLevel) throws InvalidFlightException {

	        double maxFuel;

	        switch (flightName) {
	            case "SpiceJet":
	                maxFuel = 200000;
	                break;
	            case "Vistara":
	                maxFuel = 300000;
	                break;
	            case "IndiGo":
	                maxFuel = 250000;
	                break;
	            case "Air Arabia":
	                maxFuel = 150000;
	                break;
	            default:
	                throw new InvalidFlightException("Invalid fuel level for " + flightName);
	        }

	        if (currentFuelLevel < 0 || currentFuelLevel > maxFuel) {
	            throw new InvalidFlightException("Invalid fuel level for " + flightName);
	        }  

	        return maxFuel - currentFuelLevel;
	    }
	

}
public class AeroVigil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FlightUtility fu= new FlightUtility();

        System.out.println("Enter flight details");

        try {
            String input = sc.nextLine();
            String[] details = input.split(":");

            String flightNumber = details[0];
            String flightName = details[1];
            int passengerCount = Integer.parseInt(details[2]);
            double fuelLevel = Double.parseDouble(details[3]);

            fu.validateFlightNumber(flightNumber);
            fu.validateFlightName(flightName);
            fu.validatePassengerCount(passengerCount, flightName);

            double fuelRequired =fu.calculateFuelToFillTank(flightName, fuelLevel);

            System.out.println("Fuel required to fill the tank: " +fuelRequired + " liters");

        }catch (InvalidFlightException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


	}

}
