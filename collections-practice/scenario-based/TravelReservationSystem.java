import java.util.List;
import java.util.*;

class Journey {
    String journeyCode;
    String origin;
    String destination;
    int availableSeats;

    Journey(String journeyCode, String origin, String destination, int availableSeats) {
        this.journeyCode = journeyCode;
        this.origin = origin;
        this.destination = destination;
        this.availableSeats = availableSeats;
    }

    @Override
    public String toString() {
        return "Journey Code: " + journeyCode +", From: " + origin+", To: " + destination +", Seats: " + availableSeats;
    }
}

public class TravelReservationSystem {
    private static Journey[] journeys = {

            new Journey("J101", "Delhi", "Mumbai", 5),
            new Journey("J102", "Delhi", "Bangalore", 3),
            new Journey("J103", "Mumbai", "Chennai", 4)

    };

    private static List<Journey> reservations = new ArrayList<>();

    public static void findJourneys(String origin, String destination) {
        boolean found = false;
        for (Journey journey : journeys) {
            if (journey.origin.equalsIgnoreCase(origin)
                    && journey.destination.equalsIgnoreCase(destination)) {
                System.out.println(journey);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No journeys found.");
        }
    }

    public static void reserveJourney(String journeyCode) {
        for (Journey journey : journeys) {
            if (journey.journeyCode.equalsIgnoreCase(journeyCode)) {
                if (journey.availableSeats > 0) {
                    reservations.add(journey);
                    journey.availableSeats--;
                    System.out.println("Journey reserved successfully!");
                } else {
                    System.out.println("No seats available.");
                }
                return;
            }
        }
        System.out.println("Invalid Journey Code.");
    }

    public static void displayReservations() {
        if (reservations.isEmpty()) {
            System.out.println("No reservations yet.");
            return;
        }
        System.out.println("Your Reservations:");
        for (Journey journey : reservations) {
            System.out.println(journey);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Search Journeys");
            System.out.println("2. Reserve Journey");
            System.out.println("3. View Reservations");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter origin: ");
                    String origin = input.nextLine();
                    System.out.print("Enter destination: ");
                    String destination = input.nextLine();
                    findJourneys(origin, destination);
                    break;

                case 2:
                    System.out.print("Enter Journey Code to reserve: ");
                    String journeyCode = input.nextLine();
                    reserveJourney(journeyCode);
                    break;
                case 3:
                    displayReservations();
                    break;
                case 4:
                    System.out.println("Thank you for using Travel Reservation System!");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
