package AddressBook.src.main.java.service;


import java.util.*;

import model.AddressBook;
import model.ContactPerson;


public class AddressBookSystem {

    private Map<String, AddressBook> addressBooks = new HashMap<>();


    public void addAddressBook(String name) {
        addressBooks.putIfAbsent(name, new AddressBook(name));
    }

    public AddressBook getAddressBook(String name) {
        return addressBooks.get(name);
    }


    public List<ContactPerson> searchByCityOrState(String value) {
        List<ContactPerson> result = new ArrayList<>();

        for (AddressBook book : addressBooks.values()) {
            for (ContactPerson person : book.getContacts()) {
                if (person.getCity().equalsIgnoreCase(value)|| person.getState().equalsIgnoreCase(value)) {
                    result.add(person);
                }
            }
        }
        return result;
    }
}
