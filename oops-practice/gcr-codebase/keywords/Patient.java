package keywords;

public class Patient {
    // Static variable shared among all patients
    private static String hospitalName;
    private static int totalPatients = 0;

    // Instance variables
    private final String patientID; // Unique identifier
    private String name;
    private int age;
    private String ailment;

    // Constructor
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // Static method to set hospital name
    public static void setHospitalName(String name) {
        hospitalName = name;
    }

    // Static method to get total patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Method to display patient details
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("---------------------------");
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAilment() {
        return ailment;
    }

    public String getPatientID() {
        return patientID;
    }

    public static void main(String[] args) {
        // Set the hospital name
        Patient.setHospitalName("City Hospital");

        // Create patient instances
        Patient patient1 = new Patient("Lathika", 30, "Flu", "P001");
        Patient patient2 = new Patient("Lidiya", 45, "Fracture", "P002");
        Patient patient3 = new Patient("Rahul Sharma", 25, "Allergy", "P003");
        Patient patient4 = new Patient("Sneha Iyer", 38, "Diabetes", "P004");

        // Display total patients admitted
        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
        System.out.println();

        // Display patient details
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();
        patient3.displayPatientDetails();
        patient4.displayPatientDetails();
    }
}
