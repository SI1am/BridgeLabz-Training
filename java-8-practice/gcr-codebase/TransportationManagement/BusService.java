package TransportationManagement;

public class BusService implements GeoUtils ,TransportServices{
	int totalSeats;
	int availableSeats;
	double price;
	String destination;
	String currentLocation;
	
	public BusService(int totalSeats, int availableSeats,double price, String destination,String currentLocation) {
		this.availableSeats=availableSeats;
		this.currentLocation=currentLocation;
		this.price=price;
		this.destination=destination;
		this.totalSeats=totalSeats;
		
	}
	
	

}
