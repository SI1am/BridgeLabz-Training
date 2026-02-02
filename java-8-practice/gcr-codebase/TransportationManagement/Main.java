package TransportationManagement;

import java.util.*;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<BusService> bus  = Arrays.asList(
				new BusService(50, 10, 450, "Agra", "Delhi"),
				new BusService(50, 15, 110, "Agra", "Mathura"),
				new BusService(50, 12, 300, "Mathura", "Delhi"),
				new BusService(50, 16, 450, "Delhi", "Agra"),
				new BusService(50, 18, 110, "Mathura", "Agra"),
				new BusService(50, 2, 450, "Delhi", "Mathura"),
				new BusService(50, 20, 70, "Agra", "Hanthras")
				);
		List<MetroService> metro  = Arrays.asList(
				new MetroService(50, 10, 450, "Agra", "Delhi"),
				new MetroService(50, 15, 110, "Agra", "Mathura"),
				new MetroService(50, 12, 300, "Mathura", "Delhi"),
				new MetroService(50, 16, 450, "Delhi", "Agra"),
				new MetroService(50, 18, 110, "Mathura", "Agra"),
				new MetroService(50, 2, 450, "Delhi", "Mathura"),
				new MetroService(50, 20, 70, "Agra", "Hanthras")
				);
		List<TaxiService> taxi  = Arrays.asList(
				new TaxiService(50, 10, 450, "Agra", "Delhi"),
				new TaxiService(50, 15, 110, "Agra", "Mathura"),
				new TaxiService(50, 12, 300, "Mathura", "Delhi"),
				new TaxiService(50, 16, 450, "Delhi", "Agra"),
				new TaxiService(50, 18, 110, "Mathura", "Agra"),
				new TaxiService(50, 2, 450, "Delhi", "Mathura"),
				new TaxiService(50, 20, 70, "Agra", "Hanthras")
				);
		
		System.out.println("Choose Your mode of Transportation: \n1. Metro: \n2. Bus: \n3. Taxi: ");
		
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			metro.stream().sorted();
		}
	}

}


