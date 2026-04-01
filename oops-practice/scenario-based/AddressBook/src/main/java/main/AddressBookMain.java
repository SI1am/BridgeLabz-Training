package AddressBook.src.main.java.main;


import java.util.*;

import AddressBook.src.main.java.model.AddressBook;
import AddressBook.src.main.java.model.ContactPerson;
import AddressBook.src.main.java.service.AddressBookSystem;

public class AddressBookMain {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book Program");

        AddressBookSystem system = new AddressBookSystem();


        system.addAddressBook("Personal");
        system.addAddressBook("Office");
//Demo Data to see some parts woriking 
        AddressBook personal = system.getAddressBook("Personal");
        AddressBook office = system.getAddressBook("Office");
    	 personal.addContact(new ContactPerson(
                 "Shivam", "Singh", "Rohini",
                 "Delhi", "Delhi", "110001",
                 "9999999999", "shivam@mail.com"
         ));

         personal.addContact(new ContactPerson(
                 "Aman", "Verma", "Sector 62",
                 "Noida", "UP", "201301",
                 "8888888888", "aman@mail.com"
         ));

         personal.addContact(new ContactPerson(
                 "Riya", "Sharma", "Lajpat Nagar",
                 "Delhi", "Delhi", "110024",
                 "7777777777", "riya@mail.com"
         ));

         office.addContact(new ContactPerson(
                 "Karan", "Mehta", "Indiranagar",
                 "Bangalore", "Karnataka", "560038",
                 "6666666666", "karan@office.com"
         ));

         office.addContact(new ContactPerson(
                 "Neha", "Gupta", "MG Road",
                 "Pune", "Maharashtra", "411001",
                 "5555555555", "neha@office.com"
         ));

         office.addContact(new ContactPerson(
                 "Arjun", "Patel", "Satellite",
                 "Ahmedabad", "Gujarat", "380015",
                 "4444444444", "arjun@office.com"
         ));



         System.out.println("\nSearch Person by City or State");
         System.out.print("Enter City or State: ");
         String input = sc.nextLine();

         List<ContactPerson> result = system.searchByCityOrState(input);

         System.out.println("\nSearch Result:");
         if (result.isEmpty()) {
             System.out.println("No contacts found for: " + input);
         } else {
             result.forEach(System.out::println);
         }

         sc.close();
     }
 }
