// package TransportationManagement;

public interface TransportServices {
	String getCurrentLocation();
    String getDestination();
    double getPrice();
    int getAvailableSeats();

    default void printServiceDetails() {
        System.out.println(getClass().getSimpleName() + "  From: " + getCurrentLocation() +" -> To: " + getDestination() +" | Price: " + getPrice() +" | Seats: " + getAvailableSeats());
    }
}
