package AddressBook.src.main.java.model;



import java.util.*;

public class AddressBook {

    private String name;
    private List<ContactPerson> contacts = new ArrayList<>();

    public AddressBook(String name) {
        this.name = name;
    }


    public boolean addContact(ContactPerson person) {
        if (contacts.contains(person)) {
            System.out.println("Duplicate contact not allowed.");
            return false;
        }
        contacts.add(person);
        return true;
    }


    public void editContact(String firstName, String lastName, ContactPerson updated) {
        deleteContact(firstName, lastName);
        addContact(updated);
    }


    public void deleteContact(String firstName, String lastName) {
        contacts.removeIf(p ->
                p.getFirstName().equalsIgnoreCase(firstName)
                        && p.getLastName().equalsIgnoreCase(lastName));
    }

    public List<ContactPerson> getContacts() {
        return contacts;
    }

    public String getName() {
        return name;
    }
}
