// package TransportationManagement;

public class TaxiService implements TransportServices{
	int totalSeats;
	int availableSeats;
	double price;
	String destination;
	String currentLocation;
	
	public TaxiService(int totalSeats, int availableSeats,double price, String destination,String currentLocation) {
		this.availableSeats=availableSeats;
		this.currentLocation=currentLocation;
		this.price=price;
		this.destination=destination;
		this.totalSeats=totalSeats;
		
	}
	public String getCurrentLocation() { return currentLocation; }
    public String getDestination() { return destination; }
    public double getPrice() { return price; }
    public int getAvailableSeats() { return availableSeats; }


}
