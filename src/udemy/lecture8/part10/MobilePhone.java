package udemy.lecture8.part10;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contactList;

    public MobilePhone() {
        contactList = new ArrayList<>();
    }

    public void printContactList() {
        System.out.println("You have " + contactList.size() + " contacts in your contact list.");
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println((i + 1) + ". " + contactList.get(i).getName() + ": " +
                    contactList.get(i).getPhoneNumber());
        }
    }

    public void addContact(String name, String phoneNumber) {
        if (findContact(name) == -1) {
            contactList.add(new Contact(name, phoneNumber));
            System.out.println("Contact added.");
        } else {
            System.out.println("Contact with the name " + name + " already exists.");
        }
    }

    public void updateContact(String oldName, String newName, String newPhoneNumber) {
        if (findContact(newName) >= 0) {
            System.out.println("Cannot update. Contact with this name already exists.");
            return;
        }

        int contactNo = findContact(oldName);
        if (contactNo >= 0) {
            contactList.set(contactNo, new Contact(newName, newPhoneNumber));
            System.out.println("Contact has been updated.");
        } else {
            System.out.println("Unable to update. Contact not found.");
        }
    }

    public void removeContact(String name) {
        int contactNo = findContact(name);
        if (contactNo >= 0) {
            contactList.remove(contactNo);
            System.out.println(name + " has been removed from the contact list.");
        } else {
            System.out.println("Unable to remove. " + name + " is not in the contact list.");
        }
    }

    public void searchForContact(String name) {
        int contactNo = findContact(name);
        if (contactNo >= 0) {
            System.out.println(name + " found in the contact list. Phone number is: " +
                    contactList.get(contactNo).getPhoneNumber());
        } else {
            System.out.println(name + " is not in the contact list.");
        }
    }

    private int findContact(String name) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
