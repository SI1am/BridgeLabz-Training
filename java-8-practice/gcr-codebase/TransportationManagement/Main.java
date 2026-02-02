// package TransportationManagement;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        List<BusService> buses = Arrays.asList(
            new BusService(50,10,450,"Agra","Delhi"),
            new BusService(50,15,110,"Agra","Mathura"),
            new BusService(50,20,70,"Agra","Hanthras"),
            new BusService(50,13,450,"Delhi","Agra"),
            new BusService(50,12,110,"Mathura","Agra"),
            new BusService(50,29,70,"Mathura","Hanthras")
        );

        List<MetroService> metros = Arrays.asList(
            new MetroService(500,200,300,"Agra","Delhi"),
            new MetroService(500,150,80,"Agra","Noida"),
            new MetroService(500,12,30,"Noida","Gaziabad"),
            new MetroService(500,13,90,"Gaziabad","Delhi"),
            new MetroService(500,23,130,"Agra","Mathura")
        );

        List<TaxiService> taxis = Arrays.asList(
            new TaxiService(4,2,300,"Agra","Delhi"),
            new TaxiService(4,2,90,"Agra","Mathura"),
            new TaxiService(4,2,450,"Mathura","Delhi"),
            new TaxiService(4,2,500,"Noida","Delhi"),
            new TaxiService(4,1,200,"Agra","Mainpuri")
        );

        boolean continueJourney = true;

        while (continueJourney) {

            System.out.println("\nChoose Mode of Transport");
            System.out.println("1. Bus\n2. Metro\n3. Taxi");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bookService(buses);
                    break;
                case 2:
                    bookService(metros);
                    break;
                case 3:
                    bookService(taxis);
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.print("\nDo you want to extend your journey? (yes/no): ");
            continueJourney = sc.next().equalsIgnoreCase("yes");
        }

        System.out.println("\nJourney Completed. Safe travels ");
    }


    private static <T extends TransportServices> void bookService(List<T> services) {

        System.out.println("\nAvailable Services:");
        IntStream.range(0, services.size()).forEach(i -> {
                System.out.print((i + 1) + ". ");
                services.get(i).printServiceDetails();
                System.out.println();
                });

        System.out.print("\nSelect service: ");
        int serviceChoice = sc.nextInt() - 1;

        System.out.print("Number of tickets: ");
        int tickets = sc.nextInt();

        FareCalculator fareCalculator = (price, count) -> price * count;

        T selected = services.get(serviceChoice);
        double totalFare = fareCalculator.calculateFare(selected.getPrice(), tickets);

        System.out.print("Return journey? (yes/no): ");
        String choice = sc.next();
        if (choice.equalsIgnoreCase("yes")) {
            totalFare *= 2;
        }

        System.out.println("\nBooking Successful");
        System.out.println("Total Fare: ₹" + totalFare);
    }
}
