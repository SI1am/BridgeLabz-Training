package implementingInterface;

interface UnitConverter {

    static double kmToMiles(double km) {
        return km*0.621371;
    }

    static double kgToPounds(double kg) {
        return kg*2.20462;
    }
}

public class UnitConversion {

	public static void main(String[] args) {

        double distanceKm = 10;
        double weightKg = 5;

        System.out.println("Miles: " + UnitConverter.kmToMiles(distanceKm));
        System.out.println("Pounds: " + UnitConverter.kgToPounds(weightKg));
    }
}
