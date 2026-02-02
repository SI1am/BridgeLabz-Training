package TransportationManagement;

public class MetroService {
	int totalSeats;
	int availableSeats;
	double price;
	String destination;
	String currentLocation;
	
	public MetroService(int totalSeats, int availableSeats,double price, String destination,String currentLocation) {
		this.availableSeats=availableSeats;
		this.currentLocation=currentLocation;
		this.price=price;
		this.destination=destination;
		this.totalSeats=totalSeats;
		
	}

}
