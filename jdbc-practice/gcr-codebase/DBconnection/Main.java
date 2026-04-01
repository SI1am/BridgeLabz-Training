package DBconnection;

import java.util.Date;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {

        PatientDAO patientDAO = new PatientDAO();


        Patient p1 = new Patient("Shivam", new Date(),
                "9876543210", "shivam@email.com",
                "Delhi", "O+");

        Patient p2 = new Patient("Amit", new Date(),
                "9876543211", "amit@email.com",
                "Mumbai", "A+");

        Patient p3 = new Patient("Suhan", new Date(),
                "9876543212", "suhan@email.com",
                "Pune", "B+");

        patientDAO.registerPatient(p1);
        patientDAO.registerPatient(p2);
        patientDAO.registerPatient(p3);

        System.out.println("Demo patients added successfully!");



        patientDAO.getAllPatients();
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter New Patient Details");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Phone: ");
        String phone = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Address: ");
        String address = sc.nextLine();

        System.out.print("Blood Group: ");
        String bloodGroup = sc.nextLine();


        Date dob = new Date();

        Patient userPatient = new Patient(name, dob, phone, email, address, bloodGroup);

        patientDAO.registerPatient(userPatient);

        System.out.println("User patient added successfully!");

        sc.close();
    }
}
